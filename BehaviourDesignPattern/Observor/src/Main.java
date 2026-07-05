import Observable.*;
import Observor.concreteObservor;

void main() {
   concreteObservable observable1 = new concreteObservable("CoderArmy");
   concreteObservable observable2 = new concreteObservable("Craxy XYZ");

   concreteObservor observer1 = new concreteObservor("Sourabh");
   concreteObservor observer2 = new concreteObservor("Amit");


   observable1.addObservor(observer1);
   observable1.addObservor(observer2);

   observable2.addObservor(observer1);
   observable2.addObservor(observer2);



   observable1.uploadVideo("Sexy Video");
   observable2.uploadVideo("Challange Video");

   observable1.deleteObservor(observer2);

   observable1.uploadVideo("LLD Videos");
}
