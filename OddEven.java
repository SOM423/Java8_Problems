public class OddEven {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,5,10,20,32,97,44,65,11);
		
		System.out.println("------------- Even Numbers ---------------------------------------");

		numbers.stream()
						.filter(num -> num %2 == 0)
						.forEach(System.out::println);
		
		System.out.println("------------- Odd Numbers ---------------------------------------");
		
		numbers.stream()
						.filter(num -> num %2 !=0)
						.forEach(System.out::println);
	}

}
