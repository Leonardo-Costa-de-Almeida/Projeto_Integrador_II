import menus.Menu_Principal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
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
				System.out.println("caso seja 2");
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
