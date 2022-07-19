public class TesteEmail {


    public static boolean testar_email_com_arroba() {
        String email = "email_teste@dominio.com.br";

        return Pessoa.emailValid(email);
    }


    public static boolean testar_email_sem_arroba() {
        String email = "email_testedominio.com.br";

        return !Pessoa.emailValid(email);
    }

    public static boolean testar_email_mais_50_caracteres() {
        String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        return !Pessoa.emailValid(email);
    }
}
