public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};
        for (int i =0; i < alunos.length; i++)
        System.out.println("O aluno no indice i= " + i + " é " + alunos[i]);

        //Utlizando o for each
        for (String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
