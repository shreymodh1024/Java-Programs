package MultiThreading;

public class fun1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.print("Initializing the Malware"); t.sleep(600);
        System.out.println("..."); t.sleep(1200);
        System.out.print("Detecting Vulnerabilities"); t.sleep(800);
        System.out.println("..."); t.sleep(200);
        System.out.println("3 files found..."); t.sleep(1000);
        System.out.println("Injecting Malware..."); t.sleep(1000);
        System.out.println("SYSTEM CORRUPTED!"); t.sleep(1000);
        System.out.println("booyah!");

    }
}
