package HomeWork11;

public class LevelMain {

    public static void main(String[] args) {

        for (Level level : Level.values()) {
            System.out.print(level.toString());
            System.out.println(": " + level.getLevelCode());
        }
    }
}
