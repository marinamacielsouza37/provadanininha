// método que mostra o menu principal do sistema
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Menu{
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("DIGITE 0 PARA FINALIZAR O PROGAMA!");
        int MAX_ELEMENTOS = 2;
        int opcao, qtdCadastrados = 0; int x;String BuscaCod;
        bibli[] Livros = new bibli[MAX_ELEMENTOS];
        //Pessoa[] holdLivros = new Pessoa[];
        Scanner in = new Scanner(System.in);

        do {
            Integer flag = 1;
            System.out.println("\n:: G E R E N C I A R   L I V R O S ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Novo livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Pesquisar Livros");
            System.out.println("4 - Aumentar a biblioteca");
            
            System.out.print("Sua opção: ");
            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, caio fora
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos Livros.");
                    voltarMenu(in);
                    continue;
                }
                    
                    System.out.println("Digite o nome do livro, nome do autor e o numero de páginas: ");
                    bibli book = new bibli(qtdCadastrados + 1, in.nextLine(), in.nextLine(), in.nextInt());
                    
                    for(x=0;x<qtdCadastrados;x++){
                        if(qtdCadastrados==Livros.length){
                            bibli[] holdLivros = Arrays.copyOf(Livros, MAX_ELEMENTOS); 
                            Livros = holdLivros;
                        }
                    }
                    Livros[qtdCadastrados] = book;    
                    qtdCadastrados++;
                
                
                //System.out.println("\nLivro cadastrado com sucesso. O codigo do livro no sistema é: ");   
                voltarMenu(in);
                   
            }
             else if (opcao == 2) {
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há livros cadastrados para exibir.");
                    
                    }
                    for(x = 0;x < qtdCadastrados;x++){
                        System.out.println("Dados do livro de codigo de numero: "+ Livros[x].getCodigos());
                      System.out.println("Nome do Livro: "+Livros[x].getLivro());
                      System.out.println("Nome do Autor: "+Livros[x].getAutor());
                      System.out.println("Quantidade de páginas: "+Livros[x].getPaginas() + "\n");
                    }
                    voltarMenu(in);
                    continue;
                    

                // Exibindo os Livros

            
            } else if (opcao == 3) {
                System.out.println("Digite o numero do livro cadastrado: ");
                BuscaCod = in.nextLine();
                for(x=0;x < qtdCadastrados;x++){
                    if(BuscaCod.equals(Livros[x].getCodigos())){
                        System.out.println("Nome do Livro: "+Livros[x].getLivro());
                        flag=0;
                    break;
                    
                }}
                if(flag.equals(1)){
                    System.out.println("Código invalido!");
                    
                }
                
                    voltarMenu(in);
                
               
            } else if (opcao == 4) {
                MAX_ELEMENTOS++;
                System.out.println("\nArmazenamento aumentado com sucesso!.");
                voltarMenu(in);
                
                
            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }
    
    

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
    }
