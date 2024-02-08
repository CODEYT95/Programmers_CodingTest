//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181947

package LV_0.DAY2;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (1 <= a && a <= 100 && 1 <= b && b <= 100) {// 제한사항

      System.out.println(a + " + " + b + " = " + (a + b));
    }
  }
}
