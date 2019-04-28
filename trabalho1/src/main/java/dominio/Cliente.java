package dominio;

public class Cliente {
	public String nome;
	public Endereco endereco;
	public Cpf cpf;
	public Telefone telefone;
	public Venda venda;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
