package Ej10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ven = JOptionPane.showInputDialog(null, "Introduce un numero de ventas");
		int ventas = Integer.parseInt(ven);
		int sum = 0;
		
		for (int x = 0; x <= ventas; x++) {
			String num = JOptionPane.showInputDialog(null, "Introduce la venta");
			int numero = Integer.parseInt(num);
			sum = sum + numero;
		}
		
		sc.close();

		System.out.println("La suma de las ventas es " + sum);
	}

}
