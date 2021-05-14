package HomeWork14;

//Write program which contains class with 3 generics, each is used as type of variable inside of class.
// Add usage of class with generics, use different types of variables for generic
public class Task1Generic<U, V, Z> {
    private final U objUreff;
    private final V objVreff;
    private final Z objZreff;

    public Task1Generic(U objUreff, V objVreff, Z objZreff) {
        this.objUreff = objUreff;
        this.objVreff = objVreff;
        this.objZreff = objZreff;
    }

    public void printTypes() {
        System.out.println("U Type: " + this.objUreff.getClass().getName());
        System.out.println("V Type: " + this.objVreff.getClass().getName());
        System.out.println("Z Type: " + this.objZreff.getClass().getName());
    }
}
