package com.ovi.maphunter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
ImageButton img,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
int dpi=displaymetrics.densityDpi;
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        FrameLayout holder = (FrameLayout)findViewById(R.id.holder);
       img = new ImageButton(this);
        img3 = new ImageButton(this);
        img4 = new ImageButton(this);
        ImageButton img2 = new ImageButton(this);

if(dpi<230&&width<800) {
    img2.setImageResource(R.drawable.place_marker2);
    img.setImageResource(R.drawable.place_marker2);
    img3.setImageResource(R.drawable.place_marker2);
    img4.setImageResource(R.drawable.place_marker2);
}
        else
{
    img2.setImageResource(R.drawable.place_marker);
    img.setImageResource(R.drawable.place_marker);
    img3.setImageResource(R.drawable.place_marker);
    img4.setImageResource(R.drawable.place_marker);
}
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.my_topBau, typedValue, true);
        float My_topBau = typedValue.getFloat();
        getResources().getValue(R.dimen.my_leftBau, typedValue, true);
        float My_leftBau = typedValue.getFloat();
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params.leftMargin = (int) ((int) width*My_leftBau);
        params.topMargin  = (int) (height/My_topBau);
        holder.addView(img, params);

        getResources().getValue(R.dimen.my_topMel, typedValue, true);
        float My_topMel = typedValue.getFloat();
        getResources().getValue(R.dimen.my_leftMel, typedValue, true);
        float My_leftMel = typedValue.getFloat();
        FrameLayout.LayoutParams params2 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params2.leftMargin = (int) ((int) width*My_leftMel);
        params2.topMargin  = (int) (height/My_topMel);
        holder.addView(img2, params2);

        getResources().getValue(R.dimen.my_topMte, typedValue, true);
        float My_topMte = typedValue.getFloat();
        getResources().getValue(R.dimen.my_leftMte, typedValue, true);
        float My_leftMte = typedValue.getFloat();
        FrameLayout.LayoutParams params3 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params3.leftMargin = (int) ((int) width*My_leftMte);
        params3.topMargin  = (int) (height/My_topMte);
        holder.addView(img3, params3);

        getResources().getValue(R.dimen.my_topPar, typedValue, true);
        float My_topPar = typedValue.getFloat();
        getResources().getValue(R.dimen.my_leftPar, typedValue, true);
        float My_leftPar = typedValue.getFloat();
        FrameLayout.LayoutParams params4 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params4.leftMargin = (int) ((int) width*My_leftPar);
        params4.topMargin  = (int) (height/My_topPar);
        holder.addView(img4, params4);

        img.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Baunia", Toast.LENGTH_SHORT).show();
            }
        });
        img2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Mirpur 11", Toast.LENGTH_SHORT).show();
            }
        });

        img3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Mirpur 10", Toast.LENGTH_SHORT).show();
            }
        });
        img4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Paris Road", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onClick(View view) {

    }
}
