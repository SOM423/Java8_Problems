public class DuplicateNum {

	public static int findDuplicate(ArrayList<Integer> arr) {

		List<Integer> list = arr.stream().filter(i -> Collections.frequency(arr, i)>1).collect(Collectors.toList());
		return list.get(0);
	}
}
