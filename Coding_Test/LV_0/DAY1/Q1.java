//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181952

package LV_0;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int length = a.length(); // 배열의 길이를 int로 타입 변환

        if (1 <= length && length <= 1000000) { // int로 바꾼 배열의 길이로 제한사항 1 ≤ str의 길이 ≤ 1,000,000
            System.out.println(a);
        }
    }
}