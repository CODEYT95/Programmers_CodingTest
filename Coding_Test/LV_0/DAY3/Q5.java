//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181938

package LV_0.DAY3;

class Solution {
  public int solution(int a, int b) {
      int answer = 0;
      int val = 2 * a * b;
      
      String str1 = Integer.toString(a) + Integer.toString(b);
      
      if(val < Integer.parseInt(str1)){
          answer = Integer.parseInt(str1);
      }else if(Integer.parseInt(str1) < val){
          answer = val;
      }else {
          answer = Integer.parseInt(str1);
      }
      return answer;
  }
}