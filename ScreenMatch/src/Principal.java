public class Principal {
    public static void main(String[] args) {
        Filme MeuFilme = new Filme();
        MeuFilme.Nome = "O Poderoso Chefão";
        MeuFilme.anoDeLancamento = 1970;
        MeuFilme.duracaoEmMinutos = 180;

        MeuFilme.mostraFilme();
        MeuFilme.avalia(3);
        MeuFilme.avalia(4);
        MeuFilme.avalia(10);
        System.out.println(MeuFilme.somaDasAvaliacoes);
        System.out.println(MeuFilme.totalDeAvaliacoes);
        System.out.println(MeuFilme.pegaMedia());
    }
}