
public class Student extends Person {
	public Student(String personName) {
		super(personName); // 부모클래스의 생성자 호출
	}
	
	public void doWork() {
		System.out.println(getPersonName() + "이 공부한다.");
	}
}
