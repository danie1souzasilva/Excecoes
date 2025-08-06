public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("ini main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exceção" + msg);
            ex.printStackTrace();
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
        for( int i = 1; i <= 5; i++){
            System.out.println(Math.pow(i, 2));
            //divisão por zero deveria ser o numero seguido de infinitos zeros ex:
            //2/0 =2infinitoszeros
            double a = i/0.0001;
            System.out.println(a);
            try{
                int b = i/0;
            }catch(ArithmeticException ex){
                System.out.println("não existe divisão por 0");
            }
        }
        System.out.println("fim metodo2");
    }
}
