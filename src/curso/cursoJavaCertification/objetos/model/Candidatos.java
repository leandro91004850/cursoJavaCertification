package curso.cursoJavaCertification.objetos.model;

public class Candidatos {
    private String nome;
    private char sexo;
    private int votos;
    private int identificador;

    public Candidatos(String nome, int votos, int identificador, char sexo) {
        this.nome = nome;
        this.votos = votos;
        this.identificador = identificador;
        this.sexo = sexo;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "{\n" +
                "    \"nome\": \""+nome+"\",\n"+
                "    \"sexo\": \""+sexo+"\",\n"+
                "    \"votos\": "+votos+",\n"+
                "    \"identificador\": "+identificador+"\n"+
                "}";
    }
}
