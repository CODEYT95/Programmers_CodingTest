//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181949

package LV_0.DAY1;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    int length = a.length(); // 문자열 길이 int 타입변환
    String result = ""; // String타입 result 변수 선언

    if (1 <= length && length <= 20) { // 문자열 길이 제한사항
      for (char i : a.toCharArray()) { // Char타입으로 한 문자씩 뜯으면서 저장
        if (Character.isLowerCase(i)) { // 소문자인지 확인하는 조건

          result += Character.toUpperCase(i); // 소문자가 맞으면 대문자로 변환해서 result에 저장

        } else {

          result += Character.toLowerCase(i); // 대문자면 소문자로 변환해서 result에 저장
        }
      }
    }
    System.out.println(result);
  }
}