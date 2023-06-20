public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;

        //Condicional encadeada
        if (nota >=7)
            System.out.println("Aprovadp");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        //Condição ternária
        //ex1
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        //ex2
        String resultado1 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado1);
    }
}
