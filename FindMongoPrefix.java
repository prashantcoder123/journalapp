import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

public class FindMongoPrefix {
    public static void main(String[] args) {
        ConfigurationProperties annotation = MongoProperties.class.getAnnotation(ConfigurationProperties.class);
        System.out.println("Prefix: " + annotation.prefix());
    }
}
