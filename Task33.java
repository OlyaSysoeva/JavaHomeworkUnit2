package by.java.unit2.task3;

import java.util.Random;
import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������� ������ ������������������: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt ();
		}
		int [] mas = new int [n];
		
		rMas(mas);
		vozrast(mas);
		printMas(mas);
	}
		
		public static void rMas (int [] mas) {
			
			Random rand = new Random ();
			
			for (int i = 0; i < mas.length; i++) {
				mas [i] = rand.nextInt(5);
			}			
		}	
		public static void vozrast (int [] mas) {
			
			for (int i = 1; i < mas.length; i++) {
				if (mas[i -1] > mas [i]) {
					System.out.println("������������������ �� ������������");
					return;
				}
			}
					System.out.println("������������������ ������������");
					return;
				}
		public static void printMas(int [] mas) { 
		for (int i = 0; i < mas.length; i ++) {
			System.out.println("mas[" + i + "] = " + mas[i] + "; ");
		}
	}
}	


