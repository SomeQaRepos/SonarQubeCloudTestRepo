package org.example;

import java.util.List;

public class Main {
    static void bug(){
        for (int i = 0; i > 0; i++) {
            System.out.println("birol");
        }
    }
    static void bug2(){
        for (int i = 1; i < 0; i++) {
            System.out.println("birol");
        }
    }

    static void bug3(){
        List<String> list=null;
        //list.add("Birol");
        for (int i = 1; i < 0; i++) {
            list.get(i);
        }
    }

    static void bug4(){
        for (;;){
            System.out.println("birol");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public int arrayOfBoundError(){
        int[] numbers = {1, 2, 3, 4, 5};
        int value = numbers[10];
    }

    public String nullPoint(){
        String str = null;
        int length = str.length(); // NPE will occur because str has a null reference
        System.out.println("String Length: ".concat(length));
    }
}
