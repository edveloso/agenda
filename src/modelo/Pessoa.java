package modelo;

public class Pessoa {

	private String nome;
	
	private String telefone;
	
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (telefone != null ? "telefone=" + telefone + ", " : "")
				+ (email != null ? "email=" + email : "") + "]";
	}
	
	
	
}
