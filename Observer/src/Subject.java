import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> subscribers = new ArrayList<>();
    public boolean Subscribe(Observer observer) {
        return subscribers.add(observer);
    }

    public boolean Unsubscribe(Observer observer) {
        return subscribers.remove(observer);
    }

    public void NotifyAll() {
        for (Observer observer : subscribers) {
            observer.Notify(this);
        }
    }
}
