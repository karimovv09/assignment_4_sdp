// Lab1.java
class Lab1 {

    interface Handler {
        void setNext(Handler handler);
        void handleRequest(String request);
    }

    static class ConcreteHandler1 implements Handler {
        private Handler next;

        public void setNext(Handler handler) {
            next = handler;
        }

        public void handleRequest(String request) {
            if (request.equals("Task1")) {
                System.out.println("Handled by Handler1");
            } else if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("Request cannot be handled");
            }
        }
    }

    static class ConcreteHandler2 implements Handler {
        private Handler next;

        public void setNext(Handler handler) {
            next = handler;
        }

        public void handleRequest(String request) {
            if (request.equals("Task2")) {
                System.out.println("Handled by Handler2");
            } else if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("Request cannot be handled");
            }
        }
    }

    static class ConcreteHandler3 implements Handler {
        private Handler next;

        public void setNext(Handler handler) {
            next = handler;
        }

        public void handleRequest(String request) {
            if (request.equals("Task3")) {
                System.out.println("Handled by Handler3");
            } else if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("Request cannot be handled");
            }
        }
    }

    public void demonstrate() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        System.out.println("Sending Task1:");
        handler1.handleRequest("Task1");

        System.out.println("\nSending Task2:");
        handler1.handleRequest("Task2");

        System.out.println("\nSending Task3:");
        handler1.handleRequest("Task3");

        System.out.println("\nSending Task4:");
        handler1.handleRequest("Task4");
    }
}
