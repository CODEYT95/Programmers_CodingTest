//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181946

package LV_0.DAY2;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    int length1 = a.length();
    int length2 = b.length();

    if (1 <= length1 && length1 <= 10 && 1 <= length2 && length2 <= 10) {
      System.out.print(a);
      System.out.print(b);

    }
  }
}