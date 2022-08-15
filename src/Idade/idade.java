package Idade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> pessoa = new ArrayList<Integer>();

		System.out.println("Digite idade 1:");
		pessoa.add(ler.nextInt());
		System.out.println("Digite idade 2:");
		pessoa.add(ler.nextInt());
		System.out.println("Digite idade 3:");
		pessoa.add(ler.nextInt());
		Collections.sort(pessoa);// aqui coloca em order crescente
		System.out.println(pessoa);
		System.out.println(pessoa.get(1));
	}

}