package Ej05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		String num = JOptionPane.showInputDialog(null, "Introduce un numero");
		double numero = Double.parseDouble(num);
		sc.close();
		
		if (numero % 2 == 0) {
			System.out.println("El numero " + num + " es divisible entre 2.");
		} else {
			System.out.println("El numero " + num + " no es divisible entre 2.");
		}

	}

}
