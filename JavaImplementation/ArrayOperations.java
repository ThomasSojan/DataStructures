package com.dataStructures;

import java.util.Arrays;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class ArrayOperations {
    Scanner sc = new Scanner(System.in);
    int index,value;



    void display(int[] numbers){

        System.out.println(Arrays.toString(numbers));
    }


    void traverse(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(" -> "+numbers[i]);

        }
    }

    void update(int[] numbers){

        System.out.print("Enter index : ");
        index = sc.nextInt();
        System.out.print("Enter Value : ");
        value = sc.nextInt();
        numbers[index] = value;
    }


    int[] delete(int[] numbers){
        System.out.print("Enter the index : ");
        index = sc.nextInt();
        int[] tempArray = new int[numbers.length-1];
        for(int i = 0 , k = 0 ;i < numbers.length;i++){
            if(i == index)
                continue;
            else
                tempArray[k] = numbers[i];
                k++;
        }
        return tempArray;

    }
    int[] insert(int[] numbers){
        int[] tempArray = new int[numbers.length + 1];
        System.out.print("Enter the index : ");
        index = sc.nextInt();
        System.out.print("Enter the value to be added : ");
        value = sc.nextInt();

        for(int i = 0;i< numbers.length+1;i++){

            if(i<index)
                tempArray[i] = numbers[i];
            else if(i == index)
                tempArray[i] = value;

            else
                tempArray[i] = numbers[i-1];
        }
        System.out.println(Arrays.toString(tempArray));
        return tempArray;

    }

    void  sortArray(int[] numbers){
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        int ch;
        //int[] numbers = new int[5];
        int[] numbers = {500,200,400,100,900};
        ArrayOperations array = new ArrayOperations();

        do{
            System.out.println("***** Array Operations *****");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Update");
            System.out.println("4: Traverse");
            System.out.println("5: Display");
            System.out.println("6: Sort");
            System.out.println("");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch){
                case 1: numbers = array.insert((numbers));
                        break;


                case 2:numbers = array.delete(numbers);
                        break;

                case 3:array.update(numbers);
                        break;

                case 4:array.traverse(numbers);
                       break;
                case 5:array.display(numbers);
                        break;
                case 6:array.sortArray(numbers);
                    break;
                default:
                    System.out.println("Invalid Entry !");
            }



        }while(true);






    }

}
