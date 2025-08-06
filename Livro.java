package atividade;

public class Livro extends ItemBiblioteca {

    String autor;
    int paginas;

    @Override
    public void infos(){
        System.out.println("========== LIVROS ==========");
        super.infos();
        System.out.println("O autor do livro: " + autor);
        System.out.println("Quantidade de páginas: " + paginas);
    }




    }


