package com.example.w6_p2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnChangeImg1;
    private Button btnChangeImg2;
    private ImageView imgView;
    private TextView imgCaption;
    private ArrayList<Integer> imgNames = new ArrayList<>();
    private HashMap<Integer, String> imgAndCaptions = new HashMap<>();
    private int imgIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChangeImg1 = findViewById(R.id.btnChangeImg1);
        btnChangeImg2 = findViewById(R.id.btnChangeImg2);
        imgView = findViewById(R.id.imgView);
        imgCaption = findViewById(R.id.imgCaption);

       imgNames.add(R.drawable.goldenretriever);
       imgNames.add(R.drawable.pug);
       imgNames.add(R.drawable.rhett);
       imgNames.add(R.drawable.shihtzu);

       imgAndCaptions.put(0, "I'm a golden retriever!");
       imgAndCaptions.put(1, "I'm a pug!");
       imgAndCaptions.put(2, "I'm Rhett!!");
       imgAndCaptions.put(3, "I'm a shih tzu!");

        btnChangeImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imgIndex == 3) {
                    imgView.setVisibility(View.VISIBLE);
                    imgView.setImageResource(imgNames.get(imgIndex));
                    imgCaption.setVisibility(View.VISIBLE);
                    imgCaption.setText(imgAndCaptions.get(imgIndex));
                    imgIndex = 0;
                } else {
                    imgView.setVisibility(View.VISIBLE);
                    imgView.setImageResource(imgNames.get(imgIndex));
                    imgCaption.setVisibility(View.VISIBLE);
                    imgCaption.setText(imgAndCaptions.get(imgIndex));
                    imgIndex++;
                }

            }
        });

        btnChangeImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imgIndex == 3) {
                    imgView.setVisibility(View.VISIBLE);
                    imgView.setImageResource(imgNames.get(imgIndex));
                    imgCaption.setVisibility(View.VISIBLE);
                    imgCaption.setText(imgAndCaptions.get(imgIndex));
                    imgIndex = 0;
                } else {
                    imgView.setVisibility(View.VISIBLE);
                    imgView.setImageResource(imgNames.get(imgIndex));
                    imgCaption.setVisibility(View.VISIBLE);
                    imgCaption.setText(imgAndCaptions.get(imgIndex));
                    imgIndex++;
                }

            }
        });
    }

//    // A method to encode the image before it can be saved to the sharedpreferences
//
//    public static String encodeTobase64(Bitmap image) {
//        Bitmap immage = image;
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        immage.compress(Bitmap.CompressFormat.PNG, 100, baos);
//        byte[] b = baos.toByteArray();
//        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);
//
//        return imageEncoded;
//    }
//
//    // a method to convert a drawable to a bitmap
//
//    public static Bitmap convertToBitmap(Drawable img) {
//        Bitmap drawable = BitmapFactory.decodeResource(Resources.getSystem(), );
//    }
//
//    // a method to encode imageview to store in sharedpreference
//
//    void saveSharedPreferencesInfo(){
//        // Refer to the sharedpreference object
//        SharedPreferences appInfo = getSharedPreferences("MainActivity", Context.MODE_PRIVATE);
//
//        // Create Shared Preferences Editor
//        SharedPreferences.Editor editor = appInfo.edit();
//
//        // Storing important data
//        editor.putString("imgView", encodeTobase64(imgView.))
//
//    }


}
