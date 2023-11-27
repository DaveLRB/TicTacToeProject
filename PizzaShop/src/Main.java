
public class Main {
    public static void main(String[] args) {

        StatesOfPizza hawaiana = StatesOfPizza.ORDERED;
        hawaiana.printTime();
        StatesOfPizza diavola = StatesOfPizza.DELIVERED;
        diavola.printTime();
        StatesOfPizza mare = StatesOfPizza.READY;
        mare.printTime();



    }
}