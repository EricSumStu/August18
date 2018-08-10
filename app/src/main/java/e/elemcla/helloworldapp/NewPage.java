package e.elemcla.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class NewPage extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_newpage);

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.button);

            Glide
                    .with(this)
                    .load(R.drawable.groundfloor)
                    .into(imageView);
        }
    }
