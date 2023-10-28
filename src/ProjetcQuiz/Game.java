package ProjetcQuiz;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nickname;
		
		//Criando todos os Atributos para o Quiz
		Quiz GameQuiz = new Quiz();
		
		//Perguntas e alternativas
		Pergunta listaPergunta[] = new Pergunta[3];
		
		for (int i = 0; i < listaPergunta.length; i++)
		{
			 listaPergunta[i] = new Pergunta();
		}
		
		listaPergunta[0].setTitulo("Qual o operador lógico *e* em Java?");
		listaPergunta[0].setDificuldade("Facil");
		listaPergunta[0].Pontos_Dificuldade(listaPergunta[0].getDificuldade());
			
		Alternativa alternativas0[] = new Alternativa[4];
		for(int i = 0; i < alternativas0.length; i++)
		{
			alternativas0[i] = new Alternativa();
		}
		alternativas0[0].setDescricao("||");
		alternativas0[0].setCorreta(false);
		alternativas0[1].setDescricao("!");
		alternativas0[1].setCorreta(false);
		alternativas0[2].setDescricao("&&");
		alternativas0[2].setCorreta(true);
		alternativas0[3].setDescricao("+=");
		alternativas0[3].setCorreta(false);
				
		listaPergunta[0].setAlternativas(alternativas0);
				
		listaPergunta[1].setTitulo("O que é um objeto em Java?");
		listaPergunta[1].setDificuldade("Facil");
		listaPergunta[1].Pontos_Dificuldade(listaPergunta[1].getDificuldade());
				
		Alternativa alternativas1[] = new Alternativa[4];
	
		for(int i = 0; i < alternativas1.length; i++)
		{
			alternativas1[i] = new Alternativa();
		}
		alternativas1[0].setDescricao("Uma variável");
		alternativas1[0].setCorreta(false);
		alternativas1[1].setDescricao("Um tipo de dado primitivo");
		alternativas1[1].setCorreta(false);
		alternativas1[2].setDescricao("Uma instância de uma classe");
		alternativas1[2].setCorreta(true);
		alternativas1[3].setDescricao("Um operado");
		alternativas1[3].setCorreta(false);
				
		listaPergunta[1].setAlternativas(alternativas1);
		
		listaPergunta[2].setTitulo("O que é um bloco try-catch em Java usando para?");
		listaPergunta[2].setDificuldade("Media");
		listaPergunta[2].Pontos_Dificuldade(listaPergunta[2].getDificuldade());
				
				
		Alternativa alternativas2[] = new Alternativa[4];
		
		for(int i = 0; i < alternativas2.length; i++)
		{
			alternativas2[i] = new Alternativa();
		}
		
		alternativas2[0].setDescricao("Definir uma nova variável local");
		alternativas2[0].setCorreta(false);
		alternativas2[1].setDescricao("Declarar uma nova classe");
		alternativas2[1].setCorreta(false);
		alternativas2[2].setDescricao("Capturar e tratar exceções");
		alternativas2[2].setCorreta(true);
		alternativas2[3].setDescricao("Definir um novo método");
		alternativas2[3].setCorreta(false);
		
		listaPergunta[2].setAlternativas(alternativas2);
		GameQuiz.setListaPergunta(listaPergunta);
		
		byte respostas[] = new byte[listaPergunta.length];
		
		System.out.print("\n\n\t\t Bem Vindo ao QuizJava \n \n"
				+ ""
				+ "\tFeito por:\n"
				+ ""
				+ "\tEinstain Duarti\n"
				+ "\tJosé Claion\n"
				+ "\tLeander Batista\n"
				+ "\tMatheus pantoja\n"
				+ "\n\t\t Divirta-se :D\n");
		
		
		try 
		{
            // Coloque o número de milissegundos que deseja esperar dentro do método sleep
            Thread.sleep(5000); // 5000 milissegundos = 5 segundos
        } 
		catch (InterruptedException e) 
		{
            // Trate a exceção se a thread for interrompida enquanto estiver dormindo
            e.printStackTrace();
        }
		limpatela();
		
		System.out.println("Vamos começar, mas informe seu Nickname: ");
		
		nickname = sc.next();
		boolean aprovado = verificarNickname(nickname);
		
		while(aprovado == true) {
			System.out.println("Ops... Você digitou um nome com símbolos da lista de proibição"
					+ "\n tente novamente: ");
			nickname = sc.next();
			aprovado = verificarNickname(nickname);
		}
		
		Jogador player = new Jogador(nickname);
		
		//definições Jogador
		LocalDate dt_Jogo = LocalDate.now();
		player.setData(dt_Jogo);
		
		System.out.println(dt_Jogo);
		System.out.println("\t\tSeja Bem Vindo "+nickname+"\n"
				+ "\t\t Vamos Iniciar o Quiz\n"
				+ " \t\t Mas antes Deseja Escolher alguma Dificuldade?\n"
				+ "1 - SIM\n"
				+ "2 - NÃO\n" );
		byte EscolhaDif = sc.nextByte();
		String dificuldade = "";
		if(EscolhaDif == 1)
		{
			System.out.println("1 - Facil\n"
					+ "2 - Médio\n"
					+ "3 - Difícil\n");
			byte dif = -1;
			while(dif == -1)
			{
				try 
				{
					dif = sc.nextByte();
				}
				catch(InputMismatchException e)
				{
					System.out.println("Ops .... Isso não e um numero, tente novamente");
					dif = -1;
					sc.nextLine();
					continue;
				}
				
				switch(dif)
				{
				case 1:
					dificuldade = "Facil";
					break;
				case 2:
					dificuldade = "Media";
					break;
				case 3:
					dificuldade = "Dificil";
					break;
				default:
					System.out.println("Opção invalida");
					dif = -1;
				}
			}
			System.out.println("Dificuldade Selecionada: "+dificuldade);
			
		}
		
		GameQuiz.setJogador(player);
		
		if(dificuldade.equals(""))
			respostas = GameQuiz.SorteioPergunta();
		else
			respostas = GameQuiz.SorteioPergunta(dificuldade);
		
		
	}

	
	public static void limpatela() {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+ "\n\n\n\n\n\n\n"); }
	
	public static boolean verificarNickname(String nickname) {
		String proibicao = "!\"#$%&'()*+,./:;<=>?@[\\]^`{|}~" ;
		for(short i = 0; i< nickname.length()-1; i++)
		{
			
			if(proibicao.contains(nickname.substring(i, i+1)))
				return true;	
		}
		return false;
	}
}
