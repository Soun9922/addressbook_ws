package com.bl.addressbook;

import java.util.Scanner;

public class InputUtil {
    private final static Scanner sc = new Scanner(System.in);
    public static long getIntValue(){
        return sc.nextLong();
    }
    public static String getStringValue(){
        return sc.next();
    }
}
