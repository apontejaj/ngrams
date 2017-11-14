package hub;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}
	
	public Main() {
		
		System.out.println(lorcan("inengineering", 2));
		
	}
	
	public String lorcan(String word, int numberOfLetters) {
		
		String answer = "";
		String possibleAnswer = "";
		int counterPossibleAnswer = 0;
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		String ngram = "";
		int counterAnswer = 0;
				
		for  (int i = 0; i <= word.length() - numberOfLetters ; i++ ) {
			
			ngram = "";
			for (int j = i ; j < i + numberOfLetters; j++ ) {
				
				ngram += word.charAt(j);
				
			}
			
			if (count.containsKey(ngram)){
				int value = count.get(ngram) + 1;
				count.put(ngram, value);
				
			} 
			else {
				count.put(ngram, 1);
				
			}
			
		}
				
		for (Entry <String, Integer> entry : count.entrySet()) {
			
			counterPossibleAnswer = 0;
			possibleAnswer = entry.getKey();
			counterPossibleAnswer = entry.getValue();
			
			if (counterAnswer < counterPossibleAnswer) {
				answer = possibleAnswer;
				counterAnswer = counterPossibleAnswer;
				
			}
			
		}
		
		return answer;
		
	}

}
