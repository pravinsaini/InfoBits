package com.example.suryansh.infobits.Responses;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Created by SowmyaY on 01/04/16.
 */
public class UserSettingsResponse {
    public static String imageUrl;
    public static String name;
    public static String email;
    public static String mobile;

    private String json;

    public UserSettingsResponse(String json){
        this.json = json;
    }

    public void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            imageUrl = jsonObject.getString("Image");
            name = "library";//jsonObject.getString("name");
            email = jsonObject.getString("email_id");
            mobile = jsonObject.getString("mobile_number");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
