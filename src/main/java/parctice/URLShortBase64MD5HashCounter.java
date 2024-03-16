    package parctice;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;

public class URLShortBase64MD5HashCounter {
    public static String generateBase64Hash(String input) {
        try {
            // Generate MD5 hash
            int shortURLLength = 6;
            int totalBitSegment = shortURLLength * 6;
            String binaryString = generateMD5Hash(input);
            if (totalBitSegment > 128) {
                throw new IllegalArgumentException("Shorter URL Length can't be more then 21");
            }
            //System.out.println("binaryString:"+ binaryString);
            StringBuilder base64StringBuilder = new StringBuilder();
            for (int i = 0; i < totalBitSegment; i += 6) {
                String sixBits = binaryString.substring(i, Math.min(i + 6, binaryString.length()));
                //System.out.println("sixBits:"+ sixBits);
                int decimalValue = Integer.parseInt(sixBits, 2);
                char base64Char = getBase64Character(decimalValue);
                base64StringBuilder.append(base64Char);
            }
            //    System.out.println("shortURL:"+ base64StringBuilder);
            return base64StringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static String generateMD5Hash(String input) throws NoSuchAlgorithmException {
        // Generate MD5 hash
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5Bytes = md.digest(input.getBytes());

        // Convert MD5 bytes to binary string
        StringBuilder binaryString = new StringBuilder();
//        for (byte b : md5Bytes) {
//            for (int i = 7; i >= 0; i--) {
//                binaryString.append((b >> i) & 1);
//            }
//        }
         BigInteger bigInteger=new BigInteger(1,md5Bytes);
         String binaryStr= bigInteger.toString(2);
        System.out.println("binaryStr:"+ binaryStr);
        // Ensure the binary string is 128 bits long
        binaryString.append(binaryStr);
        while (binaryString.length() < 128) {
            binaryString.insert(0, "0"); // Pad with leading zeros if necessary
        }
        return binaryString.toString();
    }

    public static char getBase64Character(int decimalValue) {
        // Base64 character array
        String base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        // Map decimal value to Base64 character
        return base64Chars.charAt(decimalValue);
    }

    public static void main(String[] args) throws InterruptedException {
        // Generate and print a Base64 hash
        ConcurrentMap<String, Boolean> set = new ConcurrentHashMap<>();
        String input = "https:://www.google.com/maps/place/515+Zircon+Way,+Livermore,+CA+94550/@37.6707589,-121.8047173,17z/data=!3m1!4b1!4m6!3m5!1s0x808fe7e7aa1b4231:0x50a65a61a1f0f065!8m2!3d37.6707589!4d-121.8021424!16s%2Fg%2F11cpg9pddp?entry=ttu";

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        int counter = 0;
        int totalURLCount = counter = 100;
        while (counter-- != 0) {
            String inputWithNonSecond = input + System.nanoTime();
            executorService.execute(() -> {
                String base64 = generateBase64Hash(inputWithNonSecond);
                System.out.println("base64 ShortURL:" + base64);
                set.put(base64, true);
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        // Output results
        System.out.println("Generated URLs: " + set.size());
        System.out.println("Duplicate URLs:" + (totalURLCount - set.size()));
    }
}
