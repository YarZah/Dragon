package animal;

public class Dragon {

    private String name;
    private int age;
    private int weight;

    public Dragon(){
    }

    public Dragon(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
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

    public int getAge(){
        return this.age;
    }

    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
