package org.example.ky_6;

// https://www.codewars.com/kata/6375587af84854823ccd0e90
public class BlockLetterPrinter {

    private static String[] letterRows = {
            " AAA  BBBB   CCC  DDDD  EEEEE FFFFF  GGG  H   H IIIII JJJJJ K   K L     M   M N   N  OOO  PPPP   QQQ  RRRR   SSS  TTTTT U   U V   V W   W X   X Y   Y ZZZZZ ",
            "A   A B   B C   C D   D E     F     G   G H   H   I       J K  K  L     MM MM NN  N O   O P   P Q   Q R   R S   S   T   U   U V   V W   W X   X Y   Y     Z ",
            "A   A B   B C     D   D E     F     G     H   H   I       J K K   L     M M M N   N O   O P   P Q   Q R   R S       T   U   U V   V W   W  X X   Y Y     Z  ",
            "AAAAA BBBB  C     D   D EEEEE FFFFF G GGG HHHHH   I       J KK    L     M   M N N N O   O PPPP  Q   Q RRRR   SSS    T   U   U V   V W W W   X     Y     Z   ",
            "A   A B   B C     D   D E     F     G   G H   H   I       J K K   L     M   M N   N O   O P     Q Q Q R R       S   T   U   U V   V W W W  X X    Y    Z    ",
            "A   A B   B C   C D   D E     F     G   G H   H   I       J K  K  L     M   M N  NN O   O P     Q  QQ R  R  S   S   T   U   U  V V  W W W X   X   Y   Z     ",
            "A   A BBBB   CCC  DDDD  EEEEE F      GGG  H   H IIIII JJJJ  K   K LLLLL M   M N   N  OOO  P      QQQQ R   R  SSS    T    UUU    V    W W  X   X   Y   ZZZZZ ",
    };

    private static int base = 5;

    public static String getRowOfLetter(char ch, int row){
        if(ch == ' ')
            return "     ";
        StringBuilder sb = new StringBuilder();
        int letterIndex = ch - 'A';
        int start = letterIndex * (base + 1); // adding 1 because there is a space between letters
        return letterRows[row].substring(start, start + base);
    }
    public static String blockPrint(String string){
        string = string.trim();
        if (string.equals(""))
            return string;
        string = string.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(int row = 0; row < letterRows.length; row++) {
            for (int i = 0; i < string.length(); i++) {
                String ext = (i == string.length() - 1)? "\n" : " ";
                String letterRow = getRowOfLetter(string.charAt(i), row);
                String value = (i == string.length() - 1)? rightTrim(letterRow) : letterRow;
                sb.append(value + ext);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private static String rightTrim(String input) {
        int length = input.length();
        int endIndex = length;

        while (endIndex > 0 && Character.isWhitespace(input.charAt(endIndex - 1))) {
            endIndex--;
        }

        return input.substring(0, endIndex);
    }
}
