package Observable;

import Observor.IObservor;

import java.util.ArrayList;
import java.util.List;

public class concreteObservable implements IObservable{
    private List<IObservor> observors;
    private String name;
    private String description;

    public concreteObservable(String name){
        observors = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addObservor(IObservor observor) {
        if(!observors.contains(observor)){
            observors.add(observor);
        }
    }

    @Override
    public void deleteObservor(IObservor observor) {
        observors.remove(observor);
    }

    @Override
    public void notifyObservers() {
        for(IObservor observor : observors){
            observor.update(this);
        }
    }

    public void uploadVideo(String desciption){
        this.description = desciption;
        System.out.println("\n[" + name + " uploaded \"" + description + "\"]");
        notifyObservers();
    }

    public String getVideoData(){
        return "\nCheckout our new Video : " + description + "\n";
    }
}
