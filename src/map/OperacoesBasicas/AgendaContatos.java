package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("WIllian", 41987630);
        agendaContatos.adicionarContato("WIllian", 43435);
        agendaContatos.adicionarContato("WIllian Nicoletti", 34632);
        agendaContatos.adicionarContato("WIllian lindao", 1111);
        agendaContatos.adicionarContato("WIllian sarado", 1111);
        agendaContatos.adicionarContato("WIll", 41987612);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("WIllian");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("WIll"));
    }
}
