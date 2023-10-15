public class AvgOfAllNumbers {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1,5,10,20);
		
		
		//Average of Numbers
		
		double avg = li.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(avg);

	}

}
