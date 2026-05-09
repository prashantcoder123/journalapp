import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

public class MongoTest {
    public static void main(String[] args) {
        String uri = "mongodb+srv://prashantkum7676_db_user:YpoNTgXHy22NtUPV@cluster0.he4vd3t.mongodb.net/journal?appName=Cluster0";
        System.out.println("Connecting to: " + uri);
        try (MongoClient client = MongoClients.create(uri)) {
            System.out.println("Client created.");
            client.listDatabaseNames().first();
            System.out.println("Success.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
