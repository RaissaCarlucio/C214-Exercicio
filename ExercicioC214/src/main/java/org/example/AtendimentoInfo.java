public class AtendimentoInfo {

    //Declarando as variaveis
    private String nome;
    private String horario;
    private String periodo;
    private String sala;
    private String predio;

    // Fazendo o Construtor
    public AtendimentoInfo(String nome, String horario, String periodo, String sala, String predio) {
        this.nome = nome;
        this.horario = horario;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    // Gets
    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getSala() {
        return sala;
    }

    public String getPredio() {
        return predio;
    }
}
