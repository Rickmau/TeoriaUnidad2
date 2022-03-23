import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Monster sully = new Monster("Sully",
                3.2,
                1000,
                true,
                false,
                "Blue",
                new ArrayList<>(Arrays.asList("strong,charismatic")));
    }
}
