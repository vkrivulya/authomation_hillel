package HomeTask17.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name= "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

    @XmlElement(name = "DateTime")
    private String dateTime;
    @XmlElement(name = "CustomerId")
    private String customerId;
    @XmlElement(name = "CompanyName")
    private String companyName;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Message() {
    }

    public Message(String dateTime, String customerId, String companyName) {
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Message{" +
                "dateTime='" + dateTime + '\'' +
                ", customerId='" + customerId + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
