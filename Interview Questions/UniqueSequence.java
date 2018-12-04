package com.mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Print count of repeating number of character and display most repeated first.
 * In case of tie print character which come first in ASCII sequence.
 * 
 * @author Wagare
 */
public class UniqueSequence {
	public static void main(String[] args) {
		String str = "abbeddfhdbnnwklfww";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			Integer count = 1;
			if(map.containsKey(character)) {
				count = map.get(character)+ 1;
			}
			map.put(character, count);
		}
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				if(o2.getValue().compareTo(o1.getValue()) == 0) {
					return o1.getKey().compareTo(o2.getKey());
				}
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for (Entry<Character, Integer> entry : list) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}
}
