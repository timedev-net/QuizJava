package ProjetcQuiz;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nickname;
		System.out.print("\n\n\t\t Bem Vindo ao QuizJava \n \n"
				+ ""
				+ "\tFeito por:\n"
				+ ""
				+ "\tEinstain Duarti\n"
				+ "\tJosé Claion\n"
				+ "\tLeander Batista\n"
				+ "\tMatheus pantoja\n"
				+ "\n\t\t Divirtase :D\n");
		
		
		try {
            // Coloque o número de milissegundos que deseja esperar dentro do método sleep
            Thread.sleep(5000); // 5000 milissegundos = 5 segundos
        } catch (InterruptedException e) {
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
		System.out.println("\t\tSeja Bem Vindo "+nickname+"\n\t\t Vamos Iniciar o Quiz\n\n \t\t Preparado?" );
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
