package programa;

import java.util.Scanner;
import java.util.SortedMap;

public class Cinema {
    public static void main(String[] args) {

        // Obejto para reconhecer o input do usuário
        Scanner scanner = new Scanner(System.in);

        // Variavel para armazenar o Input
        int resposta;
       boolean condicao = true;

        while (condicao == true){

            // Inicio da coleta de dados
            System.out.println("""
                |======================================================|
                |========= Bem-vindo ao Gerenciamento de Filmes =======|
                |  Insira a Opção desejada!!                           |
                |      [1] Cadastrar Filme                             |
                |      [2] Ver Filmes Cadastrados                      |
                |      [3] Ver Filmes lançamentos (menos de 30 dias)   |
                |      [4] Sair                                        |
                |======================================================|
                |======================================================|               
                """);
            resposta = scanner.nextInt();
           switch (resposta){
               case 1:
                   int respostaCadastroFilme;
                   boolean condicaoCadastroFilme = true;
                        while (condicaoCadastroFilme == true){
                            System.out.println("""
                        |======================================================|
                        |  Insira o genêro do filme!!                          |
                        |      [1] Terror                                      |
                        |      [2] Ação                                        |
                        |      [3] Aventura                                    |
                        |      [4] Voltar                                      |
                        |======================================================|            
                        """);
                            respostaCadastroFilme = scanner.nextInt();
                            switch (respostaCadastroFilme){
                                case 1:

                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                case 4:
                                    condicaoCadastroFilme = false;
                                    break;
                                default:
                                    System.out.println("Insira apenas um dos numeros nas opções a cima");
                            }
                        }
                   break;
               case 2:
                   System.out.println("Caso 2");
                   break;
               case 3:
                   System.out.println("Caso 3");
                   break;

               case 4:
                    condicao = false;
                   break;

               default:
                   System.out.println("Insira apenas um dos numeros nas opções a cima");
           }


        }
        System.out.println("Programa Encerrado...");
    }
}
