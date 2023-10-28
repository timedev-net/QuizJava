
package app.repository;

import app.models.Alternativa;
import app.models.Pergunta;


public class Repository {

    public Pergunta[] getList() {
        //Perguntas e alternativas
        Pergunta listaPergunta[] = new Pergunta[3];

        for (int i = 0; i < listaPergunta.length; i++) {
            listaPergunta[i] = new Pergunta();
        }

        listaPergunta[0].setTitulo("Qual o operador l�gico *e* em Java?");
        listaPergunta[0].setDificuldade("Facil");
        listaPergunta[0].Pontos_Dificuldade(listaPergunta[0].getDificuldade());

        Alternativa alternativas0[] = new Alternativa[4];
        for (int i = 0; i < alternativas0.length; i++) {
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

        listaPergunta[1].setTitulo("O que � um objeto em Java?");
        listaPergunta[1].setDificuldade("Facil");
        listaPergunta[1].Pontos_Dificuldade(listaPergunta[1].getDificuldade());

        Alternativa alternativas1[] = new Alternativa[4];

        for (int i = 0; i < alternativas1.length; i++) {
            alternativas1[i] = new Alternativa();
        }
        alternativas1[0].setDescricao("Uma vari�vel");
        alternativas1[0].setCorreta(false);
        alternativas1[1].setDescricao("Um tipo de dado primitivo");
        alternativas1[1].setCorreta(false);
        alternativas1[2].setDescricao("Uma inst�ncia de uma classe");
        alternativas1[2].setCorreta(true);
        alternativas1[3].setDescricao("Um operado");
        alternativas1[3].setCorreta(false);

        listaPergunta[1].setAlternativas(alternativas1);

        listaPergunta[2].setTitulo("O que � um bloco try-catch em Java usando para?");
        listaPergunta[2].setDificuldade("Media");
        listaPergunta[2].Pontos_Dificuldade(listaPergunta[2].getDificuldade());

        Alternativa alternativas2[] = new Alternativa[4];

        for (int i = 0; i < alternativas2.length; i++) {
            alternativas2[i] = new Alternativa();
        }

        alternativas2[0].setDescricao("Definir uma nova vari�vel local");
        alternativas2[0].setCorreta(false);
        alternativas2[1].setDescricao("Declarar uma nova classe");
        alternativas2[1].setCorreta(false);
        alternativas2[2].setDescricao("Capturar e tratar exce��es");
        alternativas2[2].setCorreta(true);
        alternativas2[3].setDescricao("Definir um novo m�todo");
        alternativas2[3].setCorreta(false);

        listaPergunta[2].setAlternativas(alternativas2);
        
        return listaPergunta;
    }
}
