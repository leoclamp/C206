public class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public void Usuario(RedeSocial[] redeSociais) {

        for (int i = 0; i < redeSociais.length; i++) {
            if (redeSociais[i] != null) {
                if (redeSociais[i] instanceof Facebook) {
                    Facebook face = (Facebook) redeSociais[i];
                    System.out.println(this.nome + " tem Facebook");
                    face.postarVideo();
                    face.compartilhar();
                    face.curtirPublicacao();
                    System.out.println("-----------------------------------");

                } else if (redeSociais[i] instanceof GooglePlus) {
                    GooglePlus google = (GooglePlus) redeSociais[i];
                    System.out.println(this.nome + " tem GooglePlus");
                    google.fazStreaming();
                    google.postarComentario();
                    google.postarFoto();
                    System.out.println("-----------------------------------");

                } else if (redeSociais[i] instanceof Twitter) {
                    Twitter twitter = (Twitter) redeSociais[i];
                    System.out.println(this.nome + " tem Twitter");
                    twitter.compartilhar();
                    twitter.curtirPublicacao();
                    twitter.postarFoto();
                    System.out.println("-----------------------------------");

                } else if (redeSociais[i] instanceof Instagram) {
                    Instagram insta = (Instagram) redeSociais[i];
                    System.out.println(this.nome + " tem Instagram");
                    insta.curtirPublicacao();
                    insta.postarVideo();
                    System.out.println("-----------------------------------");

                }
            }
        }
    }
}

