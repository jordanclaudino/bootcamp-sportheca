package Models;

public class Atividade extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int CalcularHora() {
        return horaConteudo + cargaHoraria;
    }

    @Override
    public double CalcularXP() {
        return xpPadrao+20d;
    }

    @Override
    public String toString() {
        return "Atividade{" + "Nome: " + getNome() +
                "Descrição: " + getDescricao() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
