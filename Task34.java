package by.java.unit2.task3;

import java.util.Scanner;
import java.util.Random;

public class Task34 {

	public static void main(String[] args) {

	 int n = 0;
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("Введите размер последовательности: ");
	 if (sc.hasNextInt()) {
		 n = sc.nextInt();
	 }
	 int [] mas = new int [n];
	 
	 rMas(mas);
	 printMas(mas);
	 masCh(mas);
	 printMasCh(mas); 
	 }
	public static void rMas (int [] mas) {
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt (100);
		}
	}
	public static void printMas(int [] mas) { 
		for (int i = 0; i < mas.length; i ++) {
			System.out.print(mas[i] + " ");
		}
	}
    public static void masCh (int [] mas) {
    	int number = 0;
    	for (int i = 0; i < mas.length; i++) {
    		if ((mas[i] % 2) == 0) {
    			number = number + 1;
    		}
    	}
    	System.out.println();
    	System.out.println ("Количество чётных чисел в массиве: " + number);
    	
    	int [] masChet = new int [number];
    }
    	public static void printMasCh(int [] masChet) { 
    		for (int i = 0; i < masChet.length; i ++) {
    			if ((masChet[i] % 2) == 0) {
    			System.out.println("masCh[" + i + "] = " + masChet[i] + "; ");
    		    }
    		}		
    	}
    }

