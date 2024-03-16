package parctice;

import java.util.HashMap;
import java.util.Map;

public class BaseX {

    public static Map<Integer, String> generateTable(int base) {
        Map<Integer, String> table = new HashMap<>();
        for (int i = 0; i < base; i++) {
            String binary = Integer.toBinaryString(i);
            String paddedBinary = String.format("%10s", binary).replace(' ', '0');
            table.put(i, paddedBinary);
        }
        return table;
    }

    public static void printTable(Map<Integer, String> table) {
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            int value = entry.getKey();
            String binary = entry.getValue();
            char symbol = (char) value;
            System.out.println(symbol + ": " + binary);
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> table = generateTable(64);
        printTable(table);
    }
}
