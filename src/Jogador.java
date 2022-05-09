import java.util.Date;

public class Jogador {

    public int ID;
    public String nome;
    public String apelido;
    public Date dataNascimento;
    public int numero;
    public String posicao;
    public int qualidade;
    public int cartaoAmarelo;
    public int cartaoVermelho;
    public boolean suspenso;
    public boolean treino = false;


    public Jogador(int ID, String nome,
                   String apelido, Date dataNascimento,
                   int numero, String posicao,
                   int qualidade, int cartaoAmarelo,
                   int cartaoVermelho, boolean suspenso) {
        this.ID = ID;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartaoAmarelo = cartaoAmarelo;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }
    public Jogador(){}

    public boolean verificaCondicaoDeJogo(){
        return cartaoAmarelo == 3 || cartaoVermelho == 1;
    }

    public void aplicarCartaoAmarelo(int quantidade){
        this.cartaoAmarelo = quantidade;
        if (this.cartaoAmarelo >= 3) suspenso = true;
        else if( this.cartaoVermelho == 0) suspenso = false;
    }

    public void aplicarCartaoVermelho(){
        suspenso = true;
    }

    public void cumprirSuspencao(){
        cartaoVermelho = 0;
        cartaoAmarelo = 0;
        suspenso = false;
    }

    public void executarTreinamento(){
        treino = true;
        int numeroRandom = 1 + (int) (Math.random() * 3);
        qualidade += numeroRandom;
    }

    public void sofrerLesao(){
        int probabilidade = 1 + (int) (Math.random() * 100);

        if( probabilidade <= 40)  qualidade -= 1;
        if(probabilidade <= 70 && probabilidade > 40) qualidade -= 2;
        if(probabilidade <= 85 && probabilidade > 70) qualidade -= qualidade * 0.05;
        if(probabilidade <= 95 && probabilidade > 85) qualidade -= qualidade * 0.1;
        if(probabilidade > 95 ) qualidade -= qualidade * 0.15;
    }
}
