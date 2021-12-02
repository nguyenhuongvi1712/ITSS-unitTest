package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

public class PlaceOrderController {

    public void validateDeliveryInfo(HashMap<String,String> info) throws InterruptedException, IOException{

    }

    public boolean validatePhoneNumber(String phoneNumber){
        // check phoneNumber not null
        if(phoneNumber == null ) return false;
        // check the phoneNumber has 10 digits
        if(phoneNumber.length() != 10) return false;
        // check the phoneNumber start with "0"
        if(!phoneNumber.startsWith("0")) return false;
        // check the phoneNumber contains only number
        try{
            Integer.parseInt(phoneNumber);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    public boolean validateName(String name){
        // check name not null
        if(name == null) return false;
        // check name length
        if(name.length() < 2 || name.length() > 50) return false;
        // check characters
        String PATTERN = "[a-zA-Z ]+";
        System.out.println(Pattern.matches(PATTERN, name));
        if(!Pattern.matches(PATTERN, name)) return false;
        return true;
    }

    public boolean validateAddress(String address) {
        // check address not null
        if(address == null) return false;
        // check characters
        String PATTERN = "[a-zA-Z\\d\\s!@#$%^&*()_\\-:,./{}\\[\\]]+";
        if(!Pattern.matches(PATTERN, address)) return false;
        return true;
    }




}
