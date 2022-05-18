package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}
         public boolean esCuadradoPerfecto(int n) {
		if (cuadrado((int) Math.sqrt(n)) == n) {//le sacamos raiz al numero y luego lo metemos al  metodo cuadrado que hara elevarlos a la 2 y si es igual mismo numero inicial votara true

			return true;
		} else {
			return false;
		}
	}

	public int cuadrado(int numero) {// recursividad
		if (numero == 1)// caso trivial n(1)=1
			return 1;
		else
			return 2 * numero - 1 + cuadrado(numero - 1);// caso general n=2*n-1+n(n-1)
	}
}
