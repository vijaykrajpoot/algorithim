package parctice;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Logic: hashes the input, converts the digest to binary, and groups the bits into Base64 characters to produce a compact token.
public class URLShortBase64MD5HashCounter {

    public static String generateBase64Hash(String input) {
        try {
            int shortURLLength = 6; // Use a short token length so the generated string stays compact and URL-friendly.
            int totalBitSegment = shortURLLength * 6; // Six Base64 characters are represented by 6 bits each, so this gives the total bit budget for the encoded output.
            String binaryString = generateMD5Hash(input); // Convert the input into a fixed-length MD5 binary digest so the output is deterministic and stable.
            if (totalBitSegment > 128) { // The MD5 digest is 128 bits, so a longer token than that would exceed the available entropy.
                throw new IllegalArgumentException("Shorter URL Length can't be more then 21");
            }
            StringBuilder base64StringBuilder = new StringBuilder(); // Build the final short URL token one encoded character at a time.
            for (int i = 0; i < totalBitSegment; i += 6) {
                String sixBits = binaryString.substring(i, Math.min(i + 6, binaryString.length())); // Extract a 6-bit chunk from the digest to map into a Base64 symbol.
                int decimalValue = Integer.parseInt(sixBits, 2); // Convert the 6-bit chunk into its numeric value so it can be mapped to a Base64 character.
                char base64Char = getBase64Character(decimalValue); // Translate the numeric chunk into a valid Base64 character.
                base64StringBuilder.append(base64Char); // Append the encoded character to the final short URL token.
            }
            return base64StringBuilder.toString(); // Return the compact Base64-based short URL representation.
        } catch (NoSuchAlgorithmException e) {
            return null; // If the MD5 algorithm is unavailable, fail gracefully rather than crashing the application.
        }
    }

    public static String generateMD5Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5"); // Use MD5 to produce a consistent hash for the input string.
        byte[] md5Bytes = md.digest(input.getBytes()); // Hash the input bytes into a fixed 128-bit digest.
        StringBuilder binaryString = new StringBuilder(); // Assemble the byte digest into a binary string for Base64 conversion.
        BigInteger bigInteger = new BigInteger(1, md5Bytes); // Interpret the digest bytes as an unsigned positive integer.
        String binaryStr = bigInteger.toString(2); // Convert the digest to a binary representation.
        System.out.println("binaryStr:" + binaryStr); // Print the raw binary form for debugging and verification.
        binaryString.append(binaryStr); // Append the binary digest to the builder.
        while (binaryString.length() < 128) {
            binaryString.insert(0, "0"); // Left-pad the binary digest so it stays at a constant 128 bits.
        }
        return binaryString.toString(); // Return the fixed-length digest suitable for grouping into Base64 chunks.
    }

    public static char getBase64Character(int decimalValue) {
        String base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"; // Define the valid Base64 alphabet used for URL-safe token generation.
        return base64Chars.charAt(decimalValue); // Map the 6-bit value to a valid Base64 character.
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentMap<String, Boolean> set = new ConcurrentHashMap<>(); // Track generated URL tokens in a thread-safe map to detect duplicates.
        String input = "https://example.com/"; // Use a stable base URL so each generated token is derived from the same source input.
        ExecutorService executorService = Executors.newFixedThreadPool(4); // Run multiple short-link-generation tasks concurrently to simulate many requests.
        int counter = 0; // Initialize the number of generation attempts.
        int totalURLCount = counter = 100; // Generate 100 short URLs in this sample run.
        while (counter-- != 0) {
            String inputWithNonSecond = input + System.nanoTime(); // Add a unique timestamp so each generated token is different even for the same base URL.
            executorService.execute(() -> {
                String base64 = generateBase64Hash(inputWithNonSecond); // Create a compact token for this unique input.
                System.out.println("base64 ShortURL:" + base64); // Print the generated short URL so the output is visible in the console.
                set.put(base64, true); // Store the token; duplicate tokens can be detected by checking map size later.
            });
        }
        executorService.shutdown(); // Tell the executor not to accept new tasks after the current batch is queued.
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // Wait until all tasks finish before printing the summary.
        System.out.println("Generated URLs: " + set.size()); // Display how many unique short URLs were produced.
        System.out.println("Duplicate URLs:" + (totalURLCount - set.size())); // Show how many duplicates were discarded during generation.
    }
}
