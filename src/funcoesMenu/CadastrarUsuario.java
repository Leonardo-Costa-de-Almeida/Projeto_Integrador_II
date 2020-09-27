package funcoesMenu;

import java.util.Scanner;

import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class CadastrarUsuario {
	
	
	
	
	public static void cadastro(){
		
		List<Usuario> userList = new ArrayList<Usuario>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Usuario  Nome: "  );
		String nome1 = input.nextLine();
		System.out.println("Usuario  senha: "  );
		String senha1 = input.nextLine();
		
		String procuranome = nome1;
		if(userList.contains(procuranome)) {
				System.out.println("nome ja existe");
			
		}
		userList.add(new Usuario(nome1, senha1));
		
		for(Usuario user: userList) {
			
				System.out.println(user);
			
		
		
		}
		
	}

}
