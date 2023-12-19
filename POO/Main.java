public class Main{
    public static void main(String[] args){
        Cat thor = new Cat();
        Cat rambo = new Cat();
        
        /*
         Definindo o gato Thor
         */
        thor.name = "Thor";
        thor.age = 3;
        thor.breed = "Azul russo";
        thor.color = "Brown";
        
        thor.sleep();
        
        /*
         Definindo o gato Rambo
         */
        rambo.name = "Rambo";
        rambo.age = 4;
        rambo.breed = "Maine Coon";
        rambo.color = "Brown";
        
        rambo.play();
    }
}