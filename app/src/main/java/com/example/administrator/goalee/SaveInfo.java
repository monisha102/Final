package com.example.administrator.goalee;

import java.util.Date;

public class SaveInfo {

    public String email,exam;
    public Date date;

    SaveInfo(){}
    SaveInfo(String email, String exam, Date date){
        this.date=date;
        this.email=email;
        this.exam=exam;
    }
}
