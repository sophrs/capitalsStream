package captialsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalsStream {

	public static void main(String[] args) {	

		List<String>introduction = Arrays.asList("Hello","it's","Dale");

		intro(introduction).stream().forEach(System.out::print);
		
	}

	public static List<String> intro(List<String> introduction) {

		return introduction.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());

	}
}






