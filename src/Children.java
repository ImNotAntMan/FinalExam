
public class Children extends Person {
	public Children(String personName) {
		super(personName);
	}
	
	public void doWork() {
		System.out.println(getPersonName() + "이 학교를 갑니다.");
	}
}
