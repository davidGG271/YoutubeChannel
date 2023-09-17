
package observeryt;


public class ObserverYT {

    
    public static void main(String[] args) {
        
        YoutubeChannel channel = new YoutubeChannel();

        
        SubscriberObserver dogSubscriber = new DogSubscriber("Pedro");
        SubscriberObserver catSubscriber = new CatSubscriber("Juan");

        
        channel.addObserver(dogSubscriber);
        channel.addObserver(catSubscriber);

        
        channel.subirVideo(); 

        System.out.println("==========================================");
        
        channel.subirVideo(); 
    }
    
}
