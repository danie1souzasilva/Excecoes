public class Fluxo {
    public static void main(String[] args) {
        System.out.println("ini main");
        metodo1();
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
            double a = i/0.001;
            System.out.println(a);
        }
        System.out.println("fim metodo2");
    }
}
