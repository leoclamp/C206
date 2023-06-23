import java.util.Random;
public class Sledge extends Agente implements OperadorSledge{

    //Criando as variaveis
    private int qntKills = 0;
    Random random = new Random();

    //Construtor
    public Sledge(String nome, String habilidade, String tipo) {
        super(nome, habilidade, tipo);
    }

    //Função quantidade de skills
    public int getQntkills() {
        return qntKills;
    }

    //Mostrando as informações
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        this.escolherArma();
        this.andar();
        this.atirar();
        this.reforcarParede();
        this.jogarGranada();
        this.correr();
        this.atirar();
        this.marreta();
        this.atirar();
        System.out.println("quantidade kills: " +this.qntKills);
        System.out.println("----------------------------------------------");
    }

    //Função correr
    @Override
    public void correr() {

        System.out.println(this.getNome()+" esta correndo");

    }

    //Função andar
    @Override
    public void andar() {

        System.out.println(this.getNome()+" esta andando");

    }

    //Função reforcarParede
    @Override
    public void reforcarParede() {

        System.out.println(this.getNome()+" reforcou a parede");

    }

    //Função pular
    @Override
    public void pular() {

        System.out.println(this.getNome()+" esta pulando");

    }

    //Função atirar
    @Override
    public void atirar() {

        System.out.println(this.getNome()+ " esta atirando!");
        //Vai fazer o numero de kills ser aleatorio
        int numeroAleatorio = random.nextInt(2) + 1;
        if(numeroAleatorio == 1)
            this.qntKills++;

    }

    //Função jogarGranda
    @Override
    public void jogarGranada() {
        super.jogarGranada();
        int numeroAleatorio = random.nextInt(10) + 1;
        if(numeroAleatorio == 8)
            this.qntKills =+ 2;
    }


    //Função EscolherArma
    @Override
    public void escolherArma() {
        System.out.println(this.getNome()+" escolheu uma arma!");
    }

    //Função Marreta
    @Override
    public void marreta() {

        System.out.println(this.getNome()+ " usou a marreta!");

    }
}
