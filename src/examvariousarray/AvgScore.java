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
class AvgScore {

    public AvgScore() throws IOException{
        System.out.println("*******************");
        System.out.print("\n===============================\n");
        Scanner s = new Scanner(System.in);
        float a [] = new float [10];

        float max = 0;
        float min = 999999999;
        float total =0;
        float avg = 0;
        float cal =0;
        
        for (int i=0; i <a.length; i++) {
            System.out.printf("%d 번째 심사점수 입력 : ", i + 1);
            a[i] = s.nextFloat();
            total += a[i];
            
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        
        cal =total - max- min;
        avg = cal /8;
        
        System.out.printf("max와 min 점수를 제외한 8개의 점수 평균은 %f 입니다. \n", avg);
    }
    
}
