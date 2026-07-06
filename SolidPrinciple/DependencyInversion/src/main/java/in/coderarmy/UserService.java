package in.coderarmy;


public class UserService {

    //here in this our user service directly depend on database service
//so it is tightly coupled
//   private MySQLDatabase database1 = new MySQLDatabase();
//   private MongoDBDatabase database2 = new MongoDBDatabase();
//
//    public void saveUser(String user){
//       database1.saveData(user);
//    }
//
//    public void saveUserInMongo(String user){
//        database2.saveDocument(user);
//    }


    //lossely coupled -- depend on interface
    private Database database;


    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser(String user){
        database.save(user);
    }

}
