package ProjetcQuiz;

public class Jogador {

	private String nickname;

	private int pontuacaoFinal;

	private int acertos;

	public void contadorAcertos(boolean acerto) {
		if (acerto == true) {
			this.acertos++;
		}
	}

	public int escolherResposta(char resposta) {
		switch (resposta) {
		case 'A'|'a':
			return 1;
		case 'B'|'b':
			return 2;
		case 'C'|'c':
			return 3;
		case 'D'|'d':
			return 4;
		default:
			System.out.println("Opção inválida! Digite uma das alternativas!");
		}
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPontuacaoFinal() {
		return pontuacaoFinal;
	}

	public void setPontuacaoFinal(int pontuacaoFinal) {
		this.pontuacaoFinal = pontuacaoFinal;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

}
