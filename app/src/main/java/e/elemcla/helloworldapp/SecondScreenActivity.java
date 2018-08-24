package e.elemcla.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Button theMapButton = (Button) findViewById(R.id.mapButton);
        Button theDesksButton = (Button) findViewById(R.id.desksButton);
        Button theScanButton = (Button) findViewById(R.id.scanButton);


        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }



        theMapButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mapIntent = new Intent(SecondScreenActivity.this,FullMapActivity.class);
                startActivity(mapIntent);
            }
        });

        theDesksButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent deskIntent = new Intent(SecondScreenActivity.this,DesksPage.class);
                startActivity(deskIntent);
            }
        });


        theScanButton.setOnClickListener(view -> {
            Intent intent = new Intent(SecondScreenActivity.this, ScanActivity.class);
            startActivity(intent);

        });
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            if(item.getItemId()==android.R.id.home)
                finish();
            return super.onOptionsItemSelected(item);
        }
}