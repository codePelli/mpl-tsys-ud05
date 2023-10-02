package Ej06;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

	final double iva = 0.21;
	
	Scanner sc = new Scanner(System.in);
	
	String pre = JOptionPane.showInputDialog(null, "Introduce un precio");
	double precio = Double.parseDouble(pre);
	precio = (precio*iva) + precio;
	sc.close();
	
	JOptionPane.showMessageDialog(null, "El precio final es  " + precio);
	
	}

}
