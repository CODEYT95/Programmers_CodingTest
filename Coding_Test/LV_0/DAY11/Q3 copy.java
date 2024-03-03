//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181900

package LV_0.DAY11;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char arr[] = my_string.toCharArray(); // my_string char타입 배열로 만들어주기

        for (int i = 0; i < indices.length; i++) {// indices길이를 이용한 for문 생성

            arr[indices[i]] = '0';// indices[i]에 해당하는 arr값 '0' 으로 바꿔주기

        }

        for (char i : arr) {// arr배열의 값 for-each로 뽑기

            if (i != '0') {// i 가 문자'0'이 아닌 경우

                answer += i;// answer에 값 넣어주기

            }

        }

        return answer;// 값 반환
    }
}