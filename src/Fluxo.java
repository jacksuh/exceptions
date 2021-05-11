public class Fluxo {

    public static void main(String[] args) throws Exception{
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() throws Exception{
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        }catch (ArithmeticException ex) {
            ex.printStackTrace();
        System.out.println("ArithmeticException");
    }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws Exception {
        System.out.println("Ini do metodo2");
         new MinhaExcecao("deu errado");

    }
}
