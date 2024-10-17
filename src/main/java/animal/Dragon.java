package animal;

public class Dragon {
    public void greetings(String Greetings){
        System.out.println(Greetings);
    }
    public void Fire_breathing(String breathing) {
        System.out.println(breathing);
    }

    private String name;
    private int age;
    private int weight;
    private DragonType dragonType;

    public Dragon(){
    }

    public Dragon(String name, int age, int weight, DragonType dragonType){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dragonType = dragonType;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDragonType(DragonType dragonType) {
        this.dragonType = dragonType;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public DragonType getDragonType() {
        return dragonType;
    }

    public int getAge(){
        return this.age;
    }

    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return "Dragon =" +
                 name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", DragonType = " + dragonType +
                '}';
    }
}
