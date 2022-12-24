package com.mertadali.javalearningbasic;

public class Loops {
    public static void main(String[] args){

        // for loop
        int[] myNumbers= {12,18,21,24};

        for (int i =0; i<myNumbers.length; i++){
            int x = myNumbers[i] / 3 * 5;
            //System.out.println(x);

        }
        for (int number : myNumbers){
           // System.out.println(number / 3 * 5); // aynı işlemi daha kısa şekilde yaptık.
        }
        for (int a= 0; a<10; a++){
            int b = a *10;
           // System.out.println(b);
        }

        // while loop
        int j = 0;
        while (j< 10){
            System.out.println("test");
            j = j+1; // yazmasaydık sonsuz döngüye girerdi


        }



    }
}
