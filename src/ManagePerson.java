import java.util.*;
public class ManagePerson {
	// 멤버변수
	ArrayList<Person> personList ;
	// 생성자
	public ManagePerson() {
		this.personList = new ArrayList<Person>();
	}
	// 메서드
	// 리스트에 추가
	public void addPerson(Person person) {
		personList.add(person);
		person.doWork();
	}
	
	// 리스트에서 삭제
	public boolean removePerson(String personName) {
		int i = 0;
		for(Person ps : personList) {
			if(ps.getPersonName().equals(personName)) {
				System.out.println(ps.getPersonName() + " 삭제했습니다.");
				personList.remove(ps);				
				return true;
			}
		}
		return false;
	}
	
	// 리스트 리스팅
	public void showAllPerson() {
		for(Person ps : personList) {
			ps.doWork();
		}
	}
}
