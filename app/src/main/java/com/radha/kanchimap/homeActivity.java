package com.radha.kanchimap;

//import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class homeActivity extends AppCompatActivity {


    ViewFlipper view_flipper;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_home);


        button =findViewById(R.id.button);
        button.getBackground().setAlpha(170);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapActivity();
            }
        });


        int images[]={R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};


        view_flipper=findViewById(R.id.v_flipper);


     //for loop for pics

        for(int image:images){
            flipperImages(image);
        }
    }

    public void openMapActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);



    }


    public void flipperImages(int image){
        ImageView imageView = new ImageView(this );
        imageView.setBackgroundResource(image);

        view_flipper.addView(imageView);
        view_flipper.setFlipInterval(4000);
        view_flipper.setAutoStart(true);


        view_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
        view_flipper.setInAnimation(this, android.R.anim.slide_in_left)
                ;
       // view_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}

