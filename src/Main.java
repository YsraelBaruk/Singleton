import model.Singleton;

public class Main {
    public static void main(String[] args) {
        
        Thread threadCar = new Thread(new ThreadCar());
        Thread threadMotor = new Thread(new ThreadMotor());
        threadCar.start();
        threadMotor.start();
    }

    static class ThreadCar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Car");
            System.out.println(singleton.value);
        }
    }

    static class ThreadMotor implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Motorcycle");
            System.out.println(singleton.value);
        }
    }
}