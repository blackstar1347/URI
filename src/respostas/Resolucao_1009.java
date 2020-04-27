package respostas;

import java.io.IOException;
import java.util.Scanner;

public class Resolucao_1009 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String vendedor;
		double salario, total, vendas;
		int porcentagem;
		
		vendedor = entrada.next();
		salario = entrada.nextDouble();
		vendas = entrada.nextDouble();
		
		porcentagem = 15;
		
		total = (vendas * porcentagem/100) + salario ;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		
	}

}
