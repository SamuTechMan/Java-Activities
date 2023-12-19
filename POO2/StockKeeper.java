public class StockKeeper{
    private String name;
    StockKeeper(String name){
        this.name = name;
    }
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
        /* Definindo os stados e comportamentos para album */
        album.name = name;
        album.artist = artist;
        album.price = price;
        album.numberOfCopies = numberOfCopies;
        /* Imprimindo os detalhes do album */
        System.out.println("Album gerenciado por : "+ this.name);
        System.out.println("Detalhes do album:::::::::::::");
        System.out.println("Nome de album: "+album.name);
        System.out.println("Artista do album: "+album.artist);
        System.out.println("Preço do album: "+album.price);
        System.out.println("Número de cópias do album: "+album.numberOfCopies);
    }
}