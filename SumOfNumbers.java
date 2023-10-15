public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = Arrays.asList(1,5,10,20);
		
		//1. Sum of all Numbers using Method references
		int sum = li.stream().reduce(Integer::sum).get();
		
		//Sum of all Numbers using Lambda Expression
		int sum1 = li.stream().reduce((a,b) -> a+b).get();
		
		System.out.println(sum);
		System.out.println(sum1);
		
	}

}
