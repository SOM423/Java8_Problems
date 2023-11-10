public class MinimumParentheses {
	public static int minimumParentheses(String pattern) {

		
		int openCount = 0;
		int closeCount = 0;

		for( char c : pattern.toCharArray())
		{
			if(c == '(')
			{
				openCount++;
			}
			else if(c == ')' && openCount > 0)
			{
				openCount --;
			}

			else
			{
				closeCount++;
			}
		}

		return openCount + closeCount;

	}
}
