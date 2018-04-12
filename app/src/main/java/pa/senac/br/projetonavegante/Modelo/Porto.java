package pa.senac.br.projetonavegante.Modelo;

public class Porto {
    private String NomePorto;
    private String EnderecoPorto;
    private String FonePorto;

    public String getNomePorto() {
        return NomePorto;
    }

    public void setNomePorto(String nomePorto) {
        NomePorto = nomePorto;
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
                "NomePorto='" + NomePorto + '\'' +
                ", EnderecoPorto='" + EnderecoPorto + '\'' +
                ", FonePorto='" + FonePorto + '\'' +
                '}';
    }
}
