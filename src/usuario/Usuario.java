package usuario;

public class Usuario {
	
	private String nome;
	private String senha;
	private int id;
	
	// construtor
	
	
	

	public Usuario(String nome, String senha) {
		
		this.nome = nome;
		this.senha = senha;
		this.id = Contador.getInstancia().getIdUnico();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.senha + " " + this.id;
	}
}
