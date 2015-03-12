import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import com.mongodb.ServerAddress;

import java.util.Date;
import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;


/**
 * @author Eric Faust
 *
 */
public class MongoExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("testDb");
        
        DBCollection collection = db.getCollection("meters");

        //Generate each of the Meter objects
        genMeterOne(collection);
        genMeterTwo(collection);
        genMeterThree(collection);
        genMeterFour(collection);
        genMeterFive(collection);
        genMeterSix(collection);
        genMeterSeven(collection);
        genMeterEight(collection);
        genMeterNine(collection);
        genMeterTen(collection);
        
        //Generate each of the MeterReading objects
        genMeterReadingOne(collection);
        /* .... */
        
        
        //Find the average kwh for one specific meter
		/*
		db.meterReading.aggregate(
		[
			{
		    	$group:
		        {
		        	_id: "$meter",
		        	avgKWH: { $avg : $kwh },
		        }
			}
		])
		*/
		        
        //Find the meter which has a meter reading with the highest kwh among all meter readings.
		/*        
		db.meterReading.find(
			{
		    	$group:
		        {
		        	_id: "$meter",
		        	maxKWH: { $max : $kwh },
		        	address: "$address"
		        }
			}
		)
		*/        		

	}

	public static void genMeterOne(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "1");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}
	
	public static void genMeterTwo(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "2");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}
	
	public static void genMeterThree(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "3");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterFour(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "4");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterFive(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "5");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterSix(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "6");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterSeven(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "7");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}
	
	public static void genMeterEight(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "8");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterNine(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "9");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterTen(DBCollection collection) {
		BasicDBObject meter = new BasicDBObject();
		meter.put("meterId", "10");
		meter.put("meterModel", "Remington");
		meter.put("installDate", new Date());
		
		BasicDBObject address = new BasicDBObject();
		address.put("addressline1", "123 Test Drive");
		address.put("addressline2", "Apt 101");
		address.put("addressline3", "Nowheresville, ND 65410");
		
		meter.put("address", address);
		
		collection.insert(meter);
	}

	public static void genMeterReadingOne(DBCollection collection) {
		BasicDBObject meterReading = new BasicDBObject();
		meterReading.put("meter", "1"); //_id for the corresponding Meter object
		meterReading.put("readingTime", new Date());
		meterReading.put("kwh", 0.25);
		
		collection.insert(meterReading);
	}
	
}
