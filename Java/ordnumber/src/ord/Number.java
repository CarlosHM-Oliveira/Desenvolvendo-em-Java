package ord;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		System.out.print("Informe o Primeiro valor: ");
		int num1= Integer.parseInt(input.nextLine());
		System.out.print("Informe o Segundo valor: ");
		int num2= Integer.parseInt(input.nextLine());
		System.out.print("Informe o Terceiro valor: ");
		int num3= Integer.parseInt(input.nextLine());
		
		if (num1 > num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		if (num2 > num3) {
			int temp=num2;
			num2=num3;
			num3=temp;
		}
		if (num1 > num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		
		System.out.println("Os numeros ordenados em ordem cresente são:");
		System.out.println(num1+" "+num2+" "+num3);
		System.out.println("\n");

	}

}
