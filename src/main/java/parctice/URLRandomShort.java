package parctice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Random;

public class URLRandomShort {
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int SHORT_URL_LENGTH = 6;

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Random random = new Random();
		HashSet<String> hashSet = new HashSet<>();
		StringBuilder stringBuilder = new StringBuilder();
		int cc = 0;
		while (cc < Integer.MAX_VALUE) {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(Long.toString(cc).getBytes());

			for (int i = 0; i < SHORT_URL_LENGTH; i++) {
				int idx = random.nextInt(CHARACTERS.length());
				stringBuilder.append(CHARACTERS.charAt(idx));
			}

			boolean added = hashSet.add( stringBuilder.toString());
		//	System.out.println(hashSet);
			if (!added) {
				System.out.println("Duplicate: ["+cc+"]: " + stringBuilder.toString());
			}
			stringBuilder.setLength(0);
			cc++;
		}
		System.out.println(hashSet);
	}


}
