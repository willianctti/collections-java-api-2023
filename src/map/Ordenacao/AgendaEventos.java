package map.Ordenacao;

import map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.*;

public class AgendaEventos {
    //atributo

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        Evento evento = new Evento(nomeEvento, nomeAtracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }



    public void obterProximoEvento() {
       /* Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values(); */

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 14),"Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 1),"Evento 2", "Atracao 2");

        agendaEventos.exibirAgenda();
    }

}
