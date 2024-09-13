package org.example;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class HorarioDeAtendimento {

    HorarioService horarioService;

    public HorarioDeAtendimento(HorarioService service){
        this.horarioService = service;
    }

    public AtendimentoInfo PaginaWeb() {

        String horarioJson = horarioService.HorarioServico();

        JsonObject jsonObject = JsonParser.parseString(horarioJson).getAsJsonObject();


        return new AtendimentoInfo(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsString(),
                getPredio(jsonObject.get("sala").getAsString()));
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
