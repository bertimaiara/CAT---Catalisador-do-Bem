package ProjetoDoacao;

import java.util.Scanner;

public class InstLuizaMel {
	void luizaMel () {
		
		FormasDePagamento form = new FormasDePagamento();
	
		Scanner leia = new Scanner(System.in);
	
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println("Luiza Mell - instituto de ajuda aos animais	");
		System.out.println();
		System.out.println("Qual valor voc� quer doar: ");
		System.out.println("[1]  R$ 10,00 (Contribuir� com: um pacote de ra��o)");
		System.out.println("[2]  R$ 50,00 (Contribuir� com: uma castra��o)");
		System.out.println("[3]  R$ 100,00 (Contribuir� com: um consulta ao veterin�rio + mantimentos para o abrigo)");
		System.out.print("---> ");
		int numero = leia.nextInt();
	
		switch (numero) {
	 
			case 1:
				form.formaDePagamento();
			break;
		
			case 2:
				form.formaDePagamento();
			break;
		
			case 3:
				form.formaDePagamento();
			break;
			
			}	
	}
}