/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampleyt;

/**
 *
 * @author david
 */
public class ExampleYT {

    
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        
        Subscriber dogSubscriber = new Subscriber("Pedro");
        Subscriber catSubscriber = new Subscriber("Juan");

        
        channel.addObserver(dogSubscriber);
        channel.addObserver(catSubscriber);

        
        channel.subirVideo(); 

        System.out.println("==========================================");
        
        channel.subirVideo(); 
    }
    
}
