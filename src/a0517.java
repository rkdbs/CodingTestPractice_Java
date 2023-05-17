// 길이에 따른 연산
public class a0517 {
	class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0, mul = 1;
	        for(int i=0; i<num_list.length; i++) {
	            if(num_list.length >= 11) answer += num_list[i];
	            else {
	                mul *= num_list[i];
	                answer = mul;
	            }
	        }
	        return answer;
	    }
	}
}
