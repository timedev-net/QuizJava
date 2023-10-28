package app.models;
import java.util.ArrayList;
import java.util.Random;
public class Pergunta {
	
	private String titulo;
	private Alternativa[] alternativas; 
	private ArrayList<Integer> ordemSorteio = new ArrayList<>();
	private int pontos;
	private String dificuldade;
	
	public void EmbaralharAlternativas() {
		ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
		
		Random sorteia = new Random();
		Integer numeroEscolhido;
		
		for (int i = 0; i < alternativas.length; i++) {
            indicesDisponiveis.add(i);
        }
		for (int i = 0; i < alternativas.length; i++) {
			numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
			numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
			ordemSorteio.add((int) numeroEscolhido);
			indicesDisponiveis.remove(numeroEscolhido);
			switch(i)
			{
			case 0:
				System.out.print("A - ");
				break;
			case 1:
				System.out.print("B - ");
				break;
			case 2:
				System.out.print("C - ");
				break;
			case 3:
				System.out.print("D - ");
				break;
			}
			System.out.println(alternativas[numeroEscolhido].getDescricao());
        }
	}
	
	/*public void EmbaralharAlternativas(String dif) {
		ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
		
		Random sorteia = new Random();
		byte numeroEscolhido;
		
		for (int i = 0; i < alternativas.length; i++) {
            if(dif.equals(this.dificuldade))
            	indicesDisponiveis.add(i);
        }
		for (int i = 0; i < alternativas.length; i++) {
			numeroEscolhido = (byte) sorteia.nextInt(indicesDisponiveis.size());
			ordemSorteio.add((int) numeroEscolhido);
			indicesDisponiveis.remove(numeroEscolhido);
			System.out.println(alternativas[numeroEscolhido].getDescricao());
        }
	}*/
	public int Pontos_Dificuldade(String dificuldade) 
	{
		switch(dificuldade)
		{
		case "Facil":
			return 5;
		case "Medio":
			return 10;
		case "Dificil":
			return 15;
		}
		return 0;
	}
	
	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String texto) {
		this.titulo = texto;
	}

	public Alternativa getAlternativas(int pos) {
		return alternativas[pos];
	}

	public void setAlternativas(Alternativa[] alternativas) {
		this.alternativas = alternativas;
	}
	
}
