public class Fluxo {
    public static void main(String[] args) {
        System.out.println("ini main");
        try {
            metodo1();
        }catch (ArithmeticException|NullPointerException exeption){
            String msg = exeption.getMessage();
            System.out.println("Exception " + msg);
            exeption.printStackTrace();
        }
        System.out.println("fim main");
    }
    public static void metodo1(){
        System.out.println("ini metodo1");
        metodo2();
        System.out.println("fim metodo1");
    }
    public static void metodo2(){
        System.out.println("ini metodo2");
        throw new ArithmeticException("não funcionou");

        //System.out.println("fim metodo2");
    }
}
