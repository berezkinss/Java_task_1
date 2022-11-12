package com.company;

public class Main {

    public static void main(String[] args) {
        int stud = 0X7868;
        long number = 89521177267L;
        int dvach =  0b1000011;
        int vosmach = 016143;
        int ost = 3;
        int foramtedost = ost % 26 + 1;
        char asciiChar = (char)(foramtedost + 64);

        String formattedNumber1 = String.format("%06d", stud);
        System.out.println(formattedNumber1);
        System.out.println(number);
        System.out.println(dvach);
        System.out.println(vosmach);
        System.out.println(foramtedost);
        System.out.println(asciiChar);
    }
}
