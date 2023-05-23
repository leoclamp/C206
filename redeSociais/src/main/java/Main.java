public class Main {

    public static void main(String[] args) {

        //usuario 1
        RedeSocial[] redeSocial1 = new RedeSocial[4];

        Usuario u1 = new Usuario("leo","leo@hotmail.com");
        Facebook face1 = new Facebook("1234", 10);
        GooglePlus google1 = new GooglePlus("5678", 0);
        Twitter twitter1 = new Twitter("senha", 0);
        Instagram insta1 = new Instagram("password", 3);

        try{
            redeSocial1[0] = face1;
            redeSocial1[1] = google1;
            redeSocial1[2] = twitter1;
            redeSocial1[3] = insta1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("erro: limite do array");
        }

        System.out.println("usuario: "+u1.getNome()+"\nemail: " +u1.getEmail()+"\n");
        u1.Usuario(redeSocial1);

        //usuario 2
        RedeSocial[] redeSocial2 = new RedeSocial[4];

        Usuario u2 = new Usuario("jorge","jorge@hotmail.com");
        Facebook face2 = new Facebook("1234", 20);
        GooglePlus google2 = new GooglePlus("5678", 40);
        Twitter twitter2 = new Twitter("senha", 60);
        Instagram insta2 = new Instagram("password", 1000);

        try{
            redeSocial2[0] = face2;
            redeSocial2[1] = google2;
            redeSocial2[2] = twitter2;
            redeSocial2[3] = insta2;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("erro: limite do array");
        }

        System.out.println("usuario: "+u2.getNome()+"\nemail: " +u2.getEmail()+"\n");
        u2.Usuario(redeSocial2);

        //usuario 3
        RedeSocial[] redeSocial3 = new RedeSocial[4];

        Usuario u3 = new Usuario("ze","ze@hotmail.com");
        Facebook face3 = new Facebook("1234", 20);
        Instagram insta3 = new Instagram("password", 1000);

        try{
            redeSocial3[0] = face3;
            redeSocial3[1] = insta3;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("erro: limite do array");
        }

        System.out.println("usuario: "+u3.getNome()+"\nemail: " +u3.getEmail()+"\n");
        u3.Usuario(redeSocial3);

    }
}

