package Ej04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = Math.PI;
		
		
		String radio = JOptionPane.showInputDialog(null, "Introduce el radio");
		double circulo = Double.parseDouble(radio);
		sc.close();
		
		double area = pi * Math.pow(circulo, 2);
		
		
		
		JOptionPane.showMessageDialog(null, "El area del circulo es " + area);

	}

}
