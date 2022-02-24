import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	String name;
	float salary;
	int id;
	
	public Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(23, "siddhant", 23000f));
		empList.add(new Employee(5, "Dk", 20000f));
		empList.add(new Employee(3, "aiswary", 3000f));
		empList.add(new Employee(2, "lakhan", 2000f));
		empList.add(new Employee(24, "ravi", 20000f));
		List<Float> salaryList=empList.stream().
				filter(emp->emp.salary < 20000).map(emp->emp.salary)
				.collect(Collectors.toList());
		empList.stream().filter(emp->emp.salary == 20000).forEach(emp-> System.out.println(emp.name));
		System.out.print(salaryList);
		
		//Stream.iterate(1, val->val+7).filter(val->val%2==0).limit(10).forEach(System.out::println);
		
		double salaryTotal=empList.stream().collect(Collectors.summingDouble(emp->emp.salary));
		System.out.println(salaryTotal);
		
		long totalElements=empList.stream().filter(emp->emp.salary!=23000).count();
		System.out.println(totalElements);
		
		Set<Float> salarySet=empList.stream().
				filter(emp->emp.salary < 20000).map(emp->emp.salary)
				.collect(Collectors.toSet());
		System.out.println(salarySet);
		
		Map<Integer, String> empDetails=empList.stream().collect(Collectors.toMap(emp->emp.id,emp->emp.name));
		System.out.print(empDetails);
}
}