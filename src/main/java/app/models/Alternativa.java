package app.models;

public class Alternativa {

    private String descricao;
    private boolean correta = false;
    
    public Alternativa(String descricao) {
        this.descricao = descricao;
    }
  
    public Alternativa(String descricao, boolean value) {
        this.descricao = descricao;
        this.correta = value;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public boolean getCorreta() {
        return correta;
    }

    public Alternativa setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public void setCorreta(boolean value) {
        this.correta = value;
    }

}
