public class Album{
    private String name;
    private String artist;
    private double price;
    private int numberOfCopies;
    private void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("Um album foi vendido!");
        } else{
            System.out.println("Não há albuns disponíveis!");
        }
    }

    public void orderCopies(int num){
        numberOfCopies += num;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        if(price > 0){
            this.price = price;
        } else{
            this.price = 0.0;
        }
    }

    public int getNumberOfCopies(){
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies){
        if(numberOfCopies > 0){
            this.numberOfCopies = numberOfCopies;
        } else{
            this.numberOfCopies = 0;
        }
    }
}