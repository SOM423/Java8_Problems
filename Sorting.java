import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,10,20,32,97,44,65,11);
		
		//Ascending order sorting
		
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("------------------------ Reversed Order -------------------------------");
		
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

	}

}
