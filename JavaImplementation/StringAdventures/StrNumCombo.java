package com.stringOperations;

import java.util.Arrays;
import java.util.Scanner;

public class StrNumCombo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // System.out.println("Enter String");
       // String inputString = sc.next();

        String inputString = "aaabbaccccd";

        char[] charArray = new char[inputString.length()];

        for (int i = 0; i < inputString.length() ; i++) {
            charArray[i] = inputString.charAt(i);
        }


        int a = 0;
        for (int i = 0; i < charArray.length ; i = i+a) {
            int count  = 0;
            for (int j = i; j < charArray.length ; j++) {

                if(charArray[i] == charArray[j])
                    count++;
                else
                    break;

            }
            a = count;
            System.out.print(charArray[i]+""+count);

        }

    }
}
