package e.elemcla.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DesksPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desks_page);

        //get the 2 spinners [FROM & TO] from the xml.
        Spinner fromDropDown = findViewById(R.id.fromDropDown);
        Spinner toDropDown = findViewById(R.id.toDropDown);

        //create list of zones for the spinners.
        String[] zones = new String[]{"Zone 1", "Zone 2", "Zone 3","Zone 4","Zone 5","Zone 6","Zone 7" };

        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, zones);

        //set the spinners adapter to the previously created one.
        fromDropDown.setAdapter(adapter);
        toDropDown.setAdapter(adapter);

        Button GoMainPagebutton = (Button) findViewById(R.id.GoMainPagebutton);
        GoMainPagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMainPage = new Intent(DesksPage.this,SecondScreenActivity.class);
                startActivity(goMainPage);

            }
        });
    }
}
