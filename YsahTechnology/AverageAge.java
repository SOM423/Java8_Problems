Public class AverageAge{

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female"));

		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male"));

		employeeList.add(new Employee(133, "Martin Theron", 29, "Male"));



		  Double avgMaleEmp = employeeList.stream().filter(emp -> emp.gender.equals("Male")).mapToInt(emp -> emp.age).average().getAsDouble();
		  Double  avgFemaleEmp = employeeList.stream().filter(emp -> emp.gender.equals("Female")).mapToInt(emp -> emp.age).average().getAsDouble();
		  
		  System.out.println(avgMaleEmp);
		  System.out.println(avgFemaleEmp);
	
	}

}
