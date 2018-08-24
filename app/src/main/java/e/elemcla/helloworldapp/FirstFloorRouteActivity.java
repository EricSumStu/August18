package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import static e.elemcla.helloworldapp.GroundFloorRouteActivity.addToYcoord;

public class FirstFloorRouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_floor_route);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        DeskRow row24 = new DeskRow("FA 01 - FA 42",360,725 - 525);
        DeskRow row25 = new DeskRow("FA 43 - FA 124",360,1500 - 525); // is nott WORKINGGGG

        DeskRow row26 = new DeskRow("BO 01 - BO 26",726,695 - 525);
        DeskRow row27 = new DeskRow("BO 27 - BO 49",726,905 - 525);
        DeskRow row28 = new DeskRow("BO 50 - BO 74",726,1215- 525);
        DeskRow row29 = new DeskRow("BO 75 - BO 118",726,1850 - 525);

        DeskRow[] deskset=new DeskRow[6];

        deskset[0] = row24;
        deskset[1] = row25;
        deskset[2] = row26;
        deskset[3] = row27;
        deskset[4] = row28;
        deskset[5] = row29;

        int numOfPins = 2;
        ImageView[] pins = new ImageView[numOfPins];

        pins[0] = findViewById(R.id.greenPin);
        pins[1] = findViewById(R.id.redPin);

        String fOption = DesksPage.firstOption;
        String sOption = DesksPage.secondOption;


        for(DeskRow desk : deskset ){
            if(desk.getDeskName().equals(fOption)){
                pins[0].setTranslationX(desk.getxCoordinate());
                pins[0].setTranslationY(desk.getyCoordinate());

            }
            if(desk.getDeskName().equals(sOption)){
                pins[1].setTranslationX(desk.getxCoordinate());
                pins[1].setTranslationY(desk.getyCoordinate());
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
