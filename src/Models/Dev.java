package Models;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private int horasEstudadas;
    private Set<Conteudo> cursosMatriculados = new LinkedHashSet<>();
    private Set<Conteudo> cursosFinalizados = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void increverBootcamp(Bootcamp bootcamp){
        this.cursosMatriculados.addAll(bootcamp.getConteudos());
        bootcamp.getDevsMatriculados().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.cursosMatriculados.stream().findFirst();
        if (conteudo.isPresent()){
            this.cursosFinalizados.add(conteudo.get());
            this.cursosMatriculados.remove(conteudo.get());
        }
    }

    public double calcularTotalXP(){
       return this.cursosFinalizados.stream().mapToDouble(Conteudo::CalcularXP).sum();
    }

    public int calcularHoras(){
        return this.cursosFinalizados.stream().mapToInt(Conteudo::CalcularHora).sum();

    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
