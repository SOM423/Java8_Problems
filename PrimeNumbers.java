public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,17,11);
		
		numbers.stream().filter(num -> num >=2).filter(x ->isPrime(x)).forEach(System.out::println);
		

	}

	private static boolean isPrime(int num)
	{
		return IntStream.rangeClosed(2, num/2).noneMatch(i -> num%i ==0);
	}
}
