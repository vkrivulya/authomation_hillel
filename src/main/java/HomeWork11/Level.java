package HomeWork11;

public enum Level {
    //3. Write program which contains enum with 3 values (name of value and int number).
    // Print out in main in other class all pairs which you store in enum.

    HIGH(1),

    MEDIUM(2),

    LOW(3);

    public Level getStatus() {
        return status;
    }

    private Level status;

    private final int levelCode;

    private String levelName;

    Level(int levelCode) {

        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getLevelName() {
        return levelName;
    }

}
