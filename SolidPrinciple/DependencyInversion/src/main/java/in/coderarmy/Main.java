package in.coderarmy;

public class Main {
    static void main() {
        //high level module should not depend on low
        //level modules both should depend on abstraction
        //means instead of one class directly depending on another concrete
        //class we should depend on interface
        //to make app lossely coupled


        //this is done like to add 3rd party integration


        //it basically means we code for interface not for class
        UserService user = new UserService(new MySQLDatabase());
        user.saveUser("sourabh");
    }
}
