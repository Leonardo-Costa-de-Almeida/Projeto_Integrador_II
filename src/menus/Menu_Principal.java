package menus;
import java.util.Scanner;


import funcoesMenu.CadastrarUsuario;
import funcoesMenu.LoginUsuario;

public  class  Menu_Principal {
	Scanner input = new Scanner(System.in);
	
	

	public static void Cadastrar() {
		CadastrarUsuario.cadastro();
	}
	public static void Login() {
		LoginUsuario.logar();
	}
	
	
	
	public static void Tutorial() {
		//chamar tutorial
	}
	
	public static void Sair() {
		//mensagem
	}
}
