//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181941

package LV_0.DAY3;

class Solution {
  public String solution(String[] arr) {
      String answer = "";
      
      int length = arr.length; //배열의 길이
      
      if(1 <= length && length <= 200){
          for(int i=0; i<length; i++){
          answer += arr[i]; // result에 arr 값 저장
          }
      }
      return answer;
  }
}