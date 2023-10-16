package ProjetcQuiz;

public class Resposta {
	
	private Jogador jogador;
	private Pergunta pergunta;
	private boolean acertou;
	private int pontuacaoPergunta;
	
	boolean VerificarResposta(Pergunta pergunta, int alternativa){
		this.acertou = pergunta.alternativa[alternativa];
	}

}
