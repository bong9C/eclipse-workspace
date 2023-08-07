package 연습.Day03;

class NO01 {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
			answer= answer+str1.charAt(i)+str2.charAt(i);
		}
        
        return answer;
    }
		
    }
