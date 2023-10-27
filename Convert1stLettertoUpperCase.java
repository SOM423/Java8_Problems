import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Convert1stLettertoUpperCase {

	public static void main(String[] args) {
			
		String str = "Why you are confused";
		
		String[] strings = str.split(" ");

       String s = Arrays.stream(strings).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
       
       System.out.println(s);
      
			
	}

}
