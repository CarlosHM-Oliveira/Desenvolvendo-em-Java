package mas_fem;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sexo, qtHomens=0, qtMulheres=0;
		float altura, somaH=0, medH=0, maior=0, menor=0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0;i<10;i++) {
		System.out.print("Escolha o sexo da pessoa (1-Homens 2-Mulheres): ");
		sexo= input.nextInt();
		System.out.print("Digite a Altura: ");
		altura=input.nextFloat();
		if (sexo==1) {
		qtHomens++;
		somaH=somaH+altura;
		}else if (sexo==2) {
			qtMulheres++;
		}else {
			System.out.println("Opção de seco invalida");
		}
		
		if (altura>maior) {
			maior=altura;
		}else if (altura<menor) {
			menor=altura;
			}
		}
		medH= somaH/qtHomens;
		
		System.out.println("A maior altura do grupo é de "+maior+" m e a menor de "+menor+" m");
		System.out.println("ja a media de altura é de "+medH+" m");
		System.out.println("A Quantidades de mulheres é de "+qtMulheres);
		
		input.close();
	}
}
