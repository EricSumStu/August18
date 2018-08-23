package e.elemcla.helloworldapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static e.elemcla.helloworldapp.MainActivity.qr;

public class treasure extends AppCompatActivity {

    private final static String ERROR_MESSAGE = "Unable to scan bar code";
    private boolean isScanned=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);



        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);


        System.out.println(qr+"xxxxxxxxxxxxxx");

            switch (Integer.valueOf(qr))
            {
                case 1:
                    System.out.println("Hint 1");
                    Toast.makeText(treasure.this, "You found hint 1", Toast.LENGTH_LONG);

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.apple));
                    textView.setText("You found hint 1");
                    break;

                case 2:
                    System.out.println("Hint 2");
                    Toast.makeText(treasure.this, "You found hint 2", Toast.LENGTH_LONG);

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.orange));
                    textView.setText("You found hint 2");
                    break;

                case 3:
                    System.out.println("Hint 3");
                    Toast.makeText(treasure.this, "You found hint 3", Toast.LENGTH_LONG);

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redpin));
                    textView.setText("You found hint 3");
                    break;

               default:
                   System.out.println("Not a hint isbn");
                   break;
            }
        }
    }

