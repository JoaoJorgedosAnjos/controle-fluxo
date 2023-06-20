public class ExemploBreakConitnue {
    public static void main(String[] args) {

        //Break
        //Quando chegar no break ele vai parar, vai imprimir epenas o 1 e o 2
        //console 1, 2
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;

            System.out.println(numero);

        }
        //Continue
        //Quando chegar na parte de verificação, ele não vai imprimir o 3, vai continuar e imprimir o restante
        //console 1,2, 4, 5
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

            System.out.println(numero);

        }

        //O comando break interrompe o laço, já o continue interrompe somente a interação atual.

}
}
