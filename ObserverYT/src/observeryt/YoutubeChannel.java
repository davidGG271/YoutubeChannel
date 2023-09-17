
package observeryt;

import java.util.ArrayList;
import java.util.List;


public class YoutubeChannel {
    private List<SubscriberObserver> subscribers = new ArrayList<>();
    private int cantidadVideos;

    public void addObserver(SubscriberObserver subscriber) {
        subscribers.add(subscriber);
    }

    public void removeObserver(SubscriberObserver subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyObservers() {
        for (SubscriberObserver subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void subirVideo() {
        cantidadVideos++;
        notifyObservers();
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }
    
    
}
