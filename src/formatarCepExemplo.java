public class formatarCepExemplo {
    public static void main(String[] args) {
        String cepFormatado = null;
        try {
            cepFormatado = formatarCep("2376504");
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
        System.out.println(cepFormatado);

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
