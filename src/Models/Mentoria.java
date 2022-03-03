package Models;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate dataMentoria;

    public Mentoria() {}

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }


    @Override
    public int CalcularHora() {
        return horaConteudo;
    }

    @Override
    public double CalcularXP() {
        return xpPadrao + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "Nome: " + getNome() +
                "Descrição: " + getDescricao() +
                "dataMentoria=" + dataMentoria +
                '}';
    }
}
