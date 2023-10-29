package app.repository;

import app.enums.Dificuldade;
import app.models.Alternativa;
import app.models.Pergunta;
import java.util.ArrayList;
import java.util.Arrays;

public class Repository {

    public ArrayList<Pergunta> getPerguntas() {

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
            new Pergunta("Qual o operador lógico *e* em Java?",
                Dificuldade.FACIL,
                Arrays.asList(
                    new Alternativa("||"),
                    new Alternativa("!"),
                    new Alternativa("&&", true),
                    new Alternativa("+=")
                )
            )
        );
        
        perguntas.add(
            new Pergunta("O que é um objeto em Java?",
                Dificuldade.FACIL,
                Arrays.asList(
                    new Alternativa("Uma variável"),
                    new Alternativa("Um tipo de dado primitivo"),
                    new Alternativa("Uma instância de classe", true),
                    new Alternativa("Um operador")
                )
            )
        );
        
        perguntas.add(
            new Pergunta("Para que serve o try-catch?",
                Dificuldade.MEDIO,
                Arrays.asList(
                    new Alternativa("Definir uma nova variável local"),
                    new Alternativa("Declarar uma nova classe"),
                    new Alternativa("Capturar e tratar exceções", true),
                    new Alternativa("Definir um novo método")
                )
            )
        );

        return perguntas;
    }
}
