package template;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec=new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome= tec.nextLine();
		System.out.print("Digite a nota: ");
		Float nota= tec.nextFloat();
		System.out.format("A Nota de %s é de %.1f \n", nome, nota);
		
		
	}

}
