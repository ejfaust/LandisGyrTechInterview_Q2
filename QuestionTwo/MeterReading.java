import java.util.Date;

import com.mongodb.BasicDBObject;

public class MeterReading extends BasicDBObject {
	private Meter meter;
	private Date readingTime;
	private double kwh;
	
	public Meter getMeter() {
		return meter;
	}
	public void setMeter(Meter meter) {
		this.meter = meter;
	}
	public Date getReadingTime() {
		return readingTime;
	}
	public void setReadingTime(Date readingTime) {
		this.readingTime = readingTime;
	}
	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
}
