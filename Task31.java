package by.java.unit2.task3;

import java.util.Scanner;
import java.util.Random;

public class Task31 {

	public static void main(String[] args) {
		 
		int n = 0;
   		Scanner sc = new Scanner (System.in);
    	   
    	System.out.println ("Введите размер массива: ");
   		if (sc.hasNextInt()) {
   			n = sc.nextInt();
   		}
   		int [] mas = new int [n];	
   		rMas (mas);
		findSum (mas);
	}	
	public static void rMas (int [] mas) {
		
		   Random rand = new Random ();
			
			for (int i = 0; i < mas.length; i ++) {
				mas [i] = rand.nextInt (1000);
			}
		}
		public static void findSum (int [] mas) {
			
			int k = 0;
			Scanner sk = new Scanner (System.in);
			int sum = 0;
			
			System.out.println ("Введите число: ");
			if (sk.hasNextInt()) {
				k = sk.nextInt();
			}
			for (int i = 0; i < mas.length; i ++) {
				
				if ((mas[i] % k) == 0) {
					sum = sum + mas[i];
				}
			}
			if (sum == 0) {
				System.out.println ("Нет элементов, удовлетворяющих условиям поиска");
			} else {
			System.out.println ("Сумма элементов, кратных " + k + " = " + sum );
		}
		}	
	}


