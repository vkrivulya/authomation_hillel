package HomeWork14;

public class Task1GenericMain {
    public static void main(String[] args) {
        Task1Generic<Integer, String, String> generic = new Task1Generic<Integer, String, String>(34, "Vitalii", "Kryvulia");
        generic.printTypes();
        Task1Generic<String, Integer, Double> generic1 = new Task1Generic<String, Integer, Double>("Qwe", 12, 22.22);
        generic1.printTypes();
    }
}
