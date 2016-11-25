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
class StudentScore {

    public StudentScore() throws IOException{
        System.out.println("*******************");
        System.out.print("\n5명의 국어, 영어, 수학 점수의 과목별총점 및\n" +"평균 구하기\n");
        System.out.print("===============================\n");
        Scanner s = new Scanner(System.in);
        float a [][] = new float [5][3];

        float total = 0;
        float kor =0;
        float eng =0;
        float math =0;
        
        for (int i=0; i <a.length; i++) {
            for (int j =0; j <a[i].length; j++) {
                System.out.printf("%d 학생 국어, 영어, 수학 : ", i + 1);
                a[i][j] = s.nextFloat();}               
            }  
        for (int i=0; i <a.length; i++) {
                kor += a[i][0];
                eng += a[i][1];
                math += a[i][2];          
            }  
        System.out.printf("국어 총점은 %f이고 , 평균은 %f 입니다.\n", kor, kor/5);
        System.out.printf("영어 총점은 %f이고 , 평균은 %f 입니다.\n", eng, eng/5);
        System.out.printf("수학 총점은 %f이고 , 평균은 %f 입니다.\n", math, math/5);
       
         for (int i=0; i <a.length; i++) {
             total = 0;
            for (int j =0; j <a[i].length; j++) {
                total += a[i][j];
                }  
            System.out.printf("%d 번째 학생의 총점은 %f, 평균은 %f 입니다.\n", i+1, total, total / 3);
            } 
    }
    
}
