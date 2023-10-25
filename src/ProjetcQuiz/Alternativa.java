package ProjetcQuiz;

public class Alternativa {
	
	private String Descricao;
	private boolean correta;
	
	
	public Alternativa(String Descricao, boolean correta){
		this.Descricao = Descricao;
		this.correta = correta;
	}


	public String getDescricao() {
		return Descricao;
	}


	public boolean getCorreta() {
		return correta;
	}

}
