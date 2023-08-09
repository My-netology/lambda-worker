public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener eListener = System.out::println;
        Worker worker = new Worker(listener, eListener);
        worker.start();
    }
}