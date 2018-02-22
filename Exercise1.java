package by.java.unit2.exercise1;

import java.util.Scanner;
import java.util.Random; 

public class Exercise1 {

	public static void main(String[] args) {
		 
		
		int n = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Введите число элементов массива: ");
		
		    if (sc.hasNextInt()) {
			n = sc.nextInt();
		    }
			if (n < 0) {
			System.out.println ("Неверное значение, введите целое положительное число: ");
		    }
			
			double [] mas = new double [n];
			
				initMas(mas);		
		        maximum (mas);
		        minimum (mas);
		        sortirovka (mas);
			}
	public static void initMas(double [] mas) {
		
		double k = 0;
		Scanner sk = new Scanner (System.in);
		
		for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите элемент массива: ");
			if (sk.hasNextDouble()) {
				k = sk.nextDouble();
			}
			mas[i] = k;
		}
	}
	public static void maximum (double [] mas) {
		
		double max = mas [0]; 
		int index = 0; 
		
		
		for (int i = 0; i < mas.length; i ++) {
			if (max < mas [i]) {
				max = mas [i];
				index = i;
			}
		}
		System.out.println("Максимальный элемент массива = " + max + ", его индекс = " + index);
	}
	public static void minimum (double [] mas) {
		
		double min = mas [0];
		int index = 0;
		
		for (int i = 0; i < mas.length; i ++) {
			if (min > mas [i]) {
				min = mas [i];
				index = i;
			}
		}
		System.out.println("Минимальный элемент массива = " + min + ", его индекс = " + index);
	}
	public static void sortirovka (double [] mas) {
		
		for (int i = 0; i < mas.length; i ++) {
			int minim = i;
			for (int j = i + 1; j < mas.length; j ++) {
				if (mas[j] < mas[minim]) {
					minim = j;					
				}				
			}	
			double per = mas[minim];
			
			System.out.println ("Результат сортировки методом прямого выбора = " + per);
		}		
	}			
}


