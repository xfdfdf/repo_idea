package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     int i = Integer.MAX_VALUE - 100000;
     while(i > 0){
         i++;
         if(5 == i) {
             break;
         } else {
             System.out.println(i);
         }
     }

    }


}
