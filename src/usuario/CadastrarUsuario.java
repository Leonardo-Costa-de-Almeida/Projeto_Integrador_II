package usuario;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadastrarUsuario {
	
	
	
	
	public static void cadastro(){
		
		List<Usuario> userList = new ArrayList<Usuario>();
		
		Scanner input = new Scanner(System.in);
		
	
		userList.add(new Usuario(input.next(), input.next()));
		userList.add(new Usuario(input.next(), input.next()));
		userList.add(new Usuario(input.next(), input.next()));
		for(Usuario user: userList) {
			System.out.println(user);
		}
		
	}
	
}
