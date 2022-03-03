import Models.Atividade;
import Models.Bootcamp;
import Models.Dev;
import Models.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Atividade atividade1 = new Atividade();
        atividade1.setNome("Pensamento Computacional");
        atividade1.setDescricao("Habilidade inerente às Ciencias da Computação");
        atividade1.setCargaHoraria(2);

        Atividade atividade2 = new Atividade();
        atividade2.setNome("Dominando IDEs Java");
        atividade2.setDescricao("Aprendendo sobre IDEs Eclipse, IntelliJ e VSCode");
        atividade2.setCargaHoraria(4);

        Atividade atividade3 = new Atividade();
        atividade3.setNome("Debugging Java");
        atividade3.setDescricao("Aprendendo sobre a ferramenta de Debug");
        atividade3.setCargaHoraria(1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setNome("Como resolver Desafio de Código");
        mentoria1.setDescricao("Com a Professora Adriana Silva");
        mentoria1.setDataMentoria(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setNome("Android JetPack e Material Designer");
        mentoria2.setDescricao("Com professor Venilton Falvo");
        mentoria2.setDataMentoria(LocalDate.now());

        Bootcamp sportheca = new Bootcamp();
        sportheca.setNome("Sportheca Mobile Developer");
        sportheca.setDescricao("Bootcamp em parceria com a Sporteca para desenvolvimento focado em Android");
        sportheca.setDificuldade("Intermediário");
        sportheca.getConteudos().add(atividade1);
        sportheca.getConteudos().add(atividade2);
        sportheca.getConteudos().add(atividade3);
        sportheca.getConteudos().add(mentoria1);
        sportheca.getConteudos().add(mentoria2);


        Dev dev1 = new Dev();
        dev1.setNome("Jordan Claudino");
        dev1.increverBootcamp(sportheca);

        System.out.println(sportheca.getDevsMatriculados());
        System.out.println(sportheca);
    }
}