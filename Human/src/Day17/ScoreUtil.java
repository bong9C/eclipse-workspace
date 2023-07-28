package Day17;

public class ScoreUtil {
	public int calcScore(int score) {
		System.out.println("calcScore 메소드 시작");
	if(score<=0||score>=100)
//		throw new UserDefinedException("정확한 점수를 입력하세요.")
		System.out.println("정확한 점수를 입력하세요.");
		System.out.println("calcScore 메소드 끝");
		return score;
	}

}
