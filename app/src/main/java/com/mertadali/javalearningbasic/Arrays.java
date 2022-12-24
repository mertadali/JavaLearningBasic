package com.mertadali.javalearningbasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
        String[] myStringArray = new String[3];
        myStringArray[0] = "James";
        myStringArray[1] = "Heisenberg";
        myStringArray[2] = "Kirk";
        System.out.println(myStringArray[1]);
        //Bu halde değerleri çekmeyecektir o yüzden çağırmalıyız.
        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 20;
        System.out.println(myIntegerArray[1]);
        // eger dizileri elle girmek istersek {} şeklinde yazabiliriz.
        int[] myNumberArray = {0,1,2,3};
        System.out.println(myNumberArray[2]);

        // List: kavramı gene aynı şekilde bizden herhangi bir sayı istemeksizin dizi oluşturmamıza yarar.

        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size());

        //Set:
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");// eğer ki iki kez james kullansaydık veriyi yazdırmayacaktı.
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap: Burada index yerine bir anahtar kelime ve onunla alakalı bir nesne belirliyoruz.
        HashMap<String,String> myHashMap = new HashMap<String,String>();
        myHashMap.put("name","James");
        myHashMap.put("hero","avatar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("hero"));

        HashMap<String,Integer> mySecondMap = new HashMap<String,Integer>();
        mySecondMap.put("run",100);
        mySecondMap.put("jump", 150);
        System.out.println(mySecondMap.get("run"));





    }

}
