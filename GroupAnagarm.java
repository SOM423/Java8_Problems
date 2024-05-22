package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GroupAnagarm {

	public static void main(String[] args) {
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = groupAnagram(strs);
        System.out.println(groups);
		
			

	}
	
	//IMP Program to Practice
	public static List<List<String>> groupAnagram(String[] str)
	{
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s : str)
		{
			char[] charray = s.toCharArray();
			Arrays.sort(charray);
			
			String sortedString = new String(charray);
			
			if(!map.containsKey(sortedString))
			{
				map.put(sortedString, new ArrayList<>());
			}
			
			map.get(sortedString).add(s);
			
			
		}
		
		List<List<String>> result = new ArrayList<>(map.values());
		
		return result;
	}

}
