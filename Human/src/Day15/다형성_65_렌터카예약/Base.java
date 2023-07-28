package Day15.다형성_65_렌터카예약;

import java.util.Calendar;

public class Base {
	public  void displayData(String data) {
	// 하위 클래스의 결과값을 출력하는 메소드
		System.out.println("조회한 데이터는 "+data+"입니다.");
	}
	
	// 조회한 데이터의 시간 정보를 제공하는 멤소드
	public String showTime() {
		String date=null;
		String time=null;
		
		Calendar cal = Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		
		date=year+"-"+month+"-"+day;
		time=hour+":"+min+":"+sec;
		return date+ " "+ time;
	}
	
}
