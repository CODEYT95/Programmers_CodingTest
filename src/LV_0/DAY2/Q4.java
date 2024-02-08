//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181944

package LV_0.DAY2;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (1 <= n && n <= 1000) {
      if (n % 2 == 1) {
        System.out.println(n + " is odd");
      } else {
        System.out.println(n + " is even");
      }
    }
  }
}