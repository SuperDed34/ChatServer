package org.objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String formattedMessage, formattedDate, techMessage;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss");

    public void setFormattedMessage(String formatted_message) {
        this.formattedMessage = formatted_message;
    }

    public String getDate(){
        Date date = new Date();
        formattedDate = sdf.format(date);
        return formattedDate;
    }

    public String getTechFormattedMessage(String msg){
        techMessage = "["+ getDate() + "]" + msg;
        return techMessage;
    }
}
