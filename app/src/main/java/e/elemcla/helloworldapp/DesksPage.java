package e.elemcla.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DesksPage extends AppCompatActivity {
    public static String firstOption;
    public static String secondOption;
    public static int firstOptionIndex;
    public static int secondOptionIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_desks_page);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //get the 2 spinners [FROM & TO] from the xml.
        Spinner fromDrop = findViewById(R.id.fromDropDown);
        Spinner toDrop = findViewById(R.id.toDropDown);

        //create list of zones for the spinners.
        String[] zones = new String[]{"Zone 1","BY 01 - BY 41", "BY 42 - BY 69", "BY 70 - BY 97","BY 98 - BY 119", //i 0 - 4
                "Zone 2","AT 01 - AT 21","AT 22 - AT 52", //i 5 - 7
                "Zone 3","MX 01 - MX 18","MX 19 - MX 27","MX 28 - MX 43","MX 44 - MX 73", //i 8 - 12
                "Zone 4","IN 01 - IN 41","IN 42 - IN 79", "IN 80 - IN 139", //i 13 - 16
                "Zone 5","MA 01 - MA 67","MA 68 - MA 136", "MA 137 - MA 186", //i 17 - 20
                "Zone 6","BE 01 - BE 64","BE 65 - BE 106", "BE 107 - BE 147", "BE 148 - BE 202", //i 21 - 25
                "Zone 7","ED 01 - ED 20","ED 21 - ED 44", "ED 45 - ED 107", //i 26 - 29
                "Zone 8","FA 01 - FA 42","FA 43 - FA 124", //i 30 - 33
                "Zone 9","BO 01 - BO 26","BO 27 - BO 49","BO 50 - BO 74","BO 75 - BO 118"}; //i 34 - 38

        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, zones);

        //set the spinners adapter to the previously created one.
        fromDrop.setAdapter(adapter);
        toDrop.setAdapter(adapter);
        Button theGoButton = findViewById(R.id.goButton);


        theGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstOption = (String) fromDrop.getSelectedItem();
                secondOption = (String) toDrop.getSelectedItem();

                firstOptionIndex = fromDrop.getSelectedItemPosition();
                secondOptionIndex = toDrop.getSelectedItemPosition();

                if (firstOptionIndex == 0 || firstOptionIndex == 5 || firstOptionIndex == 8 || firstOptionIndex == 13 || firstOptionIndex == 17 || firstOptionIndex == 21 || firstOptionIndex == 26 || firstOptionIndex == 30 || firstOptionIndex == 33 ||
                        secondOptionIndex == 0 || secondOptionIndex == 5 || secondOptionIndex == 8 || secondOptionIndex == 13 || secondOptionIndex == 17 || secondOptionIndex == 21 || secondOptionIndex == 26 || secondOptionIndex == 30 || secondOptionIndex == 33){
                    Toast.makeText(DesksPage.this,"Invalid Choice: Please Choose Correct Set of Desks",Toast.LENGTH_LONG).show();
                }

                else{

                    if ((firstOptionIndex >=1 && firstOptionIndex<=29)  && (secondOptionIndex >=1 && secondOptionIndex<=29)){
                        Intent goToGroundFloorRouteActivity = new Intent(DesksPage.this,GroundFloorRouteActivity.class);
                        startActivity(goToGroundFloorRouteActivity);
                    }

                    else if ((firstOptionIndex >= 31 && firstOptionIndex <= 37) && (secondOptionIndex >= 31 && secondOptionIndex <= 37)){
                        Intent goToFirstFloorRouteActivity = new Intent(DesksPage.this,FirstFloorRouteActivity.class);
                        startActivity(goToFirstFloorRouteActivity);
                    }

                    else {
                        Intent goToFullMap = new Intent(DesksPage.this,TwoFloorsRouteActivity.class);
                        startActivity(goToFullMap);
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
