package pa.senac.br.projetonavegante.Modelo;

public class Embarcacao {
    private String DestinoEmbarcacao;
    private String EmpresaEmbarcacao;
    private String IdPortoEmbarcacao;
    private String NomeEmbarcacao;
    private String TipoEmbarcacao;

    public String getDestinoEmbarcacao() {
        return DestinoEmbarcacao;
    }

    public void setDestinoEmbarcacao(String destinoEmbarcacao) {
        DestinoEmbarcacao = destinoEmbarcacao;
    }

    public String getEmpresaEmbarcacao() {
        return EmpresaEmbarcacao;
    }

    public void setEmpresaEmbarcacao(String empresaEmbarcacao) {
        EmpresaEmbarcacao = empresaEmbarcacao;
    }

    public String getIdPortoEmbarcacao() {
        return IdPortoEmbarcacao;
    }

    public void setIdPortoEmbarcacao(String idPortoEmbarcacao) {
        IdPortoEmbarcacao = idPortoEmbarcacao;
    }

    public String getNomeEmbarcacao() {
        return NomeEmbarcacao;
    }

    public void setNomeEmbarcacao(String nomeEmbarcacao) {
        NomeEmbarcacao = nomeEmbarcacao;
    }

    public String getTipoEmbarcacao() {
        return TipoEmbarcacao;
    }

    public void setTipoEmbarcacao(String tipoEmbarcacao) {
        TipoEmbarcacao = tipoEmbarcacao;
    }

    @Override
    public String toString() {
        return  "Nome da Embarcacao: " + NomeEmbarcacao;
    }
}


