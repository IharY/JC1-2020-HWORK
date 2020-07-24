package by.htp.les02.main;

/*
Требуется определить факториал числа, которое ввел пользователь.
 */

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int variable;
		System.out.println("Введите любое целое цисло до 20:");
		variable = sc.nextInt(); 
		long factorial = 1; // при значении variable>20 уже не хватает лонга !!
		for (int i = variable; i > 0; i--) {
			factorial *= i;
		}
		System.out.println("Факториал " + variable + " равен " + factorial);
	}
}
