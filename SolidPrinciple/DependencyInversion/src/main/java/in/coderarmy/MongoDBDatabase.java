package in.coderarmy;

public class MongoDBDatabase implements Database {

    public void saveDocument(String data){
        System.out.println("Saving socument in MongoDB: " + data);
    }

    @Override
    public void save(String User) {
        System.out.println("Saving socument in MongoDB: " + User);
    }
}
