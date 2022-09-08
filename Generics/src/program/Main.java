package program;

import java.util.Scanner;

import service.PrintService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("How many values do you want to add? ");
		int n = sc.nextInt();
				
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Nome: ");
			ps.addValue(sc.nextInt());					
		}
		
		ps.print();
		System.out.println(ps.first());
	}
}
