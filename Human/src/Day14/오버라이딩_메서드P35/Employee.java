package Day14.오버라이딩_메서드P35;

public class Employee {
	String name;		// 사원명
	int payPerMonth;	// 월급여
	int commsion;		// 보너스
	
	public Employee(String name, int payPerMonth, int commsion) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commsion = commsion;
	}
	//정규직 총급여 구하기
	int calcTotallPay() {
		int totalPay=12*payPerMonth+commsion;
		return totalPay;
	}
}
