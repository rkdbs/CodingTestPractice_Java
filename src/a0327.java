// 외계행성의 나이
class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        for(int i=0; i<str.length(); i++) {
            answer += (char)(str.charAt(i) + 49);
        }
        return answer;
    }
}