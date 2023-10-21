import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RunLengthEncodingString {

	public static void main(String[] args) {

		 String string = "AAABBBCDDDD";
		 
		 Pattern pattern = Pattern.compile("(\\p{L})\\1*");
		 
		 Matcher matcher = pattern.matcher(string);
		 
		 
		 String result =matcher.results().map(match ->String.valueOf(match.group().charAt(0)) +match.group().length()).collect(Collectors.joining());
		 System.out.println(result);
	}

}
