import java.util.Date;
import com.mongodb.BasicDBObject;

public class Meter extends BasicDBObject {
	private String meterId;
	private String meterModel;
	private Date installDate;
	private Address address;
	
	public String getMeterId() {
		return meterId;
	}
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}
	public String getMeterModel() {
		return meterModel;
	}
	public void setMeterModel(String meterModel) {
		this.meterModel = meterModel;
	}
	public Date getInstallDate() {
		return installDate;
	}
	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
