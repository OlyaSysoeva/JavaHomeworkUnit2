package by.java.unit2.task3;

import java.util.Random;
import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Введите размер массива: ");
		
		if (sc.hasNextInt()) {
			n = sc.nextInt ();
		}
		
		int [] mas = new int [n];
		
        rMas(mas);
        mas0 (mas);
	}
	public static void rMas (int [] mas) {
			
	    Random rand = new Random ();
				
		for (int i = 0; i < mas.length; i ++) {
			mas [i] = rand.nextInt (5);
		}	
	}
	public static void mas0 (int [] mas) {
		 
		 int number = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				number = number + 1;
			}
	}
		System.out.println("Количество нулей в массиве = " + number);
		
		int [] mas00 = new int [number];
		int index = 0;
		
		for (int j = 0; j < mas.length; j ++) {
			if (mas[j] == 0) {
				mas00 [index] = j;
				index = index + 1;
				System.out.print("Индекс(ы) нулевых элементов: ");
			}
		}
		for (int z = 0; z < mas00.length; z++) {
			System.out.println (mas00[z] + " ");
		}
		}
		}
	

