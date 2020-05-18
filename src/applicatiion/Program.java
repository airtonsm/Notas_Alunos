package applicatiion;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();
		Student[] student = new Student[n];
		
				
		for(int i=0;i<student.length;i++) {
			System.out.print("Enter name student: ");	
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter age student: ");
			int age = sc.nextInt();
			System.out.print("Enter note student: ");
			double note = sc.nextDouble();
			student[i] = new Student(name, age, note);
			
		}
		
		double soma = 0.0;
		for(int i=0;i<student.length;i++){
			soma += student[i].getNote();
		}		
		
		System.out.println();
		double media = soma/n;		
		System.out.printf("Average student: %.2f%n", media);
		
		System.out.println();
		System.out.println("above average students: "); 
		for(int i=0;i<student.length;i++) {
			if(student[i].getNote() >= media) {				
				System.out.println(student[i]);	
			}
		}
		
		
		sc.close();

	}

}
