package atividade;

public class Revista extends ItemBiblioteca {


    // ATRIBUTOS DA CLASSE REVISTA- FILHA
    String editora;
    int numerodaEdicao;
    @Override
    public void infos(){
        System.out.println("========== REVISTA ==========");
        super.infos();
        System.out.println("Editora da Revista: " + editora);
        System.out.println("Numero da Edição: " + numerodaEdicao);
    }


}
