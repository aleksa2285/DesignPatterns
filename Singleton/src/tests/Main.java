package tests;

public class Main {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting with testing " + System.nanoTime());
                ChocolateBoiler instance = ChocolateBoiler.getInstance();
                System.out.println("Testing is finished, first thread, Singleton instance hashcode: " + instance.hashCode() +  " nano seconds elapsed " + System.nanoTime());
            }
        }).run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting with testing " + System.nanoTime());
                ChocolateBoiler instance = ChocolateBoiler.getInstance();
                System.out.println("Testing is finished, second thread, Singleton instance hashcode: " + instance.hashCode() +  " nano seconds elapsed " + System.nanoTime());
            }
        }).run();
    }
}

