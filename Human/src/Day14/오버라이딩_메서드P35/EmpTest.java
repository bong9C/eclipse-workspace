package Day14.오버라이딩_메서드P35;

public class EmpTest {
	public static void main(String[] args) {
		String name;
		int totalPay;
		Temporary Hong;
		Regular Ju;
		Regular Nam;
		Regular Sin;
		Regular Cho;
		
		
		Hong= new Temporary("홍길동", 4000000,0,500);
		Ju= new Regular("주세희", 4000000, 6000000);
		Nam=new Regular("남지영",4000000,6000000);
		Sin=new Regular("신영화",4000000,6000000);
		Cho=new Regular("조세훈",4000000,6000000);
		System.out.println("사원 정보 출력");
		name=Hong.name;
		totalPay=Hong.calcTotallPay();
		System.out.println("사원 이름: "+name+", 사원 총 급여:"+totalPay+"원");
		
		name=Ju.name;
		totalPay=Ju.calcTotallPay();
		System.out.println("사원 이름: "+name+", 사원 총 급여:"+totalPay+"원");
		
		name=Nam.name;
		totalPay=Nam.calcTotallPay(); //오버라이딩 된 메서드 호출
		System.out.println("사원 이름: "+name+", 사원 총 급여:"+totalPay+"원");

		name=Sin.name;
		totalPay=Sin.calcTotallPay(); //오버라이딩 된 메서드 호출
		System.out.println("사원 이름: "+name+", 사원 총 급여:"+totalPay+"원");
		
		name=Cho.name;
		totalPay=Cho.calcTotallPay(); //오버라이딩 된 메서드 호출
		System.out.println("사원 이름: "+name+", 사원 총 급여:"+totalPay+"원");
		
	}

}
