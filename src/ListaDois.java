import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ListaDois {
    public static void main(String[] args) {

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador(1,"Jorge","Jorginho", new Date(),1,"Goleiro", 10, 0, 0, false));
        jogadores.add(new Jogador(2,"Pedro","Pedrinho", new Date(),2,"Zagueiro", 5, 0, 0, false));
        jogadores.add(new Jogador(3,"José","Zé", new Date(),3,"Zagueiro", 6, 0, 0, false));
        jogadores.add(new Jogador(4,"Carlos","Carlinhos", new Date(),4,"Zagueiro", 7, 0, 0, false));
        jogadores.add(new Jogador(5,"Kleber","Machado", new Date(),5,"Zagueiro", 10, 0, 0, false));
        jogadores.add(new Jogador(6,"Nate","Dias", new Date(),6,"Meio campo", 10, 0, 0, false));
        jogadores.add(new Jogador(7,"Sandro","Sandroso", new Date(),7,"Meio campo", 10, 0, 0, false));
        jogadores.add(new Jogador(8,"Gabriel","Biel", new Date(),8,"Meio campo", 6, 0, 0, false));
        jogadores.add(new Jogador(9,"Lucas","Luquinha", new Date(),9,"Meio campo", 10, 0, 0, false));
        jogadores.add(new Jogador(10,"Charles","Do Bronx", new Date(),10,"Atacante", 4, 0, 0, false));
        jogadores.add(new Jogador(11,"Pascal","Pascal", new Date(),11,"Atacante", 10, 0, 0, false));
        jogadores.add(new Jogador(12,"Daniel","Niel", new Date(),12,"Atacante", 8, 0, 0, false));

        String stringJogadores = jogadores.toString();

        System.out.println(stringJogadores);
    }
}
