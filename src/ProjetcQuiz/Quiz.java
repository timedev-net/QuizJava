package ProjetcQuiz;
import java.util.ArrayList;
import java.util.Random;
public class Quiz {

	public String nickname;
	private Jogador jogador;
	private Pergunta listaPergunta[];
	private int taxaAcerto;
	private int taxaErro;
	private int tempoResposta;
	private Resposta repo[];
	
	public void IniciarJogo() {
		
	}

 	public void SorteioPergunta()
	{
		ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
		Random sorteia = new Random();
		byte numeroEscolhido;
		
		for (int i = 0; i < listaPergunta.length; i++) 
		{
            indicesDisponiveis.add(i);
        }
		for (int i = 0; i < listaPergunta.length; i++) 
		{
			numeroEscolhido = (byte) sorteia.nextInt(indicesDisponiveis.size());
			indicesDisponiveis.remove(numeroEscolhido);
			System.out.println(listaPergunta[numeroEscolhido].getTitulo());
			listaPergunta[numeroEscolhido].EmbaralharAlternativas();
			
		}
	}

}
