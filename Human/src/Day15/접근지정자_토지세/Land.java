package Day15.접근지정자_토지세;

public class Land {

	int land_type; // 디폴트 접근지정자는 같은 패키지에서 직접 접근이 가능하다.
	int land_size;
	int land_own_year;
	
	
	public Land(int land_type, int land_size, int land_own_year) {
		this.land_type = land_type;
		this.land_size = land_size;
		this.land_own_year = land_own_year;
	}
	
		
}
