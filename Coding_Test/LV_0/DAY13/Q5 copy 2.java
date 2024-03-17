//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181893

package LV_0.DAY13;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int answer[] = new int[num_list.length-(n-1)];//answer길이 정해주기
                
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[(n-1)+i];//answer에 값 넣어주기
        }
        
        return answer;//값 반환
    }
}