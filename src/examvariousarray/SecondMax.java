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
class SecondMax {

    public SecondMax() throws IOException{
        System.out.println("*******************");
        System.out.print("\n10개의 숫자를 입력받아 배열에 저장하고\n" + "두번째로 큰 수를 출력하라 \n");
        System.out.print("===============================\n");
        Scanner s = new Scanner(System.in);
        int a [] = new int [10];
        
        int max = a [0];
        int secondmax = max;
        
        for (int i=0; i <a.length; i++) {
            System.out.printf("%d 번째 수를 입력하세요 : ", i + 1);
            a[i] = s.nextInt();
            
            if ( a[i] > max) {
                secondmax = max;    //최대값을 갱신전 이전 최대값
                max = a[i];           //최대값  갱신
            }
            else if ((a[i] > secondmax && a[i] < max) || max == secondmax) {
                secondmax = a[i];
            }      
        }
         System.out.printf("2번째로 큰 수는 : %d \n", secondmax);
    }
    
}
