package Models;

abstract class Conteudo {
    private String nome;
    private String descricao;
    protected static double xpPadrao=10d;
    protected int horaConteudo;

    public abstract int CalcularHora();

    public abstract double CalcularXP();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Conteudo{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
