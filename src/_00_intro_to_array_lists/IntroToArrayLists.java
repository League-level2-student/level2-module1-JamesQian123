package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("hello");
		words.add("james");
		words.add("text");
		words.add("code");
		words.add("phone");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i< words.size(); i++) {
			String w = words.get(i);
			System.out.println(w);
		}
		//4. Print all the Strings using a for-each loop
		for(String word: words) {
			System.out.println(words);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 1; i<words.size();i+=2) {
			String j = words.get(i);
			System.out.println(j);
		}
		//6. Print all the Strings in reverse order.
		for(int i = words.size()-1;i>=0;i-- ) {
			String k = words.get(i);
			System.out.println(k);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s: words) {
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(c == 'o') {
					System.out.println(words.get(i));
					
			}
		}
	}
}}
