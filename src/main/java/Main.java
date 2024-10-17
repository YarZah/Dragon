import animal.Dragon;
import animal.DragonType;

public class Main {

    public static void main(String[] args){
        Dragon dragon1 = new Dragon();
        dragon1.greetings("Привіт");
        dragon1.Fire_breathing("Дихає вогнем!!");
        Dragon dragonNew = new Dragon( "Drago", 150, 750, DragonType.RAD_DRAGON);
        System.out.println("Створено повноцінного дракона " + dragonNew.toString());

    }
}
