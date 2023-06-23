import java.util.Random;
public class Bandit extends Agente implements OperadorBandit{

    //Declarando as variaveis
    private int qntKills = 0;
    Random random = new Random();

    //Construtor
    public Bandit(String nome, String habilidade, String tipo) {
        super(nome, habilidade, tipo);
    }

    //Função de quantidade de Kills
    public int getQntKills() {
        return qntKills;
    }


    //Função mostraInfo
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        this.escolherArma();
        this.eletrizarparede();
        this.atirar();
        this.eletrizararame();
        this.colocarColete();
        this.atirar();
        this.pular();
        this.jogarGranada();
        this.correr();
        this.atirar();
        System.out.println("quantidade de kills do "+this.getNome()+": " +this.qntKills);
        System.out.println("----------------------------------------------");
    }

    //Função atirar
    @Override
    public void atirar() {

        super.atirar();
        //O Numero de kills do agente é aleatório
        int numeroAleatorio = random.nextInt(2) + 1;
        if(numeroAleatorio == 1)
            this.qntKills++;
    }

    //Função jogarGranada
    @Override
    public void jogarGranada() {
        super.jogarGranada();
        //O Numero de granadas vai ser aleatório
        int numeroAleatorio = random.nextInt(10) + 1;
        if(numeroAleatorio == 8)
            this.qntKills =+ 2;
    }

    //Função eletrizarparede
    @Override
    public void eletrizarparede() {

        System.out.println(this.getNome()+ " eletrificou a parede!");

    }


    //Função eletrizararame
    @Override
    public void eletrizararame() {

        System.out.println(getNome()+" eletrificou o arame!");

    }
}
