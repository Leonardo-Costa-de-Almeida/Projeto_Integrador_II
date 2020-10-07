import menus.Menu_Principal;
import tabuleiro.Tabuleiro;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
////		Tabuleiro  tabuleiro = new Tabuleiro();
////		
//		tabuleiro.criar();
		
		Scanner input = new Scanner(System.in);
		System.out.println("escolha uma opcao: ");
		String escolha = input.nextLine();
		String doEscolha = "sair";
		do {
			switch (escolha) {
			
			case "1":
				Menu_Principal.Cadastrar();
				break;
			case "2": 
				Menu_Principal.Login();
				break;
				
			case "4":
				System.out.println("sair");
				doEscolha = "4";
				break;
			default:
				
				
				
			}
			
			if(doEscolha != "4") {
				System.out.println("escolha novamente: ");
				escolha = input.nextLine();
			}
			
		}while (doEscolha != "4");
		
		System.out.println("uwu");
		
		
	}

}
