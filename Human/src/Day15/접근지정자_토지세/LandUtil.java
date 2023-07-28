package Day15.접근지정자_토지세;

public class LandUtil {

	public float calcLandTax(Land l) { //인스턴스를 매개변수로 전달한다.
		float total_tax= 0f;
		float tax= 0f;
		float area_tax = 0f;
		int tax_rate = 0;
		int n = 0;
		
		if(l.land_type==1) {
			System.out.println("토지 종류: 건물이 없는 토지");
			if(l.land_size<=1000)
				tax_rate=1800;
			else if(l.land_size<=2500)
				tax_rate=2000;
			else
				tax_rate=3000;
			area_tax = tax_rate*l.land_size;
			System.out.println("토지 면적 세액 : " +area_tax);
			if(l.land_own_year<3)  // 3년미만 토지는 100%그대로 부과(투기방지)
				n=0;
			else if(l.land_own_year<13) // 3년~12년 토지 매년5%씩 감면되어 최대 50%감면
				n=l.land_own_year-2;
			else
				n=10;	// 12년 초과 50%감면
			tax=area_tax-area_tax*0.05f*n;  // 연토지세 산출식
		}
		else {
			System.out.println("토지 종류: 건물이 있는 토지");
			if(l.land_size<=1000)
				tax_rate=3600;
			else if(l.land_size <=2500)
				tax_rate=4000;
			else
				tax_rate=6000;
			area_tax=tax_rate*l.land_size;
			System.out.println("토지 면적 세액은 " + area_tax);
			if(l.land_own_year<3)
				n=0;
			else if(l.land_own_year<13) // 3년~12년 토지 매년5%씩 감면되어 최대 50%감면
				n=l.land_own_year-2;
			else
				n=10;	// 50%감면
			tax=area_tax-area_tax*0.05f*n;  // 원래 토지세 - 감면토지세
		}
		total_tax=tax+0.3f*area_tax; //최종 토지 보유세에 지방 교육세를 포함한다.
		return total_tax;
		
		
	}
}
