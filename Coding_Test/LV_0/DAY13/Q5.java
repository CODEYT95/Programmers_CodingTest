//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181893

package LV_0.DAY12;

import java.util.*;

class Solution {
    public LinkedList<String> solution(String[] str_list) {
        LinkedList<String> answer = new LinkedList<String>();
        String str = "";
        for(String i : str_list){str += i;}
        
        if(str.contains("l") || str.contains("r")){//l만 있거나 / r만 있거나  / 둘 다 있거나
            
            for(int i=0; i<str_list.length; i++){//str_list길이를 이용한 for문
            
                if(str_list[i].equals("l")){//l이 먼저 나올 때
                
                    for(int j=0; j<i; j++){
                    
                        answer.add(str_list[j]);//answer에 값 넣어주기
                
                    }   
                    break;
                }else if(str_list[i].equals("r")){//r이 먼저 나올 때
                
                    for(int j=i+1; j<str_list.length; j++){
                   
                        answer.add(str_list[j]);//answer에 값 넣어주기
                
                    }
                    break;
                }  
            
            }

        }
        
        return answer;//값 반환
    }
}