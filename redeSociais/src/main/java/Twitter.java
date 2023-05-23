public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Twitter");
    }


    @Override
    public void postarVideo() {

        System.out.println("Postando video no Twitter");
    }

    @Override
    public void postarComentario() {

        System.out.println("Postando comentario no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }

    @Override
    public void compartilhar() {

        System.out.println("compartilhando no Twitter");
    }
}
