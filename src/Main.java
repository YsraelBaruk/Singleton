import model.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello, Singleton!");    
        Singleton otherSingleton = Singleton.getInstance("Other Singleton, Hi!");
        
        System.out.println(singleton.value);
        System.out.println(otherSingleton.value);
    }
}