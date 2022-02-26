	
	// Use JUnit Jupiter for testing.
    //testImplementation 'org.junit.jupiter:junit-jupiter:5.8.1'

    // https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core
	//implementation group: 'org.hibernate.orm', name: 'hibernate-core', version: '5.6.5.Final'
    
    // https://mvnrepository.com/artifact/mysql/mysql-connector-java
	//implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.28'
	
package doselect;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	
	private Integer id;
	private String name;
	private LocalDate birthDate;
	
	public Person(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
}

class Implementationx
{
public int getAge(LocalDate birthDate) {
		
//		getYear gives year subtracting from today gives age
		
		return LocalDate.now().getYear()-birthDate.getYear();
	}

	public List<Person> getPersonDetails(List<Person> persons){
		
		List<Person> result = new ArrayList<>();
		
		//filtering out the persons with age greater that 18 and collecting in a list
		result = persons.stream().filter(o->getAge(o.getBirthDate())>18).collect(Collectors.toList());
		
		return result;
		
	}

	public List<Person> sortList(List<Person> persons){
		
//		implementing compare method of Comparator interface through lambda expressions
//		which returns 1 if age is greater and -1 if age is less
		
		Comparator<Person> ageComparator = (p1,p2)->getAge(p1.getBirthDate())>getAge(p2.getBirthDate())?1:-1;
		
		Collections.sort(persons,ageComparator);
		
		return persons;
		
	}

}

public class AssignmentQ3 {

	public static void main(String[] args) {

		Person p1 = new Person(1,"Supratim",LocalDate.of(1999, 11, 25));
		Person p2 = new Person(2,"Rahul",LocalDate.of(1998, 7, 25));
		Person p3 = new Person(3,"Randip",LocalDate.of(2005, 9, 25));
		Person p4 = new Person(4,"Bhargav",LocalDate.of(1996, 12, 25));
		Person p5 = new Person(5,"Aditya",LocalDate.of(2001, 10, 25));
		
		List<Person> list = new ArrayList<>();
		list.add(p5);
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		
		Implementationx impl = new Implementationx();
		
		//printing persons with age greater than 18 only
		impl.getPersonDetails(list).forEach(System.out::println);
		
		System.out.println("\n-------------------------------\n");
		
		//printing persons ascending order of age
		impl.sortList(list).forEach(System.out::println);
		
	}

}
