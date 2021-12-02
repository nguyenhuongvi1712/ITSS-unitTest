package controller;

import Model.Media;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class PlaceRushOrderController {
    public void checkSupportPlaceRushOrder(HashMap<String,List<Media>> info) throws InterruptedException, IOException {
    }

    public void validateDeliveryTime() throws InterruptedException,Exception {}

    public boolean checkIsRushAddress(String city){
        if(city.equals("Hà Nội"))
            return true;
        else return false;
    }

    public boolean validateRushSupportListMedia(List<Media> mediaList){
        for (Media m : mediaList){
            if(m.getIsRushProduct() == true)
                return true;
        }
        return false;
    }

    public boolean validateDeliveryDate(String date) {
        Pattern patternDate = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        Date now = new Date(System.currentTimeMillis());
        // check format
        if(!patternDate.matcher(date).matches())
            return false;
        try{
            if(now.compareTo(new SimpleDateFormat("MM/dd/yyyy").parse(date)) > 0) // ngay qua khu
                return false;
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean validateDeliveryTimeInterval (String from, String to){
        Pattern patternTime = Pattern.compile("\\d{1,2}:\\d{1,2}");
        if(!patternTime.matcher(from).matches() || !patternTime.matcher(to).matches())
            return false;
        return true;
    }
}
