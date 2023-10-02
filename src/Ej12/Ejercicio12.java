package Ej12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pass = "asdf";
		int intentos = 3;

		for(int i = 1; i <= intentos; intentos++) {
			
			String password = JOptionPane.showInputDialog(null, "Introduce la contrasenia");
			
			if (password.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			} else {
				int intRestante = intentos - i;
				JOptionPane.showMessageDialog(null, "Te quedan " + intRestante + " intento/s");
				
				if(intRestante < intentos) {
					JOptionPane.showMessageDialog(null, "Prueba de nuevo");
				} else {
					JOptionPane.showMessageDialog(null, "Has alcanzado el numero maximo de intentos");
				}
			}
		}

	}

}


