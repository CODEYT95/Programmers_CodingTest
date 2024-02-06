//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181951

package LV_0;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(-100000 <= a && a <= 100000){ //a의 제한사항
            if(-100000 <= b && b <= 100000){ //b의 제한사항

              System.out.println("a = " + a);
	            System.out.println("b = " + b);

            }
        }
        
    }
}
