public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101, "Som", 50000, "Pune"));
		emp.add(new Employee(102, "Akshay", 80000, "Mumbai"));
		emp.add(new Employee(103, "Tom", 50000, "Delhi"));
		emp.add(new Employee(104, "Rahul", 60000, "Pune"));
		emp.add(new Employee(105, "zoya", 45000, "Bangalore"));
		emp.add(new Employee(106, "Riya", 90000, "Chennai"));
		
		emp.stream()
		.sorted(Comparator.comparing(Employee::getSal)
		.thenComparing(Comparator.comparing(Employee::getName)))
		.forEach(System.out::println);

	}

}
