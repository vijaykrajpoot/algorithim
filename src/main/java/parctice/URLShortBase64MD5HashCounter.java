package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.math.BigInteger; // Imports the classes needed to support this file's logic.
import java.security.MessageDigest; // Imports the classes needed to support this file's logic.
import java.security.NoSuchAlgorithmException; // Imports the classes needed to support this file's logic.
import java.util.HashSet; // Imports the classes needed to support this file's logic.
import java.util.Random; // Imports the classes needed to support this file's logic.
import java.util.Set; // Imports the classes needed to support this file's logic.
import java.util.concurrent.*; // Imports the classes needed to support this file's logic.

public class URLShortBase64MD5HashCounter { // Defines the Java type that contains the related data and behavior.
    public static String generateBase64Hash(String input) { // Defines the method that performs this unit of work for the class.
        try { // Attempts the guarded logic and prepares for possible failure.
            // Generate MD5 hash
            int shortURLLength = 6; // Stores the computed or supplied value in a variable for later use.
            int totalBitSegment = shortURLLength * 6; // Stores the computed or supplied value in a variable for later use.
            String binaryString = generateMD5Hash(input); // Stores the computed or supplied value in a variable for later use.
            if (totalBitSegment > 128) { // Checks whether the condition is true before taking the matching action.
                throw new IllegalArgumentException("Shorter URL Length can't be more then 21"); // Raises an exception to signal an invalid or unexpected condition.
            } // Closes the current block and ends the active scope.
            //System.out.println("binaryString:"+ binaryString);
            StringBuilder base64StringBuilder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
            for (int i = 0; i < totalBitSegment; i += 6) { // Repeats the loop body as long as the loop condition remains true.
                String sixBits = binaryString.substring(i, Math.min(i + 6, binaryString.length())); // Stores the computed or supplied value in a variable for later use.
                //System.out.println("sixBits:"+ sixBits);
                int decimalValue = Integer.parseInt(sixBits, 2); // Stores the computed or supplied value in a variable for later use.
                char base64Char = getBase64Character(decimalValue); // Stores the computed or supplied value in a variable for later use.
                base64StringBuilder.append(base64Char); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            //    System.out.println("shortURL:"+ base64StringBuilder);
            return base64StringBuilder.toString(); // Returns the computed value to the caller and exits the method.
        } catch (NoSuchAlgorithmException e) { // Closes the current block and ends the active scope.
            return null; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    public static String generateMD5Hash(String input) throws NoSuchAlgorithmException { // Carries out the current statement to support the program's logic.
        // Generate MD5 hash
        MessageDigest md = MessageDigest.getInstance("MD5"); // Stores the computed or supplied value in a variable for later use.
        byte[] md5Bytes = md.digest(input.getBytes()); // Stores the computed or supplied value in a variable for later use.

        // Convert MD5 bytes to binary string
        StringBuilder binaryString = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
//        for (byte b : md5Bytes) {
//            for (int i = 7; i >= 0; i--) {
//                binaryString.append((b >> i) & 1);
//            }
//        }
        BigInteger bigInteger = new BigInteger(1, md5Bytes); // Stores the computed or supplied value in a variable for later use.
        String binaryStr = bigInteger.toString(2); // Stores the computed or supplied value in a variable for later use.
        System.out.println("binaryStr:" + binaryStr); // Prints the result to the console so the current state can be inspected.
        // Ensure the binary string is 128 bits long
        binaryString.append(binaryStr); // Executes the current statement to update state or trigger the required behavior.
        while (binaryString.length() < 128) { // Keeps executing this block until the loop condition becomes false.
            binaryString.insert(0, "0"); // Pad with leading zeros if necessary // Carries out the current statement to support the program's logic.
        } // Closes the current block and ends the active scope.
        return binaryString.toString(); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public static char getBase64Character(int decimalValue) { // Defines the method that performs this unit of work for the class.
        // Base64 character array
        String base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"; // Stores the computed or supplied value in a variable for later use.
        // Map decimal value to Base64 character
        return base64Chars.charAt(decimalValue); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public static void main(String[] args) throws InterruptedException { // Carries out the current statement to support the program's logic.
        // Generate and print a Base64 hash
        ConcurrentMap<String, Boolean> set = new ConcurrentHashMap<>(); // Stores the computed or supplied value in a variable for later use.
        String input = "https:://www.google.com/maps/place/515+Zircon+Way,+Livermore,+CA+94550/@37.6707589,-121.8047173,17z/data=!3m1!4b1!4m6!3m5!1s0x808fe7e7aa1b4231:0x50a65a61a1f0f065!8m2!3d37.6707589!4d-121.8021424!16s%2Fg%2F11cpg9pddp?entry=ttu"; // Stores the computed or supplied value in a variable for later use.

        ExecutorService executorService = Executors.newFixedThreadPool(4); // Stores the computed or supplied value in a variable for later use.
        int counter = 0; // Stores the computed or supplied value in a variable for later use.
        int totalURLCount = counter = 100; // Stores the computed or supplied value in a variable for later use.
        while (counter-- != 0) { // Keeps executing this block until the loop condition becomes false.
            String inputWithNonSecond = input + System.nanoTime(); // Stores the computed or supplied value in a variable for later use.
            executorService.execute(() -> { // Carries out the current statement to support the program's logic.
                String base64 = generateBase64Hash(inputWithNonSecond); // Stores the computed or supplied value in a variable for later use.
                System.out.println("base64 ShortURL:" + base64); // Prints the result to the console so the current state can be inspected.
                set.put(base64, true); // Executes the current statement to update state or trigger the required behavior.
            }); // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        executorService.shutdown(); // Executes the current statement to update state or trigger the required behavior.
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // Executes the current statement to update state or trigger the required behavior.
        // Output results
        System.out.println("Generated URLs: " + set.size()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Duplicate URLs:" + (totalURLCount - set.size())); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
