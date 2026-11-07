package parctice;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
public class URLUniqueKeyGeneratorCrypto {
	public static void main(String[] args) {
		try {
			String uniqueKey = generateUniqueKey();
			System.out.println("Generated unique key: " + uniqueKey);
			String base64EncodedKey = encodeToBase64(uniqueKey);
			System.out.println("Base64 encoded key: " + base64EncodedKey);
			String sixCharacterKey = base64EncodedKey.substring(0, 6);
			System.out.println("Generated 6-character key: " + sixCharacterKey);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("SHA-256 algorithm not available.");
		}
	}
	public static String generateUniqueKey() throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(Long.toString(System.nanoTime()).getBytes());
		System.out.println("hash:"+ Arrays.toString(hash));
		System.out.println("Length:"+hash.length);
		String str=bytesToHex(hash);
		System.out.println("Hex String:"+ str);
		return str;
	}
	public static String encodeToBase64(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}
	public static String bytesToHex(byte[] bytes) {
		StringBuilder result = new StringBuilder();
		for (byte b : bytes) {
			result.append(String.format("%02x", b));
		}
		return result.toString();
	}
}