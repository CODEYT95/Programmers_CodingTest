//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181905

package LV_0.DAY10;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char temp1;
        char temp2;
        char arr[] = my_string.toCharArray(); // char타입 arr 배열에 my_string문자열 넣어주기

        for (int i = s; i < e; i++) {// 값 바꿔주기

            if (i < e) {
                temp1 = arr[i];
                temp2 = arr[e];

                arr[i] = temp2;
                arr[e] = temp1;

                e--;
            }
        }

        for (int i = 0; i < my_string.length(); i++) {// answer에 값 옮겨주기

            answer += arr[i];

        }

        return answer;// 값 반환
    }
}