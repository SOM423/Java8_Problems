import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RunLengthEncodingString {

    public static String encode(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder encodedString = new StringBuilder();

        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .forEach((c, count) -> encodedString.append(c).append(count));

        return encodedString.toString();
    }

}
