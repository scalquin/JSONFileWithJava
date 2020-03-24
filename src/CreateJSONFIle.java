import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJSONFIle {
    public static void main(String [] args){
        JSONObject obj = new JSONObject();
        obj.put("name", "Sebastian");
        obj.put("location", "Chile");

        JSONArray list = new JSONArray();
        list.add("Java");
        list.add("JSP");
        list.add("Servlets");

        obj.put("courses",list);

        try (FileWriter file = new FileWriter("myJSON.json")){
            file.write(obj.toString());
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(obj);
    }

}
