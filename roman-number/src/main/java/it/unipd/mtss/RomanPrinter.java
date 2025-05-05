////////////////////////////////////////////////////////////////////
// [Francesco] [Marcon] [2101070]
// [Alberto] [Reginato] [2110450]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    private static final String SYMBOLS = "MDCLXVI";

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();

        String[][] asciiLetters = {
            { 
              "  __  __ ", "  _____  ", "   _____ ", "  _      ",
              " __   __", " __      __", "  _____ "
            },
            {
              " |  \\/  |", " |  __ \\ ", "  / ____|", " | |     ",
              " \\ \\ / /", " \\ \\    / /", " |_   _|"
            },
            {
              " | \\  / |", " | |  | |", " | |     ", " | |     ",
              "  \\ V / ", "  \\ \\  / /", "   | |  "
            },
            { 
              " | |\\/| |", " | |  | |", " | |     ", " | |     ",
              "   > <  ", "   \\ \\/ /", "   | |  "
            },
            { 
              " | |  | |", " | |__| |", " | |____ ", " | |____ ",
              "  / . \\ ", "    \\  /", "  _| |_ "
            },
            { 
              " |_|  |_|", " |_____/ ", "  \\_____|", " |______|",
              " /_/ \\_\\", "     \\/  ", " |_____|"
            }
        };

        for (int row = 0; row < asciiLetters.length; row++) {
            for (char c : romanNumber.toCharArray()) {
                int idx = SYMBOLS.indexOf(c);
                if (idx >= 0) {
                    asciiArt.append(asciiLetters[row][idx])
                            .append("  "); 
                } else {
                    int width = asciiLetters[row][0].length();
                    asciiArt.append(" ".repeat(width)).append("  ");
                }
            }
            asciiArt.append(System.lineSeparator());
        }

        return asciiArt.toString();
    }
}
