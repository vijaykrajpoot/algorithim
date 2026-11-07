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
            int shortURLLength = 6;
            int totalBitSegment = shortURLLength * 6;
            String binaryString = generateMD5Hash(input);
            if (totalBitSegment > 128) {
                throw new IllegalArgumentException("Shorter URL Length can't be more then 21");
            }
            StringBuilder base64StringBuilder = new StringBuilder();
            for (int i = 0; i < totalBitSegment; i += 6) {
                String sixBits = binaryString.substring(i, Math.min(i + 6, binaryString.length()));
                int decimalValue = Integer.parseInt(sixBits, 2);
                char base64Char = getBase64Character(decimalValue);
                base64StringBuilder.append(base64Char);
            }
            return base64StringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
    public static String generateMD5Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5Bytes = md.digest(input.getBytes());
        StringBuilder binaryString = new StringBuilder();
        BigInteger bigInteger = new BigInteger(1, md5Bytes);
        String binaryStr = bigInteger.toString(2);
        System.out.println("binaryStr:" + binaryStr);
        binaryString.append(binaryStr);
        while (binaryString.length() < 128) {
            binaryString.insert(0, "0");
        }
        return binaryString.toString();
    }
    public static char getBase64Character(int decimalValue) {
        String base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        return base64Chars.charAt(decimalValue);
    }
    public static void main(String[] args) throws InterruptedException {
        ConcurrentMap<String, Boolean> set = new ConcurrentHashMap<>();
        String input = "https::
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
        System.out.println("Generated URLs: " + set.size());
        System.out.println("Duplicate URLs:" + (totalURLCount - set.size()));
    }
}