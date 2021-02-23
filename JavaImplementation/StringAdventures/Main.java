package com.stringOperations;


import java.util.Arrays;
import java.util.Scanner;

import static com.stringOperations.SubstringGenerator.generateSubstring;
import static com.stringOperations.SubstringSort.subStrSort;
import static com.stringOperations.SubstringLRCheck.lrCheck;

public class Main {
    public static void main(String args[]){
        System.out.print("Enter String:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String[] substringArray = generateSubstring(inputString);
        String[] sortedSubstringArray = subStrSort(substringArray);
        //System.out.println(Arrays.toString(sortedSubstringArray));
        for(int i = 0;i< sortedSubstringArray.length;i++) {
            lrCheck(sortedSubstringArray[i]);
        }

    }
}
