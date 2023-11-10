public class AnagramDiff {
	public static int getMinimumAnagramDifference(String str1, String str2) {
		
		int[] freqArray = new int[26];

        // Update frequencies for characters in the first string
        for (char ch : str1.toCharArray()) {
            freqArray[ch - 'a']++;
        }

        // Update frequencies for characters in the second string
        for (char ch : str2.toCharArray()) {
            freqArray[ch - 'a']--;
        }

        // Calculate the total difference in frequencies
        int totalDifference = 0;

        for (int difference : freqArray) {
            totalDifference += Math.abs(difference);
        }

        return totalDifference/2;
	}
}
