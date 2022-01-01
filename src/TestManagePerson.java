
public class TestManagePerson {

	public static void main(String[] args) {
		ManagePerson personList = new ManagePerson();
		personList.addPerson(new Student("이순신"));
		personList.addPerson(new Student("이순순"));
		personList.addPerson(new Employee("이순수"));
		personList.addPerson(new Employee("이순술"));
		personList.addPerson(new Employee("이순쓜"));
		personList.addPerson(new Student("이순스"));
		personList.addPerson(new Children("이순시"));
		personList.addPerson(new Children("이순소"));
		personList.addPerson(new Children("이순송"));
		
		personList.showAllPerson();
		personList.removePerson("이순신");
		System.out.println("______________________________");
		personList.showAllPerson();
		personList.removePerson("이순스");
		System.out.println("______________________________");
		personList.showAllPerson();
	}

}
