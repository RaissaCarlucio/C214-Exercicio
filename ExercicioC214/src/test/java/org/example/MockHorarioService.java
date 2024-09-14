package org.example;

public class MockHorarioService implements HorarioService {

    @Override
    public String busca(String nome) {
        return switch (nome) {
            case "Renzo" -> HorarioConst.ProfRenzo;
            case "Alessandra" -> HorarioConst.ProfAlessandra;
            case "Brenno" -> HorarioConst.ProfBreno;
            case "Chris" -> HorarioConst.ProfChris;
            case "Eduardo" -> HorarioConst.ProfEduardo;
            case "Guilherme" -> HorarioConst.ProfGuilherme;
            case "Karina" -> HorarioConst.ProfKarina;
            case "Marcelo" -> HorarioConst.ProfMarcelo;
            case "Samuel" -> HorarioConst.ProfSamuel;
            case "Vinicius" -> HorarioConst.ProfVinicius;
            default -> HorarioConst.Inexistente;
        };

    }
}
