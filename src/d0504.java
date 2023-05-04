// 주사위 게임 1
import java.lang.Math;
public class d0504 {
	class Solution {
	    public int solution(int a, int b) {
	        int answer = 0;
	        if(a%2!=0 && b%2!=0)
	            answer = (a*a) + (b*b);
	        else if (a%2!=0 || b%2!=0)
	            answer = 2 * (a+b);
	        else
	            answer = Math.abs(a-b);
	        return answer;
	    }
	}
}
