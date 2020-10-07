package funcoesMenu;
import java.util.Scanner;
public class LoginUsuario {
	//LoginUsuario.logar();
	
	
	public static void logar() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome de Usuario: ");
		String nome = input.nextLine();
		System.out.println("Digite sua senha: ");
		String senha = input.nextLine();
		
		if(CadastrarUsuario.checkOnMap(nome) == true) {
			if (CadastrarUsuario.userMap.get(nome).getSenha().equals(senha)) {
				System.out.println("logou");
			}else {
				System.out.println("n logou");
			}
		}
		
	}
}
