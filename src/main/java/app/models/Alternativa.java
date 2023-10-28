package app.models;

public class Alternativa {
	
	private String Descricao;
	private boolean correta;

	public String getDescricao() {
		return Descricao;
	}

	public boolean getCorreta() {
		return correta;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public void setCorreta(boolean correta) {
		this.correta = correta;
	}

}
