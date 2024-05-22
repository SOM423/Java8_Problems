import java.util.HashMap;
import java.util.Map;

public class OccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach 1 :

		String str = "somesh";
		
		Map<Character, Long> charOccurrences = 
		                                  str.chars()
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

//Approach 3 :

class OccuranceCount {
    public static void main(String[] args) {
       
       int[] arr = {4,5,2,4,2,5,7,6,2,3,4,5,1,2,4,5,4,4};
       
       Map<Integer, Long> occuranceCount = new HashMap<>();
       
       for (int i = 0; i < arr.length; i++) {
           occuranceCount.put(arr[i], occuranceCount.getOrDefault(arr[i], 0L) + 1);
       }
       
       // Find the entry with the maximum occurrence
       Optional<Map.Entry<Integer, Long>> maxEntry = occuranceCount.entrySet()
           .stream()
           .max(Map.Entry.comparingByValue());
       
       if (maxEntry.isPresent()) {
           System.out.println("Element with the highest occurrence: " + maxEntry.get().getKey() +
                              ", Occurrences: " + maxEntry.get().getValue());
       } else {
           System.out.println("No elements found");
       }
    }
}
