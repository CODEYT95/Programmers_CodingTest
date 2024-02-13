//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181942

package LV_0.DAY3;

class Solution {
  public String solution(String str1, String str2) {
      String answer = "";
      
      int length = str1.length();
      
      char [] arr1 = str1.toCharArray(); // str1을 char타입 배열로 값을 저장
      char [] arr2 = str2.toCharArray(); // str1을 char타입 배열로 값을 저장
      
       if(1 <= length && length <= 10){//제한사항
           for(int i=0; i<length; i++){//for문
               answer += Character.toString(arr1[i]) + Character.toString(arr2[i]);
               //answer가 String타입이므로 arr1,2를 타입 변환 해주고 answer에 값 넣어주기
           }
       }       
      return answer;
  }
}