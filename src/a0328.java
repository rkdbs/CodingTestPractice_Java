// 숨어있는 숫자의 덧셈(1)
/*
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str[] = my_string.replaceAll("[a-zA-Z]", "").split("");
        for(int i=0; i<str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}
*/