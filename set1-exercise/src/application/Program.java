package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import domain.User;

public class Program {

	public static void main(String[] args) {
		System.out.println("Enter file full path:");
		Scanner sc = new Scanner(System.in);
		
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<User> users = new HashSet<User>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date date = Date.from(Instant.parse(fields[1]));
				users.add(new User(username, date));
				line = br.readLine();
			}
			
			System.out.println("Total users: " + users.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		

	}

}
