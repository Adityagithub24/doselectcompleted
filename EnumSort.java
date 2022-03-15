package EnumSort;


import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

class Employee {

    String name;
    int salary;

    Employee(String name , int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
    BYNAME,BYSALARY;    
    };
    public List<Employee>sort(List<Employee> emps, final SortMethod method)
    {
        if(method.equals(SortMethod.BYSALARY)==true) {
			
		
		Collections.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary() - e2.getSalary();
			}
		});
		
		return emps;
		
		}
		else {
			 Collections.sort(emps, new Comparator<Employee>() {
                    
                    @Override
			        public int compare(Employee e1, Employee e2) {
			            return e1.getName().compareTo(e2.getName());
//			            if (comp != 0) {    // names are different
//			                return comp;
//			            }
//			            return t.getAge() - t1.getAge();
			        }
			    });
			 
			 return emps;
		}
    }

   public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character)
    {
        for( Employee e : entities) {
			if(e.getName().startsWith(character)) {
				return true;
			}
		}
		return false;
    }
   
}
    
 
public class EnumSort {
	
		public static void main(String[] args) {

			 List<Employee> emps = new ArrayList<>();
	            emps.add(new Employee("Mickey", 100000));
	            emps.add(new Employee("Timmy", 50000));
	            emps.add(new Employee("Annny", 40000));

	            EmployeeInfo obj = new EmployeeInfo();
	            System.out.println(obj.sort(emps,EmployeeInfo.SortMethod.BYSALARY));  
	            System.out.println(obj.isCharacterPresentInAllNames(emps,"a"));


	}

}
