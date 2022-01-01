import java.util.*;
public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		// 상위 = new 하위, 하위 = new 하위, 상위 new 상위
		Person st1 = new Student("이재명");
		Person st2 = new Student("윤석열");
		personList.add(st1);
		personList.add(st2);
		personList.add(new Student("홍길동"));
		personList.add(new Student("이순신"));
		personList.add(new Student("홍범도"));
		personList.add(new Employee("이기자"));
		personList.add(new Employee("죽여라"));
		personList.add(new Children("기다려"));
		personList.add(new Children("가지마"));
		personList.add(new Children("그러지마"));
		for(int i = 0; i < personList.size(); i++) {
			Person tmp = personList.get(i);
			tmp.doWork();
		}
		personList.remove(st2);
		System.out.println("_________________________________");
		for(Person ps : personList) {
			ps.doWork();
		}
	}

}
