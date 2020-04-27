package respostas;

import java.io.IOException;
import java.util.Scanner;

public class Resolucao_1008 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int funcionario, horasTrabalhadas;
		double salario, valorHora;
		
		funcionario = entrada.nextInt();
		horasTrabalhadas = entrada.nextInt();
		valorHora = entrada.nextDouble();
		
		salario = (horasTrabalhadas * valorHora);
		
		System.out.println("NUMBER = " +funcionario);
		System.out.printf("SALARY = U$ %.2f\n" ,salario);
		
	}

}
