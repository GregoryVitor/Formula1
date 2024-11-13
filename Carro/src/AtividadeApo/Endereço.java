package AtividadeApo;
public class Endereço {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String cep;
	private String telefone;
	public void Endereco(String estado, String cidade, String bairro, String rua, String cep, String telefone) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.telefone = telefone;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public String getRua() {
		return rua;
	}
	public String getCep() {
		return cep;
	}
	public String getTelefone() {
		return telefone;
	}
}
