package com.example.administrator.goalee;

import android.app.DatePickerDialog;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Calendar;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Home";
    private Button mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;


    LinearLayout parent;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button = (Button)findViewById(R.id.button);


     /*
            @Override
            public void onClick(View v) {

            }*/




        String[] btn_name = {"CUET", "BUET", "KUET", "CU", "SUST", "JU","MIST","DU","RUET","JNU"};
        parent = (LinearLayout) findViewById(R.id.l1_parentLayout);

        for (int i = 0; i < 10; i++) {
            b1 = new Button(Home.this);
            b1.setId(i + 1);
            b1.setText(btn_name[i]);
            b1.setHeight(50);
            b1.setWidth(50);
            b1.setTextColor(getResources().getColor(R.color.common_google_signin_btn_text_light));
            if(i%2==0){b1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));}
            else{
                b1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));}

            b1.setTag(i);
            parent.addView(b1);
            b1.setOnClickListener(Home.this);



        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display circular

                Intent intent = new Intent(Home.this, browser.class);
                startActivity(intent);
                finish();
            }
        });

    }


  private void setdate(){

        Intent intent = new Intent(Home.this,browser.class);
        startActivity(intent);
   }

    @Override

    public void onClick(View v) {
        String str = v.getTag().toString();
        if (str.equals("0")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/cuet-admission-circular/ "));
            startActivity(intent);
        } else if (str.equals("1")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/buet-admission-circular/ "));
            startActivity(intent);
        } else if (str.equals("2")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/kuet-admission-circular/ "));
            startActivity(intent);
        } else if (str.equals("3")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/chittagong-university-admission-notice/ "));
            startActivity(intent);
        } else if (str.equals("4")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/sust-admission-circular/"));
            startActivity(intent);
        } else if (str.equals("5")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/jahangirnagar-university-admission-notice/ "));
            startActivity(intent);
        } else if (str.equals("6")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/cuet-admission-circular/ "));
            startActivity(intent);
        } else if (str.equals("7")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/cuet-admission-circular/ "));
            startActivity(intent);
        }
        else if (str.equals("8")) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/cuet-admission-circular/ "));
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://readingbd.com/cuet-admission-circular/ "));
        startActivity(intent);}

}


    }

