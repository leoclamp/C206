import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //inicia a leitura de dados
        Scanner entrada = new Scanner(System.in);


        //instancia de Jogador
        Jogador jogador = new Jogador();

        //condicao para sair do loop e variavel de escolha
        boolean condicao = true;
        int op;


        //Menu
        while (condicao) {

            System.out.println("1 - Adicionar jogador e seu agente");
            System.out.println("2 - Mostrar as informações do jogador e seu agente");
            System.out.println("3 - Mostrar jogador com mais kills");
            System.out.println("4 - Sair");


            //Try catch para caso o usuario entre com alguma coisa que nao seja um numero de 1 a 4
            try {
                op = entrada.nextInt();

                switch (op) {

                    case 1:
                        entrada.nextLine();
                        System.out.println("nome do jogador: ");
                        String nomejogador = entrada.nextLine();
                        System.out.println("nome do agente escolhido (Bandit ou Sledge) pelo jogador " + nomejogador + ": ");
                        String nome = entrada.nextLine();

                        //condicao para que seja escolhido apenas agentes existentes
                        boolean var = true;
                        if (!(nome.equals("Sledge") || nome.equals("Bandit"))) {
                            do {
                                System.out.println("nome do agente escolhido (Bandit ou Sledge) pelo jogador " + nomejogador + ": ");
                                nome = entrada.nextLine();
                                if (nome.equals("Sledge") || nome.equals("Bandit"))
                                    var = false;
                            } while (var);
                        }

                        System.out.println("habilidade do agente: ");
                        String habilidade = entrada.nextLine();
                        System.out.println("skin do agente: ");
                        String nomeskin = entrada.nextLine();

                        Agente agente = new Agente(nome, habilidade, nomeskin);
                        Jogador jogador1 = new Jogador();
                        jogador1.setNomeJogador(nomejogador);

                        //verificando se o agente é uma instancia de Bandit ou de Sledge
                        if ("Bandit".equals(nome)) {
                            Bandit b = new Bandit(nome, habilidade, nomeskin);
                            agente = b;
                        } else if (nome.equals("Sledge")) {
                            Sledge s = new Sledge(nome, habilidade, nomeskin);
                            agente = s;
                        }

                        jogador.adicionarAgente(jogador1, agente);
                        break;
                    case 2:
                        jogador.mostraInfo();//chamando a funcao que ira mostrar a informacoes do jogador e do agente
                        break;
                    case 3:
                        jogador.maiskills();//chamando a funcao que ira mostrar o jogador com mais kills
                        break;
                    case 4:
                        condicao = false;
                        System.out.println("Você saiu do menu!");
                        System.out.println("----------------------------");
                        break;
                    default:
                        System.out.println("numero nao valido");
                        break;
                }

        }catch(InputMismatchException e)
        {
            System.out.println("Erro, por favor escreva um número de 1 a 4");
            entrada.nextLine();
        }
    }


        //quantidade de jogadores adicionados
        System.out.println("quantidade de jogadores adicionados: " + jogador.getCont());

    }
}

