package respostas;

import java.util.Scanner;
import java.io.IOException;

public class Resolucao_1005 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double A,B,MEDIA;
	
	A = entrada.nextDouble();
	B = entrada.nextDouble();
	
	MEDIA = ((A*3.5) + (B*7.5))/11;
	System.out.printf("MEDIA = %.5f\n", MEDIA);
	

	}

}
