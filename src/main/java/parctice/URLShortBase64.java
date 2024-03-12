package parctice;

public class URLShortBase64 {

	public static void main(String[] args) {
		System.out.println(URLShortBase64.encodeBAse64(200));
	}

	static String encodeBAse64(int counter) {
		String originalString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder stringBuilder = new StringBuilder();
		int currentValue = counter;
		while (currentValue > 62) {
			int q = currentValue / 62;
			int rem = currentValue % 62;
			currentValue = q;
			System.out.println("rem:"+rem);
			stringBuilder.append(originalString.charAt(rem));
		}
		return stringBuilder.toString();
	}
}
