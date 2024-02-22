package programa;

import java.util.Scanner;
import java.util.SortedMap;

public class Cinema {
    public static void main(String[] args) {
        int resposta;
        Boolean c = true;
        do{
            var scan = new Scanner(System.in);

            System.out.println("Por favor selecione a opção desejada!!");
            System.out.println("[1] Cadastrar um filme.");
            System.out.println("[2] Ver lista completa de filmes");
            System.out.println("[3] Ver por ordem de lançamento");
            System.out.println("[4] Sair!");
            resposta = scan.nextInt();

            if(resposta == 1){
                Filme filme = new Filme();
                Acao acao = new Acao();
                Aventura aventura = new Aventura();
                Terror terror = new Terror();
                boolean i = true;
                int resp;
                do{
                    System.out.println("Escolha a categoria:");
                    System.out.println("[1] Ação");
                    System.out.println("[2] Aventura");
                    System.out.println("[3] Terror");
                    System.out.println("[4] Sair");
                    resp = scan.nextInt();
                    if (resp == 1){
                        System.out.println("Insira o nome do Filme");
                        acao.setNomeFilme(scan.next());

                        System.out.println("Insira a data de lançamento mm/yyyy");
                        acao.setDataLancamento(scan.nextLine());

                        acao.FilmeAcao(resp);
                    } else if (resp == 2) {
                        System.out.println("Insira o nome do Filme");
                        aventura.setNomeFilme(scan.nextLine());
                        System.out.println("Insira a data de lançamento mm/yyyy");
                        aventura.setDataLancamento(scan.nextLine());
                        aventura.FilmeAventura(resp);
                    } else if (resp == 3) {
                        System.out.println("Insira o nome do Filme");
                        terror.setNomeFilme(scan.nextLine());
                        System.out.println("Insira a data de lançamento mm/yyyy");
                        terror.setDataLancamento(scan.nextLine());
                        terror.FilmeTerror(resp);
                    } else{
                        i = false;
                    }
                }while (!i);

            }else if (resposta == 2){


                //Aqui vai o Array puro filtrando apenas por classes



            } else if (resposta == 3) {

                //Aqui vai o Array testando se é lançamento


            }else{
                c = false;
            }


        }while (!c);

        System.out.println("Fim");
    }
}
