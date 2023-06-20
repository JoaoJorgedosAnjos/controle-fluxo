public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >=7)
            System.out.printf("Aprovadp");
        else if (nota >= 5 && nota < 7)
            System.out.printf("Recuperação");
        else
            System.out.printf("Reprovado");
    }
}
