package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import domain.Employee;

public class Program {
	
	public static final String ENTER_FULL_FILE_MESSAGE = "Enter full file path:";
	public static final String ENTER_SALARY_MESSAGE = "Enter salary:";
	public static final String EMAIL_EMPLOYEE_MESSAGE = "Email of people whose salary is more than ";
	public static final String SUM_SALARY_MESSAGE = "sum of salary of people whose name starts with 'M': ";
	public static final String ERROR_MESSAGE = "Error: ";
	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print(ENTER_FULL_FILE_MESSAGE);
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.println(ENTER_SALARY_MESSAGE);
			Double salary = sc.nextDouble();

			String firstMessage = formatMessageEmailEmployeeE(salary);

			System.out.println(firstMessage);
			list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted()
					.forEach(System.out::println);

			double sum = list.stream().filter(e -> e.getName().toUpperCase().startsWith("M")).map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println(SUM_SALARY_MESSAGE + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println(ERROR_MESSAGE + e.getMessage());
		}
		sc.close();
	}

	public static String formatMessageEmailEmployeeE(Double salary) {
		StringBuilder builder = new StringBuilder(EMAIL_EMPLOYEE_MESSAGE)
				.append(String.format("%.2f", salary)).append(":");

		return builder.toString();
	}

}
