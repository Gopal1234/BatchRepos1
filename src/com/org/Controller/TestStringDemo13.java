package com.org.Controller;
import java.util.Scanner;
public class TestStringDemo13 {

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[5];
        System.out.println("enter 5 names");
        for(int i=0;i<names.length;i++) {
            names[i]=sc.nextLine();}
        for(int i=0;i<names.length;i++) {
             if(names[i].charAt(0)=='M'||(names[i].charAt(names[i].length()-1)=='a')){
                 System.out.println(names[i]);
             }
    }

 

}
}