package e.elemcla.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DesksPage extends AppCompatActivity {
    static String firstOption;
    static String secondOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_desks_page);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //get the 2 spinners [FROM & TO] from the xml.
        Spinner fromDropDown = findViewById(R.id.fromDropDown);
        Spinner toDropDown = findViewById(R.id.toDropDown);

        //create list of zones for the spinners.
        String[] zones = new String[]{"BY 01 - BY 41", "BY 42 - BY 69", "BY 70 - BY 97","BY 98 - BY 119",
                "AT 01 - AT 21","AT 22 - AT 52",
                "MX 01 - MX 18","MX 19 - MX 27","MX 28 - MX 43","MX 44 - MX 73",
                "IN 01 - IN 41", "IN 42 - IN 79", "IN 80 - IN 139",
                "MA 01 - MA 67", "MA 68 - MA 136", "MA 137 - MA 186",
                "BE 01 - BE 64", "BE 65 - BE 106", "BE 107 - BE 147", "BE 148 - BE 202",
                "ED 01 - ED 20", "ED 21 - ED 44", "ED 45 - ED 107"};

        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, zones);

        //set the spinners adapter to the previously created one.
        fromDropDown.setAdapter(adapter);
        toDropDown.setAdapter(adapter);
        Button theGoButton = findViewById(R.id.goButton);

        theGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstOption = (String) fromDropDown.getSelectedItem();
                secondOption = (String) toDropDown.getSelectedItem();

//                if (firstOption.equals("Desk 1A") || firstOption.equals("Zone 2") || firstOption.equals("Zone 3") || firstOption.equals("Zone 4") || firstOption.equals("Zone 5") || firstOption.equals("Zone 6") || firstOption.equals("Zone 7")
//                        && secondOption.equals("Desk 1B") || secondOption.equals("Zone 2") || secondOption.equals("Zone 3") || secondOption.equals("Zone 4") || secondOption.equals("Zone 5") || secondOption.equals("Zone 6") || secondOption.equals("Zone 7")){

                    Intent goToGroundFloorRouteActivity = new Intent(DesksPage.this,GroundFloorRouteActivity.class);
                    startActivity(goToGroundFloorRouteActivity);
//                }

               /* else if (firstOption.equals("Zone 8") || firstOption.equals("Zone 9") && secondOption.equals("Zone 8") || secondOption.equals("Zone 9")){

                    Intent goToFirstFloorRouteActivity = new Intent(DesksPage.this,FirstFloorRouteActivity.class);
                    startActivity(goToFirstFloorRouteActivity);
                }
                else {
                    Intent goToMap = new Intent(DesksPage.this,FullMapActivity.class);
                    startActivity(goToMap);
                }*/



            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
