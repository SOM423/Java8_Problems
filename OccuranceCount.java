import java.util.HashMap;
import java.util.Map;

public class OccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach 1 :

		String str = "somesh";
		
		Map<Character, Long> charOccurrences = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


		//Approach 2 :
		
		String str ="SomeshSfgsom";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		map.entrySet().stream().filter(x -> x.getValue()>=1).forEach(System.out::println);

	}

}
