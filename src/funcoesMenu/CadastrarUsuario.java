package funcoesMenu;
import java.util.*;

import usuario.Usuario;

public class CadastrarUsuario {
		public static HashMap<String,Usuario> userMap = new  HashMap<String, Usuario>();
	
		public CadastrarUsuario(HashMap<String, Usuario> userMap) {
			super();
			CadastrarUsuario.userMap = userMap;
		}
		
	public HashMap<String, Usuario> getUserMap() {
			return userMap;
		}

		public static void setUserMap(String nome, Usuario usuario) {
			CadastrarUsuario.userMap.put(nome, usuario);
		}
		public static boolean checkOnMap(String nome ) {
			return userMap.containsKey(nome);
		}

	public static void cadastro() {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Usuario  Nome: ");
		String nome1 = input.nextLine();
		System.out.println("Usuario  senha: ");
		String senha1 = input.nextLine();
		
		boolean checa = checkOnMap(nome1);
		System.out.println(checa);
		if (checa == true) {
			System.out.println("nome de usuario ja existe");
		}
		else{
			
			
			Usuario usuario = new Usuario(nome1, senha1);
			setUserMap(nome1, usuario);
			System.out.println(checkOnMap(nome1));
		}
		
		
//		Usuario usuario = new Usuario(nome1, senha1);
	}

	
}