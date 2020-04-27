package respostas;
import java.util.Scanner;
import java.io.IOException;

public class Resolucao_1001 {
	
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
	
	int A;
	int B;
	int X;
	
	A = scan.nextInt();
	B = scan.nextInt();
	X = A+B;
	
	System.out.println("X = "+X);
    
    }

}