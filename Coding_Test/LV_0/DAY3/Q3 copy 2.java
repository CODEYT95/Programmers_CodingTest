//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181940

package LV_0.DAY3;

class Solution {
  public String solution(String my_string, int k) {
      String answer = "";
      
      int length = my_string.length(); //my_string의 문자열 길이 length에 저장
      
      if(1 <= length && length <= 100 && 1 <= k && k <= 100){ //1 ≤ my_string의 길이 ≤ 100, 1 ≤ k ≤ 100
          answer = my_string.repeat(k); //repeat(k) 문자열을 k 만큼 반복하는 메소드 
      }
      return answer;//answer 값 리턴하고 새 값 할당
  }
}