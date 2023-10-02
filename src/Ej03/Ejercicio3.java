package Ej03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
		sc.close();
		
		JOptionPane.showMessageDialog(null, "Bienvenid@ " + nombre);
	}

}
