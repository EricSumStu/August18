package e.elemcla.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Button theMapButton = (Button) findViewById(R.id.mapButton);
        Button theDesksButton = (Button) findViewById(R.id.desksButton);

        theMapButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent mapIntent = new Intent(SecondScreenActivity.this,FullMapActivity.class);
                startActivity(mapIntent);
            }
        });

        theDesksButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent deskIntent = new Intent(SecondScreenActivity.this,DesksPage.class);
                startActivity(deskIntent);
            }
        });
    }
}