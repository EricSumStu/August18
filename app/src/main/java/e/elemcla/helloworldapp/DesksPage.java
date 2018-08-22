package e.elemcla.helloworldapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
        String[] zones = new String[]{"Zone 1","BY 01 - BY 41", "BY 42 - BY 69", "BY 70 - BY 97","BY 98 - BY 119", //i 0 - 4
                "Zone 2","AT 01 - AT 21","AT 22 - AT 52", //i 5 - 7
                "Zone 3","MX 01 - MX 18","MX 19 - MX 27","MX 28 - MX 43","MX 44 - MX 73", //i 8 - 12
                "Zone 4","IN 01 - IN 41","IN 42 - IN 79", "IN 80 - IN 139", //i 13 - 16
                "Zone 5","MA 01 - MA 67","MA 68 - MA 136", "MA 137 - MA 186", //i 17 - 20
                "Zone 6","BE 01 - BE 64","BE 65 - BE 106", "BE 107 - BE 147", "BE 148 - BE 202", //i 21 - 25
                "Zone 7","ED 01 - ED 20","ED 21 - ED 44", "ED 45 - ED 107", //i 26 - 29
                "Zone 8","FA 01 - FA 42","FA 43 - 124", //i 30 - 33
                "Zone 9","BO 01 - BO 26","BO 27 - BO 49","BO 50 - BO 74","BO 75 - BO 118"}; //i 34 - 38

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


                int fiOption = fromDropDown.getSelectedItemPosition();
                int seOption = toDropDown.getSelectedItemPosition();

                if (fiOption == 0 || fiOption == 5 || fiOption == 8 || fiOption == 13 || fiOption == 17 || fiOption == 21 || fiOption == 26 ||
                        seOption == 0 || seOption == 5 || seOption == 8 || seOption == 13 || seOption == 17 || seOption == 21 || seOption == 26 ){
                    Toast.makeText(DesksPage.this,"Invalid Choice: Please Choose Correct Set of Desks",Toast.LENGTH_LONG).show();
                }
                else{
                    if (fiOption == 1 || fiOption == 2 || fiOption == 3 || fiOption == 4 || fiOption == 6 || fiOption == 7 ||
                            fiOption == 8 ||  fiOption == 9 || fiOption == 10 || fiOption == 11 || fiOption == 12 ||
                            fiOption == 14 || fiOption == 15 || fiOption == 16 || fiOption == 18 || fiOption == 19 ||
                            fiOption == 20 ||  fiOption == 22 || fiOption == 23 || fiOption == 24 || fiOption == 25 ||
                            fiOption == 27 || fiOption == 28 || fiOption == 29

                            &&

                            seOption == 1 || seOption == 2 || seOption == 3 || seOption == 4 || seOption == 6 || seOption == 7 ||
                            seOption == 8 ||  seOption == 9 || seOption == 10 || seOption == 11 || seOption == 12 ||
                            seOption == 14 || seOption == 15 || seOption == 16 || seOption == 18 || seOption == 19 ||
                            seOption == 20 ||  seOption == 22 || seOption == 23 || seOption == 24 || seOption == 25 ||
                            seOption == 27 || seOption == 28 || seOption == 29 ) {

                        Intent goToGroundFloorRouteActivity = new Intent(DesksPage.this,GroundFloorRouteActivity.class);
                        startActivity(goToGroundFloorRouteActivity);
                    }

                    else if (fiOption == 23 || fiOption == 24 || fiOption == 25 || fiOption == 26 || fiOption == 27 || fiOption == 28
                            && seOption == 23 || seOption == 24 || seOption == 25 || seOption == 26 || seOption == 27 || seOption == 28){

                        Intent goToGroundFloorRouteActivity = new Intent(DesksPage.this,FirstFloorRouteActivity.class);
                        startActivity(goToGroundFloorRouteActivity);
                    }

                    else {
                        Intent goToMap = new Intent(DesksPage.this,FullMapActivity.class);
                        startActivity(goToMap);
                    }
                }
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
