public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{


    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no facebook");
    }

    @Override
    public void postarVideo() {

        System.out.println("Postando video no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentario no facebook");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }

    @Override
    public void compartilhar() {

        System.out.println("Compartilhando no facebook");

    }

    @Override
    public void fazStreaming() {

        System.out.println("Strimando no facebook");

    }
}

