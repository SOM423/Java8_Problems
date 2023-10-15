public class SquareFilterAvg {

	public static void main(String[] args) {

		List<Integer> numbers= Arrays.asList(2,12,32,56,44,22,31,9);
		
		double numAvg = numbers.stream()
			                             .map(e-> e*e)
			                             .filter(ele -> ele > 100)
			                             .mapToInt(e -> e)
			                             .average()
			                             .getAsDouble();
		
		System.out.println(numAvg);
	}

}
