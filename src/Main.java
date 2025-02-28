import model.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singletonCar = Singleton.getInstance("this is a car!");    
        Singleton singletonMotor = Singleton.getInstance("this is a motorcycle!");
        
        System.out.println(singletonCar.value);
        System.out.println(singletonMotor.value);
    }
}