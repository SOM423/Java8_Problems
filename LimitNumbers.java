import java.util.Arrays;
import java.util.List;

public class LimitNumbers {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,4,3,6,7,3,8,9,12,14);
		
		int sum = num.stream().limit(5).reduce(Integer::sum).get();
	}

}
