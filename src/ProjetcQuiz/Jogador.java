package ProjetcQuiz;

import java.time.LocalDate;

public class Jogador {

	private String nickname;

	private int pontuacaoFinal;

	private int acertos;
	
	private LocalDate data;

	public void contadorAcertos(boolean acerto) {
		if (acerto == true) {
			this.acertos++;
		}
	}
	
	public int escolherResposta(char resposta) {
		switch (resposta) {
		case 'P':
			return 0;
		case 'p':
			return 0;
		case 'A':
	        return 1;
	    case 'a':
	        return 1;
	    case 'B':
	        return 2;
	    case 'b':
	        return 2;
	    case 'C':
	        return 3;
	    case 'c':
	        return 3;
	    case 'D':
	        return 4;
	    case 'd':
	        return 4;
	    default: System.out.println("Opção inválida! Escolha uma das alternativas!");
	    }
	     return 0;
	}
	
	public String escolherDificuldade(int dificuldade) {
	    switch (dificuldade) {
	    case 1:
	        return "Facil";
	    case 2:
	        return "Medio";
	    case 3:
	        return "Dificil";
	    default:
	        System.out.println("Opção inválida! Escolha uma das opções!");
	    }
	     return "null";
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
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
