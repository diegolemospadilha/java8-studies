package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println("Enter file full path:");
		
		final String PATH = "/home/lemospadilha/Documentos/Udemy Courses/Java8/files-java8-course/candidates-map.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
			
			Map<String, Integer> candidates = new LinkedHashMap<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String username = fields[0];
				Integer totalVotes = Integer.parseInt(fields[1]);
				
				boolean hasCandidate = candidates.containsKey(username);
				
				if(hasCandidate) {
					int votesSoFar = candidates.get(username);
					candidates.put(username, votesSoFar + totalVotes);
				} else {
					candidates.put(username, totalVotes);
				}
					
					
				line = br.readLine();
			}
			
			for(Entry<String, Integer> key: candidates.entrySet())
				System.out.println(key.getKey() + ": " + key.getValue());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
