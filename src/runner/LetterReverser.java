package runner;

import java.util.ArrayList;
import java.util.List;

public class LetterReverser {
//Change by places first and last letters in each second string of list or array
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("First line");
		list.add("Second line");
		list.add("Third line");
		list.add("Fourth line");
		list.add("Fifth line");
		list.add("Sixth line");
		StringBuilder temp = new StringBuilder();
		for(int i = 1; i < list.size(); i = i + 2) {
			temp.append(list.get(i).substring(list.get(i).length()-1));
			temp.append(list.get(i).substring(0, list.get(i).length()-1));
			temp.append(list.get(i).substring(0, 1));
			list.remove(i);
			list.add(i, temp.toString());
			temp.setLength(0);
		}
		list.forEach(System.out::println);
	}
}
