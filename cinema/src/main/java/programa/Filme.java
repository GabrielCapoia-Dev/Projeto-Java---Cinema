package programa;

public abstract class Filme implements Lancamento {

    //Parametros - Variaveis
    private String nomeFilme;
    private String dataLancamento;

    // Metodos Setters
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    // Metodos Getters
    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    //Metodo Abstrato - Função Abstrata
    public abstract void CadastrarFilme();

}
