package respostas;

import java.util.Scanner;
import java.io.IOException;

public class Resolucao_1007 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A,B,C,D,DIFERENCA;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		DIFERENCA = ((A*B)-(C*D));
		
		System.out.println("DIFERENCA = " +DIFERENCA);
		
	}

}
