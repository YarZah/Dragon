import animal.Dragon;

public class Main {

    public static void main(String[] args){
        Dragon dragonNew = new Dragon( "Drago", 150, 750);
        Dragon dragon2 = new Dragon();
        System.out.println(dragonNew.toString());
        System.out.println(dragon2.toString());
    }
}
