package Day15.다형성_58_직원클래스;

public class Employee {

	protected String name;
	protected String job;
	protected String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getEmpInfo(Employee e) {
		if(e instanceof Account) {
			System.out.println("직급 : "+ e.getJob());
		}
		else if(e instanceof Research) {
			Research res=(Research)e;
			System.out.println("이름:"+name+", 직책 : "+res.getPosition());
		}
	}
	
}
