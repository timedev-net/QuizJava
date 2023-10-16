package ProjetcQuiz;

public class Resposta {
	
	private Jogador jogador;
	private Pergunta pergunta;
	private boolean acertou;
	private int pontuacaoPergunta;
	
	public boolean VerificarResposta(Pergunta pergunta, int alternativa){
		Alternativa resp = pergunta.getAlternativas(alternativa);
		this.acertou = resp.getCorreta();
		return resp.getCorreta();
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public boolean getAcertou() {
		return acertou;
	}

	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

	public int getPontuacaoPergunta() {
		return pontuacaoPergunta;
	}

	public void setPontuacaoPergunta(int pontuacaoPergunta) {
		this.pontuacaoPergunta = pontuacaoPergunta;
	}
	

}
