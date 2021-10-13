package homework.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        myAtoi(s);


    }
    public static int myAtoi(String s) {
        String digit = "";
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
            boolean flag = Character.isDigit(charArray[i]) || charArray[i] =='-';
            if(flag)
                digit = digit + charArray[i];
            if(int i = 0; i > -2^32 && i<2^32 -1){

            }
        }
        System.out.println(digit.replaceFirst ("^0*", ""));
        return 0;
    }
}