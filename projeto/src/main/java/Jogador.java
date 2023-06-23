public class Jogador {

    //declarando as variaveis, cont static para fazer a contagem
    public static int cont = 0;
    private String nomeJogador;
    Agente[] agentes = new Agente[10];
    Jogador[] jogadores = new Jogador[10];


    public void mostraInfo() {

        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                if (agentes[i] instanceof Bandit) {
                    System.out.println("nome do Jogador: " + jogadores[i].nomeJogador);
                    agentes[i].mostraInfo();
                } else if (agentes[i] instanceof Sledge) {
                    System.out.println("nome do Jogador: " + jogadores[i].nomeJogador);
                    agentes[i].mostraInfo();
                }
            }
        }
    }


    void adicionarAgente(Jogador jogador, Agente novoAgente) {

        //For para o vetor
        for (int i = 0; i < agentes.length; i++) {
            //Se o vetor agente e jogador estiverem vazios:
            if (agentes[i] == null && jogadores[i] == null) {

                jogadores[i] = jogador;
                agentes[i] = novoAgente;
                System.out.println("Jogador e seu agente adicionados!");
                cont++;
                break;
            }
        }
    }

    public void maiskills() {
        Jogador banditMaiskills = null;
        Jogador sledgeMaiskills = null;
        int comparadorbandit = 0;
        int comparadorsledge = 0;

        Bandit bandit[] = new Bandit[10];
        Sledge sledge[] = new Sledge[10];

        //leitura do vetor agentes e verifica se é uma instancia de Bandit ou de Sledge e adicionar nos vetores Bandit ou Sledge
        for (int i = 0; i < agentes.length; i++) {
            if (agentes[i] != null) {
                if (agentes[i] instanceof Bandit) {
                    bandit[i] = (Bandit) agentes[i];
                } else if (agentes[i] instanceof Sledge) {
                    sledge[i] = (Sledge) agentes[i];
                }
            }
        }
        //leitura do vetor Bandit e verifica quem tem mais kills entre as instancias de Bandit
        for (int i = 0; i < bandit.length; i++){
            if (bandit[i] != null && bandit[i+1] != null) {
                if (bandit[i].getQntKills() > bandit[i + 1].getQntKills()) {
                    banditMaiskills = jogadores[i];
                    comparadorbandit = bandit[i].getQntKills();
                }
            }
            else {
                if (bandit[i] != null) {
                    banditMaiskills = jogadores[i];
                    comparadorbandit = bandit[i].getQntKills();
                }
            }
        }

        //leitura do vetor Bandit e verifica quem tem mais kills entre as instancias de Sledge

        for (int i = 0; i < sledge.length; i++){
            if (sledge[i] != null && sledge[i+1] != null) {
                if (sledge[i].getQntkills() > sledge[i + 1].getQntkills()) {
                    sledgeMaiskills = jogadores[i];
                    comparadorsledge = sledge[i].getQntkills();
                }
            }
            else {
                if (sledge[i] != null) {
                    sledgeMaiskills = jogadores[i];
                    comparadorsledge = sledge[i].getQntkills();
                }
            }
        }
        //verifica se entre Bandit e Sledge quem tem mais kills
        if(comparadorbandit > comparadorsledge){
            System.out.println("jogador " + banditMaiskills.nomeJogador + " tem a maior quantidade de kills");
            System.out.println("kills: " + comparadorbandit);
        }
        else if(comparadorbandit < comparadorsledge){
            System.out.println("jogador " + sledgeMaiskills.nomeJogador + " tem a maior quantidade de kills");
            System.out.println("kills: " + comparadorsledge);
        }
        else {
            System.out.println("nenhum jogador com a maior quantidade de kills");
        }
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public static int getCont() {
        return cont;
    }
}

