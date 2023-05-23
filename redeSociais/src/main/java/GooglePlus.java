public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no googlePlus");
    }


    @Override
    public void postarVideo() {

        System.out.println("Postando video no googlePlus");
    }

    @Override
    public void postarComentario() {

        System.out.println("Postando comentario no googlePlus");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }

    @Override
    public void compartilhar() {

        System.out.println("compartilhando no googlePlus");
    }

    @Override
    public void fazStreaming() {

        System.out.println("Strimando no googlePlus");
    }
}
