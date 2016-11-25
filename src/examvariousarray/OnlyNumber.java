/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examvariousarray;
import java.util.*;
import java.io.*;
/**
 *
 * @author RYUN
 */
class OnlyNumber {

    public OnlyNumber() throws IOException{
        System.out.println("*******************");
        System.out.print("\n===============================\n");
        Scanner s = new Scanner(System.in);
        int a [] = new int [10];
        int cp=99;

        System.out.println("1~100 사이의 숫자를 입력하세요");
        
        for (int i=0; i <a.length; i++) {
                System.out.printf("%d번째 숫자 : ", i+1 );
                a[i] = s.nextInt();   
                 cp = a[i];
               
            for (int j=0; j < i ; j++) {
                if (a[j] == cp) {
                    System.out.println("잘못 입력하였습니다. 다시 입력하세요");
                    i--;
                } 
          }                 
        }
        
        System.out.println("=================");
        
        for (int i=0; i<a.length; i++) {
            System.out.printf("%d번째 숫자는 %d 입니다. \n", i+1, a[i]);
        }
    }
    
}
