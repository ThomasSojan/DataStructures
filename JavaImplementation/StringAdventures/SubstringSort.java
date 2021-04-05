package com.stringOperations;

import java.util.Arrays;


// Sorting based on String Length.
public class SubstringSort {
    public static String[] subStrSort(String[] subStrings){

        int len = subStrings.length;
        String temp;
        for(int i = 0;i <= len; i++){

            for(int j = i+1; j < len;j++){
                if(subStrings[j] == null){
                    break;
                }

                if(subStrings[i].length() < subStrings[j].length()){


                    temp = subStrings[i];
                    subStrings[i] = subStrings[j];
                    subStrings[j] = temp;
                }
                else{
                    continue;
                }
            }
        }

        return subStrings;
    }

}
