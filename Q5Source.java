package doselect;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Candidate{
  //Write Your Code Here..
  private String name;
  private int id;
  private int age;
  private String gender;
  private String department;
  private int yearOfJoining;
  private double salary;

  Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
  {
    this.id=id;
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.department=department;
    this.yearOfJoining=yearOfJoining;
    this.salary=salary;
  }

  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}

class Implementation{
  //Write Your Code Here..
  public Map<String,Long> getCount(List<Candidate> list)
  {
    Map<String,Long> genderCount = list.stream().collect(Collectors.groupingBy(Candidate::getGender , Collectors.counting()));
    return genderCount;
  }
public Map<String,Double> getAverageAge(List<Candidate> list)
  {
    Map<String,Double> ageAvg = list.stream().collect(Collectors.groupingBy(Candidate::getGender , Collectors.averagingInt(Candidate::getAge)));
    return ageAvg;
  }
public Map<String,Long> countCandidatesDepartmentWise(List<Candidate> list)
{
   Map<String,Long> candidateCount = list.stream().collect(Collectors.groupingBy(Candidate::getDepartment , Collectors.counting()));
   return candidateCount;

}
public Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
{
    Optional<Candidate> youngestCandidate = list.stream()
   .filter(c -> c.getGender().equals("Male") && c.getDepartment().equals("Product Development")).min(Comparator.comparingInt(Candidate::getAge));

    return youngestCandidate;

}

}

public class Q5Source extends Implementation {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
       List<Candidate> list = new ArrayList<>();
       list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
  Implementation impl = new Implementation();
  System.out.println(impl.getCount(list));
  System.out.println(impl.getAverageAge(list));
  System.out.println(impl.countCandidatesDepartmentWise(list));
  System.out.println(impl.getYoungestCandidateDetails(list));
	}
}

