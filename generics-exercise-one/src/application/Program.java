package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> service = new PrintService();

		System.out.println("How many values? ");

		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			Integer value = sc.nextInt();
			service.addValue(value);
		}
		
		service.print();
		System.out.println("First: " + service.first());

	}

}
