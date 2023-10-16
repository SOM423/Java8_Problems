public class MINMAX {

	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(2,12,32,56,44,22,31,9);
		
		//Maximum Number
		int maxNum = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		//Minimum Number
		int minNum =numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(maxNum);
		System.out.println(minNum);

	}

}
