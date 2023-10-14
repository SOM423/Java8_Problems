import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student("Somesh", 25);
		Student s2 = new Student("Payal", 22);
		Student s3 = new Student("Sakshi", 22);
		Student s4 = new Student("siddhi",20);
		Student s5 = new Student("Kailash", 27);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		  System.out.println(list.stream().filter(x -> x.age >= 25).count();
		 

	}
 
}
