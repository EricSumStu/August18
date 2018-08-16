package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class GroundFloorRouteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_floor_route);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

//        int numOfPins = 14;
//        ImageView[] pins = new ImageView[numOfPins - 1];
//
//        for (int index = 0; index <= numOfPins - 1; index ++){
//            pins[index] = (ImageView)findViewById(R.id.Zone_1);
//        }
//
//        for(ImageView pin : pins){
//            if (secondOption.equals(pin.getId())||firstOption.equals(pin.getId())  ){
//                pin.setVisibility(View.VISIBLE);
//            }
//        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
