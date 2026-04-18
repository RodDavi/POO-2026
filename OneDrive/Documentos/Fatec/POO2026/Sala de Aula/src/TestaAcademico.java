public class TestaAcademico {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Miguel", 1, 10, "ADS");
        Aluno aluno2 = new Aluno("Isabella", 2, 11, "GRH");

        Disciplina POO  = new Disciplina();
        POO.matricularAluno(aluno1);
        POO.criarAvaliacao(1,"Prova Semestral");

        Disciplina ADM =  new Disciplina();
        ADM.matricularAluno(aluno2);
        ADM.criarAvaliacao(1, "Prova Semestral");

        Avaliacao avaliacao = POO.getAvaliacao(0);
        avaliacao.adicionarQuestao(1, "O que é POO?", 2.0f);
        avaliacao.adicionarQuestao(2, "Explique Atribuição", 3.0f);
        avaliacao.adicionarQuestao(3, "Explique Composição", 3.0f);

        System.out.println(POO);
    }
}