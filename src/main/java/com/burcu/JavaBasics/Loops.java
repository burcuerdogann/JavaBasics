package com.burcu.JavaBasics;

public class Loops {

    public static void main (String[] args){

        //for loop

        int[] myNumbers = {12, 15, 18, 21, 24};
        /*
        for(int i = 0; i<myNumbers.length; i++){
            int x = myNumbers[i]/3*5;
            System.out.println(x);

        }

        int[] studentAges = {5,6,6,7,8,9};
        for (int i = 0; i<studentAges.length; i++){
            int y = studentAges[i]/1;
            System.out.println(y);
        }

        int[] floorNumber = {12, 14, 16, 18, 20};
        for (int i = 0; i<floorNumber.length; i++){
            int f = floorNumber[i]/2;
            System.out.println(f);
        }
        */
        for (int number : myNumbers){
            System.out.println(number / 3 * 5);
        }

        for (int a = 0; a<10; a++){
            int b = a*10;
            System.out.println(b);
        }

        //while

        int j = 0;
        while (j<10){
            int m = j*10;
            System.out.println(m);
            j++;
        }







    }
}
