//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181943

package LV_0.DAY2;

class Solution {
  public String solution(String my_string, String overwrite_string, int s) {
    String answer = "";

    int myLength = my_string.length(); // 10 , 14
    int overLength = overwrite_string.length(); // 7 , 7

    String substring1 = my_string.substring(0, s);
    // 문자열 0번째 위치부터 s번째 위치까지 잘라낸 문자열 리턴
    String substring2 = my_string.substring((overLength + s), myLength);
    // (문자열 overwrite_string의 길이 + s)의 위치부터 문자열 myLength 의길이까지 잘라낸 문자열 리턴

    if (1 <= overLength && overLength <= myLength && myLength <= 1000 && 0 <= s && s <= (myLength - overLength)) {

      answer = substring1 + overwrite_string + substring2;

    }
    return answer;// answer 값을 반환하고 새 값을 할당
  }
}
