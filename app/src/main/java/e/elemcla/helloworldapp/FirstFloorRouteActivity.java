package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class FirstFloorRouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_floor_route);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        int numOfPins = 4;
        ImageView[] pins = new ImageView[numOfPins];

        // storing pins in ImageView array

        pins[0] = findViewById(R.id.zoneEightStart);
        pins[1] = findViewById(R.id.zoneEightEnd);
        pins[2] = findViewById(R.id.zoneNineStart);
        pins[3] = findViewById(R.id.zoneNineEnd);

        //getting the spinner options from deskspage activity

        String fOption = DesksPage.firstOption;
        String sOption = DesksPage.secondOption;

        if (fOption.equals("Zone 8")) {
            pins[1].setVisibility(View.VISIBLE);
        } else {
            pins[3].setVisibility(View.VISIBLE);
        }

        if (sOption.equals("Zone 8")){
            pins[0].setVisibility(View.VISIBLE);
        } else {
            pins[2].setVisibility(View.VISIBLE);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
