package HomeTask17;

import HomeTask17.jsonModels.JsonModel;
import HomeTask17.jsonModels.Window;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser {

    public static void main(String[] args) {
        Window window = new Window();
        Gson g = new Gson();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/v.kryvulia/Desktop/Authomation/HomeTasks/src/main/java/HomeTask17/resources/json.json"));
            JsonModel jsonModel = g.fromJson(br, JsonModel.class);
            String str = g.toJson(jsonModel);
            System.out.println(str);
            window.setTitle("qwe");
            String str1 = g.toJson(jsonModel);
            System.out.println(str1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
