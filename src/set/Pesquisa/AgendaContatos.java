package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }



    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Willian", 1234);
        agendaContatos.adicionarContato("Willian", 0);
        agendaContatos.adicionarContato("Willian Nicoletti", 1235);
        agendaContatos.adicionarContato("Willian bonitao", 1237);
        agendaContatos.adicionarContato("Willian Silva", 1234);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Willian"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Willian Silva", 5555555));
    }
}
