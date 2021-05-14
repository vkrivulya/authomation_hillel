package HomeTask17;

import HomeTask17.models.Message;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

public class XmlUtil {

    public static void marshal(Message message, String outFilePath){
        try{
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Message.class);
            //creating the marshaller object
            Marshaller marshallObj = jContext.createMarshaller();
            //setting the property to show xml format output
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //setting the values in POJO class
            //calling the marshall method
            marshallObj.marshal(message, new FileOutputStream(outFilePath));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static Message unmarshal(String filePath){
        Message message = null;
        try{
            //getting the xml file to read
            File file = new File(filePath);
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Message.class);
            //creating the unmarshall object
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            //calling the unmarshall method
            message =(Message) unmarshallerObj.unmarshal(file);
        }catch(Exception e){
            e.printStackTrace();
        }
        return message;
    }
}
