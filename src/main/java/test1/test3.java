package test1;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient();

		// or
		//MongoClient mongoClient = new MongoClient( "localhost" );

		// or
//		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
//
//		// or, to connect to a replica set, with auto-discovery of the primary, supply a seed list of members
//		MongoClient mongoClient = new MongoClient(
//		  Arrays.asList(new ServerAddress("localhost", 27017),
//		                new ServerAddress("localhost", 27018),
//		                new ServerAddress("localhost", 27019)));
//
//		// or use a connection string
//		MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017,localhost:27018,localhost:27019");
		//MongoClient mongoClient = new MongoClient(connectionString);

		MongoDatabase database = mongoClient.getDatabase("bluejuly");
		MongoCollection<Document> collection = database.getCollection("users");
		Document myDoc = collection.find().first();
		System.out.println(myDoc.toJson());


	}

}
