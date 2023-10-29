package app.models;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

    public String nickname;
    private Jogador jogador;
    private ArrayList<Pergunta> listaPergunta[];
    private int taxaAcerto;
    private int taxaErro;
    private int tempoResposta;
    private Resposta repo[];

    public byte[] SorteioPergunta() {
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
        byte resp[] = new byte[listaPergunta.length];
        Random sorteia = new Random();
        Integer numeroEscolhido;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listaPergunta.length; ++i) {
            indicesDisponiveis.add(i);
        }
        for (int i = 0; i < listaPergunta.length; ++i) {
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            System.out.println(listaPergunta[numeroEscolhido].getTitulo());
            listaPergunta[numeroEscolhido].EmbaralharAlternativas();
            char respC = sc.next().charAt(0);
            resp[i] = (byte) jogador.escolherResposta(respC);

        }
        return resp;
    }

    public byte[] SorteioPergunta(String dif) {
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
        Random sorteia = new Random();
        Integer numeroEscolhido;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listaPergunta.length; ++i) {
            if (dif.equals(listaPergunta[i].getDificuldade())) {
                indicesDisponiveis.add(i);
            }
        }
        // Variavel de retorno das resposatas para c�lculo
        byte resp[] = new byte[listaPergunta.length - (listaPergunta.length - indicesDisponiveis.size())];
        for (int i = 0; i < listaPergunta.length - (listaPergunta.length - indicesDisponiveis.size()); ++i) {
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            System.out.println(listaPergunta[numeroEscolhido].getTitulo());
            listaPergunta[numeroEscolhido].EmbaralharAlternativas();
            char respC = sc.next().charAt(0);
            resp[i] = (byte) jogador.escolherResposta(respC);

        }
        return resp;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public ArrayList<Pergunta> getListaPergunta() {
        return listaPergunta;
    }

    public void setListaPergunta(ArrayList<Pergunta> listaPergunta) {
        this.listaPergunta = listaPergunta;
    }

    public int getTaxaAcerto() {
        return taxaAcerto;
    }

    public void setTaxaAcerto(int taxaAcerto) {
        this.taxaAcerto = taxaAcerto;
    }

    public int getTaxaErro() {
        return taxaErro;
    }

    public void setTaxaErro(int taxaErro) {
        this.taxaErro = taxaErro;
    }

    public Resposta[] getRepo() {
        return repo;
    }

    public void setRepo(Resposta[] repo) {
        this.repo = repo;
    }

    public void IniciarJogo() {

    }

    public void CalcularPontuacao(ArrayList<Resposta> respostas) {
        int pontos = 0;
        for (short i = 0; i < respostas.size(); i++) {
            Resposta resp = respostas.get(i);
            if (resp.getAcertou()) {
                pontos += resp.getPontuacaoPergunta();
            }
        }
        jogador.setPontuacaoFinal(pontos);
    }
}
