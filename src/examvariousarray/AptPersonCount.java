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
class AptPersonCount {

    public AptPersonCount() throws IOException{
        System.out.println("*******************");
        System.out.print("\n===============================\n");
        System.out.println("5층 아파트의 거주자 인원 파악하기");
        Scanner s = new Scanner(System.in);
        int a [][] = new int [5][3];

        int total = 0;
        
        int level1 = 0;
        int level2 = 0;
        int level3 = 0;
        int level4 = 0;
        int level5 = 0;
        
        int line1 = 0;
        int line2 = 0;
        int line3 = 0;
        
        for (int i=0; i <a.length; i++) {
            for (int j =0; j <a[i].length; j++) {
                System.out.printf("\n%d0%d호에 살고 있는 사람의 숫자 : ", i + 1, j+1);
                a[i][j] = s.nextInt();             
                   }  
          }
        
        for (int i=0; i <a.length; i++) {
            for (int j =0; j <a[i].length; j++) {
                total += a[i][j];
                }         
            } 
         System.out.printf("\n이 아파트의 거주자는 모두 %d 명 입니다.\n", total);
         
            for (int j =0; j < 3; j++) {
                level1 += a[0][j];
                level2 += a[1][j];
                level3 += a[2][j];
                level4 += a[3][j];
                level5 += a[4][j];
                }  
           
        System.out.printf("1층에 사는 거주주자는 총 %d 입니다.\n", level1);
        System.out.printf("2층에 사는 거주주자는 총 %d 입니다.\n", level2);
        System.out.printf("3층에 사는 거주주자는 총 %d 입니다.\n", level3);
        System.out.printf("4층에 사는 거주주자는 총 %d 입니다.\n", level4);
        System.out.printf("5층에 사는 거주주자는 총 %d 입니다.\n", level5);
        
        for (int i=0; i <a.length; i++) {
                line1 += a[i][0];
                line2 += a[i][1];
                line3 += a[i][2];          
            }  
        
        System.out.printf("1호 라인에 사는 거주주자는 총 %d 입니다.\n", line1);
        System.out.printf("2호 라인에 사는 거주주자는 총 %d 입니다.\n", line2);
        System.out.printf("1호 라인에 사는 거주주자는 총 %d 입니다.\n", line3);
    }
    
}
