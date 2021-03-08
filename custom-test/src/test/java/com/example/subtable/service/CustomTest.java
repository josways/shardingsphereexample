package com.example.subtable.service;

import java.util.Scanner;

public class CustomTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            int m = str.indexOf("m");
            int s = str.indexOf("s");
            int ms = str.lastIndexOf("ms");

            String m1 = str.substring(0, m);
            String s1 = str.substring(m + 1, s);
            String ms1 = str.substring(s + 1, ms);

//        System.out.println(m1);
//        System.out.println(s1);
//        System.out.println(ms1);

            double second = Double.parseDouble(m1) * 60 + Double.parseDouble(s1) + Double.parseDouble("0." + ms1);

            System.err.println(second);
        }

    }

}
