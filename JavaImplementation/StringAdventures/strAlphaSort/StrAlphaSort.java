package com.sample.strAlphaSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StrAlphaSort {
    public static void main(String[] args) {
        File file = new File("/home/tomslee/IdeaProjects/DataStructures/src/com/sample/strAlphaSort/inputFile.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("filenotfound");
        }
        String word;
        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            word = sc.nextLine().toLowerCase();
            list.add(word);
        }
        System.out.println(list);
        String temp;
        for(int i = 0;i<list.size();i++){
            for(int j =i+1;j <list.size();j++){
                if (list.get(i).compareTo(list.get(j))>0)
                {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.print(list);
        file = new File("/home/tomslee/IdeaProjects/DataStructures/src/com/sample/strAlphaSort/outputFile.txt");
        try {
            FileWriter fw = new FileWriter(file);
            for(String item : list){
                fw.write(item);
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }

