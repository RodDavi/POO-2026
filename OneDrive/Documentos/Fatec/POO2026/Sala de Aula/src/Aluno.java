public class Aluno {
    private String nome;
    private int id;
    private int ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, int id, int ra,String curso) {
        this.nome = nome;
        this.id = id;
        this.ra = ra;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", ra=" + ra +
                ", curso='" + curso + '\'' +
                '}';
    }
}