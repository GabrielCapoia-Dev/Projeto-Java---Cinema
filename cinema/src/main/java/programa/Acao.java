package programa;
public class Acao extends Filme{
    @Override
    public void setNomeFilme(String nomeFilme) {
        super.setNomeFilme(nomeFilme);
    }

    @Override
    public void setDataLancamento(String dataLancamento) {
        super.setDataLancamento(dataLancamento);
    }

    @Override
    public String getDataLancamento() {
        return super.getDataLancamento();
    }

    @Override
    public String getNomeFilme() {
        return super.getNomeFilme();
    }

    private String generoAcao;
    public String FilmeAcao(int resposta){

        if(resposta == 1){
            return generoAcao = "Acao";
        }
        return "";
    }
}
