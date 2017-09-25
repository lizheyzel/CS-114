package edu.ldsbc;

public class Main {

    public static void main(String[] args) {

        String str = "Hello";
        String str2 = "World";

        System.out.println(str + " " + str2);

        int i = 34;

        System.out.println(i);

        i++;
        i--;

        int j = 20;
        long l = 12345599911L;
        int k = (int)(i + l);

        System.out.println(i + j);

        float f = 234.6f;

        String strNum = "56";
        int iNum = 34;
        int myNewValFromStrNum = Integer.valueOf(strNum);

        int result = myNewValFromStrNum + iNum;
        int result2 = Integer.valueOf(strNum) + iNum;

    }
}
