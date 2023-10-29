package app.models;

import app.enums.Dificuldade;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pergunta {

    private String titulo;
    private List<Alternativa> alternativas;
    private ArrayList<Integer> ordemSorteio = new ArrayList<>();
    private int pontuacao;
    private Dificuldade dificuldade;

    public Pergunta(String titulo, Dificuldade dificuldade, List<Alternativa> alternativas) {
        this.titulo = titulo;
        this.dificuldade = dificuldade;
        if (dificuldade == Dificuldade.FACIL) this.pontuacao = 5;
        if (dificuldade == Dificuldade.MEDIO) this.pontuacao = 10;
        if (dificuldade == Dificuldade.DIFICIL) this.pontuacao = 15;
        this.alternativas = alternativas;
    }

    public void EmbaralharAlternativas() {
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();

        Random sorteia = new Random();
        Integer numeroEscolhido;

        for (int i = 0; i < alternativas.size(); i++) {
            indicesDisponiveis.add(i);
        }
        for (int i = 0; i < alternativas.size(); i++) {
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            ordemSorteio.add((int) numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            switch (i) {
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
            System.out.println(alternativas.get(numeroEscolhido).getDescricao());
        }
    }

//    public int Pontos_Dificuldade(String dificuldade) {
//        switch (dificuldade) {
//            case "Facil":
//                return 5;
//            case "Medio":
//                return 10;
//            case "Dificil":
//                return 15;
//        }
//        return 0;
//    }

    public Dificuldade getDificuldade() {
        return this.dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getPontos() {
        return pontuacao;
    }

    public void setPontos(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String texto) {
        this.titulo = texto;
    }

    public Alternativa getAlternativas(int pos) {
        return alternativas.get(pos);
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

}
