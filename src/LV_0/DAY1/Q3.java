package LV_0;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    String repeat = str.repeat(n); // 문자열 반복 메소드
    int length = str.length(); // 문자열 str의길이를 int로 타입 변환

    if (1 <= length && length <= 10 && 1 <= n && n <= 5) { // 제한사항 조건

      System.out.println(repeat);
    }
  }
}