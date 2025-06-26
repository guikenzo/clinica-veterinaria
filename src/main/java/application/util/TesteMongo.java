package application.util;

import application.dao.MongoConnection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class TesteMongo {
    public static void main(String[] args) {
        MongoDatabase db = MongoConnection.getDatabase();
        MongoCollection<Document> collection = db.getCollection("testes");

        Document doc = new Document("mensagem", "MongoDB está funcionando!")
                .append("sucesso", true);

        collection.insertOne(doc);
        System.out.println("Documento inserido com sucesso no MongoDB!");
    }
}
