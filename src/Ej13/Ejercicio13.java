package Ej13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String suma = "+";
		String resta = "-";
		String mult = "*";
		String div = "/";
		String exp = "^";
		String resto = "%";
		
		String num = JOptionPane.showInputDialog(null, "Introduce un numero");
		int nume = Integer.parseInt(num);
		String numer = JOptionPane.showInputDialog(null, "Introduce otro numero");
		int numero = Integer.parseInt(numer);

		String signo = JOptionPane.showInputDialog(null, "Introduce un signo");
		
        if (signo.equals(suma)) {
            JOptionPane.showMessageDialog(null, "La suma de los dos numeros es " + (nume + numero));
        } else if (signo.equals(resta)) {
            JOptionPane.showMessageDialog(null, "La resta de los dos numeros es " + (nume - numero));
        } else if (signo.equals(mult)) {
            JOptionPane.showMessageDialog(null, "La multiplicacion de los dos numeros es " + (nume * numero));
        } else if (signo.equals(div)) {
            if (numero != 0) {
                JOptionPane.showMessageDialog(null, "La division es " + (nume / (double) numero));
            }
        } else if (signo.equals(exp)) {
            double resultado = Math.pow(nume, numero);
            JOptionPane.showMessageDialog(null, "El exponente de los dos numeros es " + resultado);
        } else if (signo.equals(resto)) {
            if (numero != 0) {
                JOptionPane.showMessageDialog(null, "El resto de los dos numeros es " + (nume % numero));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalido");
        }
		
		sc.close();
			
	}

}
