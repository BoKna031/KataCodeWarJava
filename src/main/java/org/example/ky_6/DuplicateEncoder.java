package org.example.ky_6;

import java.util.HashMap;

//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java
public class DuplicateEncoder {
    static String encode(String word){
        char[] letters = word.toUpperCase().toCharArray();
        HashMap<Character, Character> mapper = new HashMap<>();
        for (char key: letters) {
            Character value = mapper.get(key);
            if(value == null){
                mapper.put(key, '(');
            }else if(value == '('){
                mapper.put(key, ')');
            }
        }

        for (int i =0;i< letters.length;i++) {
            letters[i] = mapper.get(letters[i]);

        }
        return new String(letters);
    }
}
