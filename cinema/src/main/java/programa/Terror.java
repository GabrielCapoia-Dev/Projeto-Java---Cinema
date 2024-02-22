package programa;
public class Terror extends Filme{

    private String generoTerror;
    public String FilmeTerror(int resposta){
        if(resposta == 3){
            return generoTerror = "Terror";
        }
        return "";
    }
}
