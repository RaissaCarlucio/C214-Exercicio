import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HorarioDeAtendimento {

    // Declarando a variavel auxiliar json
    private String jsonData;

    //Construtor:
    public HorarioDeAtendimento(String jsonData) {
        this.jsonData = jsonData;
    }

    public AtendimentoInfo popularPagina() {
        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();

        String nome = jsonObject.get("nomeDoProfessor").getAsString();
        String horario = jsonObject.get("horarioDeAtendimento").getAsString();
        String periodo = jsonObject.get("periodo").getAsString();
        String sala = jsonObject.get("sala").getAsString();
        String predio = getPredio(sala);

        return new AtendimentoInfo(nome, horario, periodo, sala, predio);
    }

    // Se a sala for tal, o prédio é tal...
    private String getPredio(String sala) {
        int NumeroSala = Integer.parseInt(sala);
        if (NumeroSala >= 1 && NumeroSala <= 5) {
            return "1";
        } else if (NumeroSala >= 6 && NumeroSala <= 10) {
            return "2";
        } else if (NumeroSala >= 11 && NumeroSala <= 15) {
            return "3";
        } else if (NumeroSala >= 16 && NumeroSala <= 20) {
            return "4";
        } else {
            return "6";
        }
    }

}
