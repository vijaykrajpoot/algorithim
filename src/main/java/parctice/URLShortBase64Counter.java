package parctice;
import java.util.Random;


// Logic: hashes the input, converts the digest to binary, and groups the bits into Base64 characters to produce a compact token.
public class URLShortBase64Counter {

	public static void main(String[] args) {
			System.out.println("Final String:"+ URLShortBase64Counter.encodeBAse64(1324363883L));
	}
	static String encodeBAse64(long counter) {
		String originalString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder stringBuilder = new StringBuilder();
		long currentValue = counter;
		while (currentValue >= 62) {
			long q = currentValue / 62;
			int rem = (int) currentValue % 62;
			currentValue = q;
			System.out.println("rem:"+rem);
			stringBuilder.append(originalString.charAt(rem));
		}
		Random random=new Random();
		System.out.println("Before:"+ stringBuilder);
		while (stringBuilder.length() < 6) {
			stringBuilder.append(originalString.charAt(random.nextInt(62)));
		}
		return stringBuilder.toString();
	}
}
