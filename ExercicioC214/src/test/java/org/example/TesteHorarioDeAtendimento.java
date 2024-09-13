package org.example;
import org.example.HorarioDeAtendimento;
import org.example.HorarioService;
import org.example.HorarioConst;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteHorarioDeAtendimento {
    HorarioService service;
    HorarioDeAtendimento horarioDeAtendimento;

    @Before
    public void setup(){
        service = new MockHorarioService();
        horarioDeAtendimento = new HorarioDeAtendimento(service);
    }

    @Test
    public void testeProfRenzo(){
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Renzo", info.getNome());
        assertEquals("17:30 - 19:30", info.getHorario());
        assertEquals("Integral", info.getPeriodo());
        assertEquals("4", info.getSala());
        assertEquals("1", info.getPredio());
    }

    @Test
    public void testeProfSamuel(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Samuel", info.getNome());
        assertEquals("13:30 - 15:00", info.getHorario());
        assertEquals("Integral", info.getPeriodo());
        assertEquals("10", info.getSala());
        assertEquals("2", info.getPredio());
    }

    @Test
    public void testeProfMarcelo(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Marcelo", info.getNome());
        assertEquals("09:00 - 11:40", info.getHorario());
        assertEquals("Integral", info.getPeriodo());
        assertEquals("13", info.getSala());
        assertEquals("3", info.getPredio());
    }

    @Test
    public void testeProfChris(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Christopher", info.getNome());
        assertEquals("19:30 - 21:00", info.getHorario());
        assertEquals("Noturno", info.getPeriodo());
        assertEquals("18", info.getSala());
        assertEquals("4", info.getPredio());
    }


    @Test
    public void testeProfEduardo(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Eduardo", info.getNome());
        assertEquals("21:30 - 23:00", info.getHorario());
        assertEquals("Noturno", info.getPeriodo());
        assertEquals("22", info.getSala());
        assertEquals("6", info.getPredio());
    }

    @Test
    public void testeProfBreno(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Breno", info.getNome());
        assertEquals("21:30 - 23:00", info.getHorario());
        assertEquals("Noturno", info.getPeriodo());
        assertEquals("17", info.getSala());
        assertEquals("4", info.getPredio());
    }

    @Test
    public void testeProfVinicius(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Vinicius", info.getNome());
        assertEquals("08:00 - 09:40", info.getHorario());
        assertEquals("Integral", info.getPeriodo());
        assertEquals("2", info.getSala());
        assertEquals("1", info.getPredio());
    }

    @Test
    public void testeProfKarina(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Karina", info.getNome());
        assertEquals("10:00 - 11:40", info.getHorario());
        assertEquals("Integral", info.getPeriodo());
        assertEquals("10", info.getSala());
        assertEquals("2", info.getPredio());
    }

    @Test
    public void testeProfAlessandra(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Alessandra", info.getNome());
        assertEquals("19:30 - 21:00", info.getHorario());
        assertEquals("Noturno", info.getPeriodo());
        assertEquals("14", info.getSala());
        assertEquals("3", info.getPredio());
    }

    @Test
    public void testeProfGuilherme(){
        horarioDeAtendimento = new HorarioDeAtendimento(service);
        AtendimentoInfo info = horarioDeAtendimento.PaginaWeb();
        assertEquals("Guilherme", info.getNome());
        assertEquals("13:30 - 15:00", info.getHorario());
        assertEquals("Integral", info.getPeriodo());
        assertEquals("9", info.getSala());
        assertEquals("2", info.getPredio());
    }


}
