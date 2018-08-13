package e.elemcla.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MapsPage extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_maps_page);

            ImageView imageView = (ImageView) findViewById(R.id.imageView);

            Glide
                    .with(this)
                    .load(R.drawable.groundfloor)
                    .into(imageView);
        }
    }
