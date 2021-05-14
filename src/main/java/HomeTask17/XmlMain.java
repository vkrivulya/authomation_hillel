package HomeTask17;

import HomeTask17.models.Message;

public class XmlMain {

    static String fileFolderPath = "/Users/v.kryvulia/Desktop/Authomation/HomeTasks/src/main/java/HomeTask17/resources/";

    public static void main(String[] args) {
        Message message = XmlUtil.unmarshal(fileFolderPath + "fileFirst.xml");
        System.out.println(message);
        message.setCustomerId("123456");
        System.out.println(message);
        XmlUtil.marshal(message, fileFolderPath + "result.xml");
    }
}

