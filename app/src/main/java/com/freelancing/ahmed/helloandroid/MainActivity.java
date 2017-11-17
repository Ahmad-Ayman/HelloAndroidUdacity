package com.freelancing.ahmed.helloandroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;
    ImageView img,fb,tw,ins,webs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageUdacity);
        Bitmap bMap= BitmapFactory.decodeResource(getResources(),R.drawable.image1);
        Drawable drawable2 = new BitmapDrawable(getResources(),bMap);
        img.setBackground(drawable2);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"MerryChristmasStar.ttf");
        tv1 = (TextView) findViewById(R.id.title);
        tv1.setTypeface(myTypeface);
        tv1.setTextSize(60);
        fb = (ImageView) findViewById(R.id.facebook);
        tw = (ImageView) findViewById(R.id.twitter);
        ins= (ImageView) findViewById(R.id.instagram);
        webs= (ImageView) findViewById(R.id.website);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToURL("https://www.facebook.com/Udacity");
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToURL("https://twitter.com/udacity");
            }
        });
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToURL("https://www.instagram.com/udacity/");
            }
        });
        webs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToURL("https://www.udacity.com/");
            }
        });

    }
    public void GoToURL(String url){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
