public class Agente{

    //variaveis nome do agente e sua habilidade
    private String nome;
    private String habilidade;


    //agregacao de skin em Agente
    public Skin skin = null;

    public Agente(String nome, String habilidade, String tipo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.skin = new Skin(tipo);
    }

    public void mostraInfo(){
        System.out.println("nome do agente: " + this.nome);
        System.out.println("habilidade do agente: " + this.habilidade);
        System.out.println("skin do agente: " +this.skin.getTipo());
    }

    public String getNome() {
        return nome;
    }



    public void colocarColete() {
        System.out.println(this.nome + " colocou o colete!");
    }


    public void atirar() {

        System.out.println(this.nome + " esta atirando!");

    }

    public void jogarGranada() {

        System.out.println(this.nome + " jogou uma granada!");

    }


    public void escolherArma() {
        System.out.println(this.nome + " escolheu uma arma!");
    }


    public void pular() {

        System.out.println(this.nome + " esta pulando");

    }


    public void correr() {

        System.out.println(this.nome + " esta correndo");

    }


    public void andar() {

        System.out.println(this.nome + " esta andando");

    }

    public void reforcarParede() {

        System.out.println(this.nome + " reforcou a parede");

    }


}

