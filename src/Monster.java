import java.util.ArrayList;

//extends NameOfFatherClass
public class Monster extends Character{

    //horns
    //Tentacles
    //Color
    //Skills
    private boolean horns;
    private boolean tentacles;
    private String color;
    private ArrayList<String> skills;

    public boolean isHorns() {
        return horns;
    }

    public void setHorns(boolean horns) {
        this.horns = horns;
    }

    public boolean isTentacles() {
        return tentacles;
    }

    public void setTentacles(boolean tentacles) {
        this.tentacles = tentacles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Monster(String name, double height, double weight, boolean horns, boolean tentacles, String color, ArrayList<String> skills) {
        super(name, height, weight);
        this.horns = horns;
        this.tentacles = tentacles;
        this.color = color;
        this.skills = skills;
        System.out.println("I am the monster constructor");
    }

    //Scare
    //Work
    //Making Laugh
    public void scare(){
        System.out.println("Boo");
    }

    public void work(){
        System.out.println("Working");
    }

    public void makeLaugh(){
        System.out.println("Insert a joke");
    }
}
