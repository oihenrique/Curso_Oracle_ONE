public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MyException ex) {
            //String msg = ex.getMessage();
            //System.out.println("ArithmeticException " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyException{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyException {
        System.out.println("Ini do metodo2");

        //throw new MyException("bananinha");

//        for(int i = 1; i <= 5; i++) {
//            //int a = i / 0;
//            Conta c = null;
//            c.depositar(100);
//            System.out.println(i);
//        }
//        System.out.println("Fim do metodo2");
    }
}