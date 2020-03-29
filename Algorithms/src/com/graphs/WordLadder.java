package com.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>();
		dictionary.add("poon");
		dictionary.add("plee");
		dictionary.add("same");
		dictionary.add("poie");
		dictionary.add("plea");
		dictionary.add("plie");
		dictionary.add("poin");
		//dictionary.add("soon");

		String start = "toon";
		String end = "plea";
		System.out.println(getMinimumNumberOfMoves(start, end, dictionary));
	}

	private static int getMinimumNumberOfMoves(String start, String end, Set<String> dictionary) {
		if (!dictionary.contains(end))
			return 0;
		Queue<String> q = new LinkedList<String>();
		q.add(start);
		int length = 0;
		char[] endArr = end.toCharArray();
		while (!q.isEmpty()) {
			++length;
			char[] arr = q.peek().toCharArray();
			q.remove();

			for (int pos = 0; pos < start.length(); pos++) {
				char character = arr[pos];
				System.out.println(arr);
				System.out.println(endArr[pos]);
				System.out.println(character != endArr[pos]);
					for (char c = 'a'; c <= 'z'; c++) {
						arr[pos] = c;
						if (String.valueOf(arr).equals(end))
							return length + 1;
						if (!dictionary.contains(String.valueOf(arr)))
							continue;
						dictionary.remove(String.valueOf(arr));
						q.add(String.valueOf(arr));
					}
				arr[pos] = character;
			}

		}
		return 0;
	}

}