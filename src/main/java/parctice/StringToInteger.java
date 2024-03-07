package parctice;


/**
 * @author vkumar1 created on 4/26/21
 */
public class StringToInteger {
    public static void main(String[] args) {
        int intNum = stringToInteger("121212");
        System.out.println(intNum);
    }


    static int stringToInteger(String str) {
        int intNumber = 0;

        char[] chArr = str.toCharArray();
        int multiplier = 10;
        for (char c : chArr) {
            int number = c - '0';
            intNumber = number + (multiplier * intNumber);
        }
        return intNumber;
    }

}
