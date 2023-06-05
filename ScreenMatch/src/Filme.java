public class Filme {
    String Nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void mostraFilme(){
        System.out.println("Nome do Filme: " + Nome);
        System.out.println("Data de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes +=nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
       return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}