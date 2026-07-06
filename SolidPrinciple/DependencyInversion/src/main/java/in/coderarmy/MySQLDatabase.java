package in.coderarmy;

public class MySQLDatabase implements Database {
    public void saveData(String data){
        System.out.println("Saving data in MySQL: " + data);
    }

    @Override
    public void save(String User) {
        System.out.println("Saving socument in MySQL: " + User);
    }
}
