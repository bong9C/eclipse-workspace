package Day17;

import java.util.Calendar;

public class UserDfinedException extends Exception {
	private String mesg;

	public UserDfinedException() {}
	public UserDfinedException(String mesg) {
		this.mesg = mesg;
	}

	public String toString() {
		return "예외 메세지는 :" + mesg;
	}
	// 예외발생하는 코드 메소드
	public String getUserDfinedExceptionInfo() { 	
		String errMsg = "예외 발생시간 : "+ showTime()+ "예외 내용 : "+mesg;
		return errMsg;
	}

	public static String showTime() {
		String date=null;
		String time=null;
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		date=year+"-"+month+"-"+day;
		time=hour+"-"+min+"-"+sec;
		return date+ " "+time;
}
}
