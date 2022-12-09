package com.trans;

import java.util.Scanner;

/**
 * @author yzy
 * @create 2022-09-17-20:19
 */
public class teststr {
    public static void main(String[] args) {
        Double[][] data=new Double[14][14];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 14; i++) {
            String s=in.nextLine();
            String[] s1 = s.split(" ");
            String[] s2=new String[14];
            for (int j = 0; j < s1.length; j++) {
                s2[j]=s1[j].trim();
            }
            for (int j = 0; j < 14; j++) {
                data[i][j]=Double.parseDouble(s2[j]);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                sb.append("["+i+","+j+","+data[i][j]+"],\n");
            }
        }
        System.out.println(sb);
    }
}