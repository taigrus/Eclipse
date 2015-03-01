package Prueba;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args){
		//nada
		System.out.println("Por favor escriba algo");
		String textoTeclado;
		Scanner textoScanner;
		int longitudTexto=0;
		int caracterActual=0;
		textoScanner=new Scanner(System.in);
		textoTeclado=textoScanner.nextLine();
		longitudTexto=textoTeclado.length();
		System.out.println("El texto ingresado tiene " + longitudTexto + " caracteres");
		while(caracterActual<longitudTexto){
			System.out.println(textoTeclado.substring(caracterActual, caracterActual+1).toUpperCase());
			caracterActual++;
		}
	}
}
