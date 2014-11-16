package android.example.com.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ajdin on 11/16/2014.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject wx = new JSONObject(weatherJsonStr);
        JSONArray days = wx.getJSONArray("list");
        JSONObject day = days.getJSONObject(dayIndex);
        JSONObject temp = day.getJSONObject("temp");
        return (Double)temp.get("max");
    }

}
