public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener eCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener eCallback) {
        this.callback = callback;
        this.eCallback = eCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                eCallback.onError("Task " + i + " is error!");
            } else {
                callback.onDone("Task " + i + " is done!");
            }
        }
    }
}
