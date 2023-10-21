import java.util.Arrays; 
import java.util.stream.Collectors;
public class Solution{
	public static String convertString(String str) {
            // Write your code here

            String[] strings = str.split(" ");

        return Arrays.stream(strings).map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.joining(" "));

        }

}
