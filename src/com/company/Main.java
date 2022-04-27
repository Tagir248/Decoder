package com.company;

public class Main {

    public static void main(String[] args) {
        char ch1 = 'l';
        char ch2 = 'm';
        char ch3 = 'y';
        System.out.println (decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {
        String result = "";
        switch (ch) {
            case 'h':
                result = "Hello!";
                break;
            case 'i':
            case 'm':
            case 'k':
                result ="I can decode";
                break;
            case 'b':
                result = "Bye";
                break;
            default:
                result = ("I don't know there symbols");
        }
        return result;
    }
}

