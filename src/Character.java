public class Character {
    //name
    //Height
    //Weight
    protected String name;
    protected double height;
    protected double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //constructor
    public Character (String name, double height, double weight){
        this.name= name;
        this.height = height;
        this.weight = weight;
        System.out.println("Estoy en el constructor padre");
    }

    //eat
    //Sleep
    //Think
    public void comer(){
        System.out.println("Comiendo");
    }

    public void sleep(){
        System.out.println("Durmiendo");
    }

    public void think(){
        System.out.println("Pensando");
    }
}
