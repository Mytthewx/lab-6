package eu.mytthew;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;

public class SampleReturnClass {
	public String curtesyPhrase(String name, String surname, String text) {
		return text + " " + name + " " + surname + ".";
	}

	public String charSequence(String text, String type) {
		if (type.equals("big")) {
			text = text.toUpperCase(Locale.ROOT);
		}
		if (type.equals("small")) {
			text = text.toLowerCase(Locale.ROOT);
		}
		return text;
	}

	public boolean checkFinalExam(int passThreshold, List<Integer> points) {
		if (points.contains(0)) {
			return false;
		}
		int sum = 0;
		for (int i : points) {
			sum += i;
		}
		return sum > passThreshold;
	}

	public int howManyChar(String text, char sign) {
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			char temp = text.charAt(i);
			if (temp == sign) {
				counter++;
			}
		}
		return counter;
	}

	public int sumOfNumbers(int[] numbers) {
		return Arrays.stream(numbers).sum();
	}

	public int highestOrLowestNumber(int[] numbers, String choice) {
		int result = 0;
		if (choice.equals("max")) {
			OptionalInt optionalMax = Arrays.stream(numbers).max();
			if (optionalMax.isPresent()) {
				result = optionalMax.getAsInt();
			}
		}
		if (choice.equals("min")) {
			OptionalInt optionalMax = Arrays.stream(numbers).min();
			if (optionalMax.isPresent()) {
				result = optionalMax.getAsInt();
			}
		}
		return result;
	}
}
