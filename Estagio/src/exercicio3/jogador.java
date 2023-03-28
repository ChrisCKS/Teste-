package exercicio3;

import java.util.Scanner;

public class jogador {
	
	//DIGITAR A IDADE DO JOGADOR PARA SE SABER EM QUAL CATEGORIA ELE JOGARÁ

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do jogador: ");
		idade = sc.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Categoria: Infantil A");
		}
		else if(idade >= 8 && idade <= 11) {
			System.out.println("Categoria: Infantil B");
		}
		else if(idade == 12 || idade == 13) {
			System.out.println("Categoria: Juvenil A");
		}
		else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		}
		else
			System.out.println("Categoria: Adulto");
		
	}

}
