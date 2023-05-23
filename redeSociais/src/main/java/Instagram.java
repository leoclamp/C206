public class Instagram extends RedeSocial {

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no instagram");
    }


    @Override
    public void postarVideo() {

        System.out.println("Postando video no instagram");
    }

    @Override
    public void postarComentario() {

        System.out.println("Postando comentario no instagram");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
    }
}

