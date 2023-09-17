/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleyt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class YoutubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private int cantidadVideos;

    public void addObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeObserver(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void subirVideo() {
        cantidadVideos++;
        System.out.println("El canal subio un video "+ getCantidadVideos());
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }
}
