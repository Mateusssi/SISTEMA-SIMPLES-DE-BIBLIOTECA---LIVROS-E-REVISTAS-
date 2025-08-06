package atividade;

public class ItemBiblioteca {


    // ATRIBUTOS DA CLASSE BIBLIOTECA - MÃE
    String titulo;
    long codigo;
    int ano;


    public int idade(int anoAtual){
        return anoAtual - ano;
    }

    public void infos(){
        System.out.println("Titulo do Livro: " + titulo);
        System.out.println("Codigo do Livro: " + codigo);
        System.out.println("Ano do Livro: " + ano);

    }

}
