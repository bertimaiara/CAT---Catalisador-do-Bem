package ProjetoDoacao;

import java.util.Scanner;

public class InstMedicos {
	void medicos () {
		
		FormasDePagamento form = new FormasDePagamento();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.println("M�dicos sem Fronteiras - cuidados de sa�de no mundo inteiro");
	    System.out.println();
		System.out.println("Qual valor voc� quer doar: 																		  ");
		System.out.println("[1] R$ 10,00 (Contribuir� com: um medicamento)													  ");
		System.out.println("[2] R$ 50,00 (Contribuir� com: um atendimento m�dico)											  ");
		System.out.println("[3] R$ 100,00 (Contribuir� com: um atendimento m�dico + equipamentos necess�rios para atendimento)");
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
