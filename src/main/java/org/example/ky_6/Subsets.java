package org.example.ky_6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
    //https://www.codewars.com/kata/584703d76f6cf6ffc6000275/train/java
    public static  <T> long count(T[] elems) {
        long result = 0;
        Set<T> uniqueElems = new HashSet<>(List.of(elems));
        for(int i = 1; i<= uniqueElems.size(); i++){
            result+=formula(uniqueElems.size(), i);
        }
        return result;
    }


    private static long formula(int elementCount, int numberOfPlaces){
        long result = 1;
        if(elementCount == numberOfPlaces)
            return 1;
        for(int i = 1; i <= numberOfPlaces; i++){
           result = result * (elementCount - numberOfPlaces + i) / i ;
        }
        return result;
    }
}
