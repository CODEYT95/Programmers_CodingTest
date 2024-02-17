//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181932

package LV_0.DAY5;

class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        int length = code.length();
        int mode = 0;

        if (1 <= length && length <= 100000) {// 길이 제한사항

            for (int idx = 0; idx < code.length(); idx++) {// for문 생성

                if (mode == 0) {// mode가 0일 때
                    if (code.charAt(idx) != '1' && idx % 2 == 0) {// code의 idx번째 문자가 1이 아닐 때 와 idx가 짝수일 때

                        ret += code.charAt(idx); // answer에 값 넣어주기

                    } else if (code.charAt(idx) == '1') {// code의 idx번째 문자가 1이 맞을 때

                        mode = 1; // mode의 값을 1로 변경
                    }
                } else {// mode가 1일 때
                    if (code.charAt(idx) != '1' && idx % 2 == 1) {// code의 idx번째 문자가 1이 아닐 때 와 idx가 홀수일 때

                        ret += code.charAt(idx);

                    } else if (code.charAt(idx) == '1') {// code의 idx번째 문자가 1이 맞을 때

                        mode = 0;// mode의 값을 0로 변경
                    }
                }
            }
            if (ret == "") {
                ret = "EMPTY";
            }
        }
        answer = ret;
        return answer;
    }
}