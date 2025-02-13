package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		    double num1, num2, resultado;
		    char operador;

		    System.out.print("Digite o primeiro número: ");
		    num1 = scanner.nextDouble();

		    System.out.print("Digite o segundo número: ");
		    num2 = scanner.nextDouble();

		    System.out.print("Digite a operação desejada (+, -, * ou /): ");
		    operador = scanner.next().charAt(0);

		    switch (operador) {
		      case '+':
		        resultado = num1 + num2;
		        System.out.println("Resultado: " + resultado);
		        break;
		      case '-':
		        resultado = num1 - num2;
		        System.out.println("Resultado: " + resultado);
		        break;
		      case '*':
		        resultado = num1 * num2;
		        System.out.println("Resultado: " + resultado);
		        break;
		      default:
		        System.out.println("Operador inválido.");
		        break;
		    }

		    scanner.close();
	}

}
