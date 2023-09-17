
package observeryt;


public class DogSubscriber extends Subscriber implements SubscriberObserver{

    public DogSubscriber(String name) {
        super(name);
    }
    
    @Override
    public void update(YoutubeChannel channel) {
        System.out.println("Hola "+getName()+ "! Hay un nuevo video en el canal sobre perros. (Videos : "+ channel.getCantidadVideos()+" ) ");
    }
    
}
