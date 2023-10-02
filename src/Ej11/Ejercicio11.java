package Ej11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ele = JOptionPane.showInputDialog(null, "Selecciona el dia de la semana");

		switch (ele) {
			case "Lunes":
			case "Martes":
			case "Miercoles":
			case "Jueves":
			case "Viernes":
				System.out.println("El dia " + ele + " es laborable");
				break;
			case "Sabado":
			case "Domingo":
				System.out.println("El dia " + ele + " no es laborable");
				break;
			default :
				System.out.println("Introduce un dia de la semana con la primera letra en mayuscula");
		}
		
		sc.close();

		
		
		

	}

}
