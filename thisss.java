import java.util.*;

class Service {

    static void process(Task t) {
        System.out.println("Processing: " + t);
    }

    static class Task {
        Task() {
            System.out.println("Task created");
        }
    }

    static void start() {
        Task t = new Task();
        process(t);
    }
}

class Thisss {
    public static void main(String[] args) {
        Service.start();
    }
}
