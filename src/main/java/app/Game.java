package app;

import app.models.*;
import app.repository.Repository;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nickname;

        //Criando todos os Atributos para o Quiz
        Quiz GameQuiz = new Quiz();

        // Pega a lista de perguntas do repositório
        Repository repo = new Repository();
        ArrayList<Pergunta> perguntas = repo.getPerguntas();

        GameQuiz.setListaPergunta(perguntas);

//        byte respostas[] = new byte[perguntas.length];

        apresentacao();
        limpatela();
        nickname = pegaNickname(sc);
        
        Jogador player = new Jogador(nickname);

        //definições Jogador
        LocalDate dt_Jogo = LocalDate.now();
        player.setData(dt_Jogo);

        System.out.println(dt_Jogo);
        System.out.println("\t\tSeja Bem Vindo " + nickname + "\n"
                + "\t\t Vamos Iniciar o Quiz\n"
                + " \t\t Mas antes Deseja Escolher alguma Dificuldade?\n"
                + "1 - SIM\n"
                + "2 - NÃO\n");
        byte EscolhaDif = sc.nextByte();
        String dificuldade = "";
        if (EscolhaDif == 1) {
            System.out.println("1 - Fácil\n"
                    + "2 - Médio\n"
                    + "3 - Difícil\n");
            byte dif = -1;
            while (dif == -1) {
                try {
                    dif = sc.nextByte();
                } catch (InputMismatchException e) {
                    System.out.println("Ops .... Isso não e um numero, tente novamente");
                    dif = -1;
                    sc.nextLine();
                    continue;
                }

                switch (dif) {
                    case 1:
                        dificuldade = "Fácil";
                        break;
                    case 2:
                        dificuldade = "Médio";
                        break;
                    case 3:
                        dificuldade = "Difícil";
                        break;
                    default:
                        System.out.println("Opção inválida");
                        dif = -1;
                }
            }
            System.out.println("Dificuldade Selecionada: " + dificuldade);

        }

        GameQuiz.setJogador(player);

        if (dificuldade.equals("")) {
            respostas = GameQuiz.SorteioPergunta();
        } else {
            respostas = GameQuiz.SorteioPergunta(dificuldade);
        }

    }

    public static void apresentacao() {
        System.out.print("\n\n\t\t Bem Vindo ao QuizJava \n \n"
                + ""
                + "\tFeito por:\n"
                + ""
                + "\tEinstain Duarti\n"
                + "\tJosé Claion\n"
                + "\tLeander Batista\n"
                + "\tMatheus pantoja\n"
                + "\n\t\t Divirta-se :D\n");

        try {
            Thread.sleep(5000); // 5000 milissegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void limpatela() {
        try {
            //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        
//            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
//                    + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
//                    + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
//                    + "\n\n\n\n\n\n\n");
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String pegaNickname(Scanner sc) {
        System.out.println("Vamos começar, mas informe seu Nickname: ");

        String nickname = sc.next();
        boolean aprovado = verificarNickname(nickname);

        while (aprovado == true) {
            System.out.println("Ops... Você digitou um nome com símbolos da lista de proibição"
                    + "\n tente novamente: ");
            nickname = sc.next();
            aprovado = verificarNickname(nickname);
        }
        return nickname;
    }
    

    public static boolean verificarNickname(String nickname) {
        String proibicao = "!\"#$%&'()*+,./:;<=>?@[\\]^`{|}~";
        for (short i = 0; i < nickname.length() - 1; i++) {

            if (proibicao.contains(nickname.substring(i, i + 1))) {
                return true;
            }
        }
        return false;
    }
}
