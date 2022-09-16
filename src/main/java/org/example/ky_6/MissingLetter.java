package org.example.ky_6;

public class MissingLetter {
    //https://www.codewars.com/kata/5839edaa6754d6fec10000a2
    public char FindMissingLetter(char[] array){
        int resultAscii = array[0];

        for (char letter: array) {
            if(resultAscii != letter)
                break;
            resultAscii++;
        }

        return (char) resultAscii;
    }

}
