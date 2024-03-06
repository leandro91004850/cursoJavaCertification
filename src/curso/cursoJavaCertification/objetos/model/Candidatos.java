package curso.cursoJavaCertification.objetos.model;

public class Candidatos {
    private String nome;
    private int votos;
    private int identificador;

    public Candidatos(String nome, int votos, int identificador) {
        this.nome = nome;
        this.votos = votos;
        this.identificador = identificador;
    }

    public Candidatos() { // usado para instanciar um objeto exemplo: Candidatos candidato = new Candidatos();

    }

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
        return "{\n" +
                "    \"nome\": \""+nome+"\",\n"+
                "    \"votos\": "+votos+",\n"+
                "    \"identificador\": "+identificador+"\n"+
                "}";
    }
}
