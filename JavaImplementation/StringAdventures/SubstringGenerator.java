package com.stringOperations;




public class SubstringGenerator {
    public static String[] generateSubstring(String inputString){

        int counter = 0;
        int len = inputString.length();
        String[] substringArray = new String[len*len];
        for(int i = 0;i < len;i++){
            for(int j = i+1;j <= len;j++){

                substringArray[counter] = inputString.substring(i,j);
                counter++;

            }
        }

            return substringArray;

    }

}
