package in.coderarmy;

public class UserMigrationService {
    public void migrateUser(){

        //improve design using child class
        User.UserBuilder builder = new User.UserBuilder();
        builder.setAge(30)
                .setName("Sourabh")
                .setEmail("sourabh@gmail.com");

        User user = builder.build();

        System.out.println("User migrate ->" + user);
    }

}
