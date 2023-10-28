package app.models;

import java.time.LocalDate;

public class Jogador {
	
	private String nickname;
	private int pontuacaoFinal;
	private byte acertos;
	private LocalDate data;
	
	public int escolherResposta(char resposta) {
		switch (resposta) {

		case 'a' | 'A':
			return 1;
		case 'b' | 'B':
			return 2;
		case 'c' | 'C':
			return 3;
		case 'd' | 'D':
			return 4;
		case 'p' | 'P':
			return 0;
		default:
			System.out.println("Erro Resposta invalida, digite uma op��o v�lida");
		}
		return 0;
	}
	
	public void contadorAcertos(boolean acerto) {
		if (acerto == true)
			this.acertos++;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Jogador(String nickname) {
		this.nickname = nickname;
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

	public byte getAcertos() {
		return acertos;
	}

	public void setAcertos(byte acertos) {
		this.acertos = acertos;
	}
}
