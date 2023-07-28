package Day06.Ex02_Encapsulation;

/**
 * 통장계좌
 * - 예금액
 * - 은행명
 * - 계좌번호
 * - 예금주
 */
public class Encapsulation {

	private int deposit;
	private String bank;
	private String depoNumber;
	private String depositor;
	
	// 기본 생성자  // 알트+ 쉬프트 + s > 제너레이터 컨스터 유징필드,  체크 모두 해제후 생성
	public Encapsulation() {
	}
	
	// 매개변수 모두 포함하는 생성자  // 알트+ 쉬프트 + s > 제너레이터 컨스터 유징필드, 체크 모두 선택후 생성
	public Encapsulation(int deposit, String bank, String depoNumber, String depositor) {
	this.deposit = deposit;
	this.bank = bank;
	this.depoNumber = depoNumber;
	this.depositor = depositor;
	}

	// getter, setter     // 알트+ 쉬프트 + s > 제너레이터 겟터 셋터, 체크 모두 선택후 생성
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	// toString				//알트+ 쉬프트 + s > 제너레이터 투스트링, 팝업된대로 생성
	@Override
	public String toString() {
		return "Encapsulation [deposit=" + deposit + ", bank=" + bank + ", depoNumber=" + depoNumber + ", depositor="
				+ depositor + "]";
	}
	

	

	
	
	
}
