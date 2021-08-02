
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");       
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");

        try{
    		metodo2();
    	}catch(ArithmeticException | NullPointerException | MinhaExecao ex){
    		String msg = ex.getMessage();
    		System.out.println("causa: "+msg);
    		ex.printStackTrace();
    	}
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao{
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //Conta c = null;
           // c.deposita();
        }
        throw new MinhaExecao("testando exeção");
        
        //System.out.println("fim do metodo2");
    }
}