package Day04.Class;

public class Jiwoo {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 객체명 = new 클래스명();					// new 피카츄의 객체를 피카츄타입으로 불러온다!
		Pikachu pikachu = new Pikachu();				// 클래스타입명과 클래스명은 동일하게 작성(피카츄 클래스를 불러오는것)

		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
//		pikachu.energy = 100;
//		pikachu.type = "전기";
//		pikachu.level = 1;

		System.out.println("######### 피카츄 ##########");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("레벨 : " + pikachu.level);
		System.out.println("공격A : " + pikachu.aAttack());
		System.out.println("공격B : " + pikachu.bAttack());
		System.out.println();

		Pikachu pikachu20 = new Pikachu(200, "진화", 20);
		
		System.out.println("######### 피카츄(Lv.20) ##########");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("레벨 : " + pikachu20.level);
		System.out.println("공격A : " + pikachu20.aAttack());
		System.out.println("공격B : " + pikachu20.bAttack());
		System.out.println();	
		
	
		
		Raichu raichu = new Raichu();
		
		System.out.println("######### 라이츄 ##########");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("레벨 : " + raichu.level);
		System.out.println("공격A : " + raichu.aAttack());
		System.out.println("공격B : " + raichu.bAttack());
		System.out.println("공격C : " + raichu.cAttack());
		System.out.println();	
		
		
		Raichu raichu40 = new Raichu(400, "메가전기", 40);
		
		System.out.println("######### 라이츄(Lv.40) ##########");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("레벨 : " + raichu40.level);
		System.out.println("공격A : " + raichu40.aAttack());
		System.out.println("공격B : " + raichu40.bAttack());
		System.out.println("공격C : " + raichu40.cAttack());
		System.out.println();	
		
		
	}

}
