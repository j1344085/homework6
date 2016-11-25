
package examvariousarray;

import java.util.*;
import java.io.*;

public class ExamVariousArray {

  
    public static void main(String[] args) throws IOException{
        while (true) {
            System.out.println("*******************");
            System.out.println(" 배열 사용하기 ");
            System.out.println("*******************");
            Scanner s = new Scanner(System.in);
            
            System.out.println("1. 두번째로 큰 수 찾기");
            System.out.println("2. 심사 점수 계산");
            System.out.println("3. 학생 총점, 평균값 구하기");
            System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
            System.out.println("5. 겹치지 않는 숫자 10개입력받기");
            System.out.println("6. 종료하기");
            System.out.print("원하는 메뉴는>> ");
            int menu = s.nextInt();

            switch (menu) 
            {
                case 1:
                    new SecondMax();
                    break;
                case 2:
                    new AvgScore();
                    break;
                case 3:
                    new StudentScore();
                    break;
                case 4:
                    new AptPersonCount();
                    break;
                case 5:
                    new OnlyNumber();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default :
                    System.out.print("잘못 입력하셨습니다.\n");
                    break;

            }  
        }
    }
    
}
