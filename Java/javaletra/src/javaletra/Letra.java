package javaletra;

import java.util.Scanner;

public class Letra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		String nome;
		char l;
		int pos;
		
		System.out.print("Digite o seu nome: ");
		nome=input.nextLine();
		
		System.out.print("Que letra você deseja procurar: ");
	    pos =nome.indexOf(l=input.next().charAt(0));
	   
	    if(pos < 0)
	      System.out.println("A string nao contem a letra: "+ l);
	    else
	      System.out.println("A letra o foi encontrada  na posicao: " + pos);
	   
	    System.exit(0);
	}

}
