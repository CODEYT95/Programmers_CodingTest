//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181939

package LV_0.DAY3;

class Solution {
  public int solution(int a, int b) {
      int answer = 0;
      
      //Integer.toString() 메소드로 int타입을 String타입으로 변환
      String str1 = Integer.toString(a) + Integer.toString(b);
      String str2 = Integer.toString(b) + Integer.toString(a);
      
      //Integer.parseInt() 메소드로 str1,2를 int타입으로 변환 후 값 비교 후 출력
      if(Integer.parseInt(str2) < Integer.parseInt(str1)){ //a+b가 큰경우
         
          answer = Integer.parseInt(str1);
      
      }else if(Integer.parseInt(str1) < Integer.parseInt(str2)){//b+a가 큰경우
        
          answer = Integer.parseInt(str2);
    
      }
      return answer;
  }
}