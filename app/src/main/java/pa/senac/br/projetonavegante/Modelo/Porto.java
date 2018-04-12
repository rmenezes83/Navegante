package pa.senac.br.projetonavegante.Modelo;

public class Porto {
    private String nomePorto;
    private String EnderecoPorto;
    private String FonePorto;

    public String getNomePorto() {
        return nomePorto;
    }

    public void setNomePorto(String nomePorto) {
        this.nomePorto = nomePorto;
    }

    public String getEnderecoPorto() {
        return EnderecoPorto;
    }

    public void setEnderecoPorto(String enderecoPorto) {
        EnderecoPorto = enderecoPorto;
    }

    public String getFonePorto() {
        return FonePorto;
    }

    public void setFonePorto(String fonePorto) {
        FonePorto = fonePorto;
    }

    @Override
    public String toString() {
        return "Porto{" +
                "nomePorto='" + nomePorto + '\'' +
                ", EnderecoPorto='" + EnderecoPorto + '\'' +
                ", FonePorto='" + FonePorto + '\'' +
                '}';
    }
}
