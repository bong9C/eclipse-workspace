package Day17;

public class ScoreTest {

	public static void main(String[] args) {
		//int score = 89;
		int score= 120;
		ScoreUtil t = new ScoreUtil();
		
		score=t.calcScore(score);
		System.out.println("입력한 점수는: "+t);
	}
}
