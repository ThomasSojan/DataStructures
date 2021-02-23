package com.stringOperations;

public class SubstringLRCheck {
    public static void lrCheck(String inputString){
        String leftString = inputString.substring(1)+inputString.substring(0,1);


        String rightString = inputString.substring(inputString.length()-1)+inputString.substring(0,inputString.length()-1);


        int result = leftString.compareTo(rightString);
        if(result == 0){
            System.out.println(inputString);
            System.exit(0);}
        else
            return;

    }
}
