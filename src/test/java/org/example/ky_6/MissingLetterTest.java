package org.example.ky_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingLetterTest {
    @Test
    public void kataExample1(){
        MissingLetter missingLetter = new MissingLetter();
        char[] letters = new char[] { 'a','b','c','d','f' };
        assertEquals('e', missingLetter.FindMissingLetter(letters));
    }

    @Test
    public void kataExample2(){
        MissingLetter missingLetter = new MissingLetter();
        char[] letters = new char[] { 'O','Q','R','S' };
        assertEquals('P', missingLetter.FindMissingLetter(letters));
    }
}