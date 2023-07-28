package Day14.오버라이딩_메서드P35;

public class Temporary extends Employee {
	private int workedHour;
	public Temporary(String name, int payPerMonth, int commsion, int workedHour) {
		super(name, payPerMonth, commsion);
		this.workedHour=workedHour;
	}
	//오버라이딩 메소드
	int calcTotalPay() {
		//상위 메소드를 호출하여 총 급여를 구한다.
		// int totallPay=12*payMonth+ commsion +workHour*2000;
		int temp = super.calcTotallPay();
		
		//임시직은 다시 총 일한 시간을 총 급여에 합한 후 구한다.
		int tempTotalPay=temp + workedHour*2000;
		return tempTotalPay;
				}

}
