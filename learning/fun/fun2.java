package MultiThreading;

public class fun2 {
    public static void main(String[] args) throws InterruptedException {
        String s1 = "Hello guys.\nThis is a new way to print\nHELLO WORLD\nwe are going to win this world :>";
        Thread t = Thread.currentThread();
        for(int i = 0; i< s1.length(); i++){
            System.out.print(s1.charAt(i));
            t.sleep(100);
        }

    }
}
