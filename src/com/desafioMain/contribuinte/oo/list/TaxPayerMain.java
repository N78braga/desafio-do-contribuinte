package com.desafioMain.contribuinte.oo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.desafio.Contribuinte.oo.list.TaxPayer;

public class TaxPayerMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Informe a quantidade de contribuintes: ");
		int contributor = sc.nextInt();
		Double[] qtd = new Double[contributor];
				
		System.out.println("");

		
		for(int i = 0; i < qtd.length; i++) {
			
			System.out.println("Digite os dados do " + (i + 1) + "° contribuinte:");
			System.out.print("Renda anual com salario: ");
			sc.nextLine();
			Double salary = sc.nextDouble();
			
			System.out.print("Renda anual com prestação de serviços: ");
			Double service = sc.nextDouble();
			
			System.out.print("Renda anual com ganho de capital: ");
			Double capital = sc.nextDouble();
			
			System.out.print("Gastos médicos: ");
			Double doctor = sc.nextDouble();
			
			System.out.print("Gastos educacionais: ");
			Double educational = sc.nextDouble();
			System.out.println("");
			
			TaxPayer taxpayer = new TaxPayer(salary, service, capital, doctor, educational);
			
			list.add(taxpayer);

		}
	    
		int count = 0;
		for(TaxPayer taxpayer: list) {
			count++;
			System.out.println("Rersumo do " + (count) + " contribuinte:");
			System.out.println();
			System.out.println(taxpayer);
			System.out.println();

			
		}
		sc.close();

	}

}
