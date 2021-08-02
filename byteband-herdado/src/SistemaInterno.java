
public class SistemaInterno{

    private int senha;

    public void autentica(Autenticavel g){

        boolean autenticou = g.autentica(this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}