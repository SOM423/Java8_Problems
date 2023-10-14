
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChellaSoft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Somesh", 26));
		list.add(new Person("Som", 25));
		list.add(new Person("Tom", 50));
		list.add(new Person("Akshay", 38));
		list.add(new Person("Akshay", 31));
		
		List<Object> li = list.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                .collect(Collectors.toList());
		System.out.println(li);

	}

}
