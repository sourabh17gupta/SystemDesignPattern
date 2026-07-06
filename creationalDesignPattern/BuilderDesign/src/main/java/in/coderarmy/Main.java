package in.coderarmy;



public class Main {
    static void main() {
        //builder Pattern :
        //it helps us create complex object easily by keeping \
        //the object process flexible,readable and maintainable

       UserMigrationService ums = new UserMigrationService();
       ums.migrateUser();
    }
}
