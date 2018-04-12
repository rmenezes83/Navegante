package pa.senac.br.projetonavegante.Modelo;

public class Embarcacao {
    private String destinoEmbarcacao;
    private String empresaEmbarcacao;
    private String idPortoEmbarcacao;
    private String nomeEmbarcacao;
    private String tipoEmbarcacao;

    public String getDestinoEmbarcacao() {
        return destinoEmbarcacao;
    }

    public void setDestinoEmbarcacao(String destinoEmbarcacao) {
        this.destinoEmbarcacao = destinoEmbarcacao;
    }

    public String getEmpresaEmbarcacao() {
        return empresaEmbarcacao;
    }

    public void setEmpresaEmbarcacao(String empresaEmbarcacao) {
        this.empresaEmbarcacao = empresaEmbarcacao;
    }

    public String getIdPortoEmbarcacao() {
        return idPortoEmbarcacao;
    }

    public void setIdPortoEmbarcacao(String idPortoEmbarcacao) {
        this.idPortoEmbarcacao = idPortoEmbarcacao;
    }

    public String getNomeEmbarcacao() {
        return nomeEmbarcacao;
    }

    public void setNomeEmbarcacao(String nomeEmbarcacao) {
        this.nomeEmbarcacao = nomeEmbarcacao;
    }

    public String getTipoEmbarcacao() {
        return tipoEmbarcacao;
    }

    public void setTipoEmbarcacao(String tipoEmbarcacao) {
        this.tipoEmbarcacao = tipoEmbarcacao;
    }

    @Override
    public String toString() {
        return "Embarcacao{" +
                "destinoEmbarcacao='" + destinoEmbarcacao + '\'' +
                ", empresaEmbarcacao='" + empresaEmbarcacao + '\'' +
                ", idPortoEmbarcacao='" + idPortoEmbarcacao + '\'' +
                ", nomeEmbarcacao='" + nomeEmbarcacao + '\'' +
                ", tipoEmbarcacao='" + tipoEmbarcacao + '\'' +
                '}';
    }
}


