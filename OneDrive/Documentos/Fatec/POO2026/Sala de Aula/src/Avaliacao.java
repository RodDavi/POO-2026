import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questao;

    public Avaliacao(int id, String nome) {
        this.questao = new ArrayList<>();
    }

    public Avaliacao(int id, String nome, ArrayList<Questao> questao) {
        this.id = id;
        this.nome = nome;
        this.questao = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso){
        Questao questao = new Questao(num, texto, peso);
        this.questao.add(questao);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", questao=" + questao +
                '}';
    }
}