////////////////////////////////////////////////////////////////////
// [Francesco] [Marcon] [2101070]
// [Alberto] [Reginato] [2110450]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException(
                "Numero inserito esterno al range [1-1000]");
        }

        int[]    values  = {1000,  900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
        String[] symbols = {"M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }
        return roman.toString();
    }
}
