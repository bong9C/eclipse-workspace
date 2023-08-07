package 연습.Day02;

class NO4 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        							// ( 인덱스 0부터 , 인덱스 s 전까지 ) 잘라주세요.
        answer += my_string.substring(0,s);
        answer += overwrite_string;
        
        answer += my_string.substring(s+overwrite_string.length());
        		//He11oWor1d.자릅니다.( 2(정수)+7(길이) = 9(인덱스)부터 츨력);
        
        return answer;
        
    }
    
    public static void main(String[] args) {
		
    	NO4 n = new NO4();
    	
    	
    	System.out.println(n.solution("He11oWor1d", "lloworl", 2));
    							     //0123456789
    	System.out.println(n.solution("Program29b8uyp", "merS123", 7));
	}
 }