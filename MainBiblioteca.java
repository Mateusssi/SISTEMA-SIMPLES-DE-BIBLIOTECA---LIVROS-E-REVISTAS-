package atividade;

import java.util.Scanner;

public class MainBiblioteca {

    public static void main(String[] args) {

        // SCANNERS
        Scanner scanner = new Scanner(System.in);


        //INICIANDO ARRAYS
        int itensMAX = 0;
        ItemBiblioteca[] itens = new ItemBiblioteca[20];


        // INICIANDO VARIAVEIS
        int quantidadelivros = 0;
        int quantidaderevistas = 0;
        int total;
        String entrada;
        String titulo;
        String editora;
        String autora;
        int edicao;
        int escolha;
        int opcao = 0;
        long codigo = 0;
        int ano;
        int paginas;


        while (opcao != 4) {
            // MENU DA BIBLIOTECA
            System.out.println("-------------------- MENU BIBLIOTECA --------------------");
            System.out.println("1 - Cadastrar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Buscar por código");
            System.out.println("4 - Estatísticas da Biblioteca");
            System.out.println("5 - Encerrar programa");

            // SWITCH CASES

            try {
                // OPÇÃO DO USUARIO
                System.out.println("Escolha a opção: ");
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);
                switch (opcao) {

                    case 1:
                        //SUB MENU
                        System.out.println(" 1 - Cadastrar livro");
                        System.out.println(" 2 - Cadastrar Revista");
                        System.out.println(" Escolha a opção: ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();

                        // QUANTIDADE DE LIVROS
                        if (escolha == 1) {
                            System.out.println("Quantos livros você quer cadastrar: ");
                            quantidadelivros = scanner.nextInt();
                            scanner.nextLine();

                            //CADASTRAR LIVRO
                            if (itensMAX + quantidadelivros < itens.length) {
                                for (int i = 0; i < quantidadelivros; i++) {
                                    // COLETA DE DADOS DO LIVRO E ADIÇÃO A ARRAY DA CLASSE BIBLIOTECA
                                    System.out.println("--------------------- REGISTRO DE LIVRO ---------------------");
                                    System.out.println("LIVRO NÚMERO - " + (i + 1));
                                    System.out.println("===================================");

                                    System.out.println("Digite o titulo do livro: ");
                                    titulo = scanner.nextLine();

                                    System.out.println("Digite o autor: ");
                                    autora = scanner.nextLine();


                                    System.out.println("Digite o número de páginas: ");
                                    paginas = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.println("Digite o Código:  ");
                                    codigo = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.println("Digite o ano de Publicação: ");
                                    ano = scanner.nextInt();
                                    scanner.nextLine();

                                    // CRIANDO OBJETO LIVRO E ADICIONANDO SEUS RESPECTIVOS VALORES
                                    Livro livro = new Livro();
                                    livro.titulo = titulo;
                                    livro.autor = autora;
                                    livro.codigo = codigo;
                                    livro.paginas = paginas;
                                    livro.ano = ano;

                                    System.out.println("LIVRO CADASTRADO COM SUCESSO !!");

                                    // ADICIONANDO A ARRAY ATÉ ESTOURAR O LIMITE
                                    itens[itensMAX + i] = livro;
                                }
                                itensMAX += quantidadelivros;

                            } else {
                                System.out.println("CADASTRO DE LIVROS ATINGIDO!!");
                            }

                        } else if (escolha == 2) {
                            // REGISTRO DE DADOS - QUANTIDADE DE REVISTAS
                            System.out.println("Quantas revistas você quer cadastrar: ");
                            quantidaderevistas = scanner.nextInt();
                            scanner.nextLine();
                            if (itensMAX + quantidaderevistas <= itens.length) {
                                for (int i = 0; i < quantidaderevistas; i++) {
                                    // COLETA DE DADOS DO LIVRO E ADIÇÃO A ARRAY DA CLASSE BIBLIOTECA
                                    System.out.println("--------------------- REGISTRO DE REVISTAS ---------------------");
                                    System.out.println("REVISTA NÚMERO - " + (i + 1));
                                    System.out.println("===================================");

                                    System.out.println("Digite o titulo da revista: ");
                                    titulo = scanner.nextLine();

                                    System.out.println("Digite a Editora: ");
                                    editora = scanner.nextLine();


                                    System.out.println("Digite o número de páginas: ");
                                    edicao = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.println("Digite o Código:  ");
                                    codigo = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.println("Digite o ano de Publicação: ");
                                    ano = scanner.nextInt();
                                    scanner.nextLine();

                                    // CRIANDO OBJETO REVISTA E ADICIONANDO SEUS RESPECTIVOS VALORES
                                    Revista revista = new Revista();
                                    revista.titulo = titulo;
                                    revista.editora = editora;
                                    revista.codigo = codigo;
                                    revista.numerodaEdicao = edicao;
                                    revista.ano = ano;

                                    System.out.println("REVISTA CADASTRADA COM SUCESSO !!");

                                    // ADICIONANDO A ARRAY ATÉ ESTOURAR O LIMITE
                                    itens[itensMAX + i] = revista;
                                }
                                itensMAX += quantidaderevistas;

                            }
                        } else {
                            System.out.println("CADASTRO DE REVISTAS ATINGIDO!!");

                        }
                        break;

                    case 2:

                        if (itensMAX == 0) {
                            System.out.println("Nenhum item foi cadastrado!");
                            System.out.println("PRESSIONE ENTER PARA VOLTAR AO MENU...");
                            scanner.nextLine();
                        } else {
                            System.out.println("Existe itens cadastrados na Biblioteca");
                        }

                        for (int i = 0; i < itensMAX; i++) {
                            System.out.println("====================================================");

                            System.out.println("item " + (i + 1));
                            itens[i].infos();
                            System.out.println("Idade do Item: " + itens[i].idade(2025));
                            System.out.println("----------------------------------------------------");
                            System.out.println("PRESSIONE ENTER PARA VOLTAR AO MENU...");
                            scanner.nextLine();
                        }

                        break;

                    case 3:
                        System.out.println("Digite o código que deseja Buscar: ");
                        long codigoBuscado = scanner.nextInt();
                        scanner.nextLine();

                        boolean encontrou = false;

                        for (int i = 0; i < itensMAX; i++) {
                            if (itens[i].codigo == codigoBuscado) {
                                itens[i].infos();
                                encontrou = true;

                            }

                            if (!encontrou) {
                                System.out.println("Código não encontrado");
                                encontrou = false;

                            }

                        }
                        break;

                    case 4:
                        if(itensMAX >= 1){
                        System.out.println(" ==== ESTATÍSTICAS DA BIBLIOTECA");
                        total = quantidadelivros + quantidaderevistas;
                        System.out.println("Total de itens = " + total);
                        System.out.println("- Livros: " + quantidadelivros);
                        System.out.println("- Revistas " + quantidaderevistas);}

                        else{
                            System.out.println("Nenhum item foi cadastro, por favor cadastre para voltar!");
                        }
                        break;
                    case 5:
                        System.out.println("OBRIGADO POR ACESSAR NOSSA BIBLIOTECA, ATÉ LOGO!!");
                        scanner.close();
                        break;

                    default:
                        System.out.println("OPÇÃO INVÁLIDA... ESCOLHA NOVAMENTE!!");
                        break;


                }
            } catch (Exception e) {
                System.out.println("APENAS NÚMEOS DE 1 A 5!!");
                scanner.next();
                opcao = 0;
            }

        }

    }
}