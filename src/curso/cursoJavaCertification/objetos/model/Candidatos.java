package curso.cursoJavaCertification.objetos.model;

public class Candidatos {
    private String nome;
    private int votos;
    private int identificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Candidatos{" +
                "nome='" + nome + '\'' +
                ", votos=" + votos +
                ", identificador=" + identificador +
                '}';
    }
}
