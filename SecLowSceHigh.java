import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecLowSceHigh {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,10,20,32,97,44,65,11);
		
		//Second Highest
		
		int secH = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		int secS = numbers.stream().sorted().skip(1).findFirst().get();
		
		System.out.println(secH);
		System.out.println(secS);
		

	}

}
