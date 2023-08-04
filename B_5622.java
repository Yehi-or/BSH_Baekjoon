package Backjoon;

import java.util.Scanner;

public class B_5622 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        char[] c_arr = new char[s.length()];
        int cnt = 0;
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            c_arr[i] = s.charAt(i);
        }

        for(int i=0; i<s.length(); i++) {
            String str = String.valueOf(c_arr[i]);
                switch (str) {
                    case "A" :
                    case "B" :
                    case "C" :
                        cnt = 3;
                        break;
                    case "D" :
                    case "E" :
                    case "F" :
                        cnt = 4;
                        break;
                    case "G" :
                    case "H" :
                    case "I" :
                        cnt = 5;
                        break;
                    case "J" :
                    case "K" :
                    case "L" :
                        cnt = 6;
                        break;
                    case "M" :
                    case "N" :
                    case "O" :
                        cnt = 7;
                        break;
                    case "P" :
                    case "Q" :
                    case "R" :
                    case "S" :
                        cnt = 8;
                        break;
                    case "T" :
                    case "U" :
                    case "V" :
                        cnt = 9;
                        break;
                    case "W" :
                    case "X" :
                    case "Y" :
                    case "Z" :
                        cnt = 10;
                        break;
                }
                sum += cnt;
            }
        System.out.println(sum);
        }
    }

