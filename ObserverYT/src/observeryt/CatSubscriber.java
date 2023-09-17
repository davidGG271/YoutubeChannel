
package observeryt;


public class CatSubscriber extends Subscriber implements SubscriberObserver{

    public CatSubscriber(String name) {
        super(name);
    }
    
    @Override
    public void update(YoutubeChannel channel) {
        System.out.println("Hola "+getName()+ "! Hay un nuevo video en el canal sobre gatos. (Videos : "+ channel.getCantidadVideos()+" ) ");
    }
    
}
