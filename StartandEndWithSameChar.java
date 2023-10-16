public class StartandEndWithSameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("ab","aba","xyx","mno","xyz","","pop","bob","aa");
		
		list.stream()
		         .filter(x -> x.length() > 0 &&  x.endsWith(String.valueOf(x.charAt(0))))
		         
		        .forEach(System.out::println);

	}

}

