// Lab5.java
import java.util.ArrayList;
import java.util.List;

class Lab5 {

    interface Observer {
        void update(String message);
    }

    interface Subject {
        void registerObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers();
    }

    static class MessagePublisher implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String message;

        public void setMessage(String message) {
            this.message = message;
            notifyObservers();
        }

        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }
    }

    static class Subscriber implements Observer {
        private String name;

        public Subscriber(String name) {
            this.name = name;
        }

        public void update(String message) {
            System.out.println(name + " received message: " + message);
        }
    }

    public void demonstrate() {
        MessagePublisher publisher = new MessagePublisher();

        Observer sub1 = new Subscriber("Subscriber 1");
        Observer sub2 = new Subscriber("Subscriber 2");

        publisher.registerObserver(sub1);
        publisher.registerObserver(sub2);

        publisher.setMessage("Hello Subscribers!");

        publisher.removeObserver(sub1);

        publisher.setMessage("Goodbye Subscriber 1");
    }
}
