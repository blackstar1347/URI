package respostas;

import java.util.Scanner;
import java.io.IOException;


public class Resolucao_1002 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
		
		double area, raio;
		double n = 3.14159;
		
		raio = entrada.nextDouble();
		double x = Math.pow(raio, 2);
		area = n * x;
		
		System.out.printf("A=%.4f\n",area);

	}

}
