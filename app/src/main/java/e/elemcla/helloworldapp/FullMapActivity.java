package e.elemcla.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class FullMapActivity extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_full_map);

            ImageView imageView = (ImageView) findViewById(R.id.fullInternalMap);

            Glide
                    .with(this)
                    .load(R.drawable.ericssonmapwhitebackgroundcroppp)
                    .into(imageView);
        }
    }
