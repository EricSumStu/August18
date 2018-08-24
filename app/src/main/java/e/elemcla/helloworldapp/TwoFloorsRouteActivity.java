package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;


public class TwoFloorsRouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_floors_route);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        int numOfPins = 2;
        ImageView[] pins = new ImageView[numOfPins];

        pins[0] = findViewById(R.id.greenPin);
        pins[1] = findViewById(R.id.redPin);

        DeskRow[] zones = new DeskRow[9];

        zones[0] = new DeskRow("Zone 1", 16, 190);
        zones[1] = new DeskRow("Zone 2", 48, 216);
        zones[2] = new DeskRow("Zone 3", 68, 188);
        zones[3] = new DeskRow("Zone 4", 144, 224);
        zones[4] = new DeskRow("Zone 5", 160, 120);
        zones[5] = new DeskRow("Zone 6", 650, 650);

        zones[6] = new DeskRow("Zone 7", 124,230);
        zones[7] = new DeskRow("Zone 8", 76, 187);
        zones[8] = new DeskRow("Zone 9", 16, 187);


        int fromOption = DesksPage.firstOptionIndex;
        int toOption = DesksPage.secondOptionIndex;

        if (fromOption >= 1 && fromOption <= 4) {
            pins[0].setTranslationX(zones[0].getxCoordinate());
            pins[0].setTranslationY(zones[0].getyCoordinate());
        } else if (fromOption == 6 || fromOption == 7) {
            pins[0].setTranslationX(zones[1].getxCoordinate());
            pins[0].setTranslationY(zones[1].getyCoordinate());
        } else if (fromOption >= 9 && fromOption <= 12) {
            pins[0].setTranslationX(zones[2].getxCoordinate());
            pins[0].setTranslationY(zones[2].getyCoordinate());
        } else if (fromOption >= 14 && fromOption <= 16) {
            pins[0].setTranslationX(zones[3].getxCoordinate());
            pins[0].setTranslationY(zones[3].getyCoordinate());
        } else if (fromOption >= 18 && fromOption <= 20) {
            pins[0].setTranslationX(zones[4].getxCoordinate());
            pins[0].setTranslationY(zones[4].getyCoordinate());
        } else if (fromOption >= 22 && fromOption <= 25) {
            pins[0].setTranslationX(zones[5].getxCoordinate());
            pins[0].setTranslationY(zones[5].getyCoordinate());
        } else if (fromOption >= 27 && fromOption <= 29) {
            pins[0].setTranslationX(zones[6].getxCoordinate());
            pins[0].setTranslationY(zones[6].getyCoordinate());
        } else if (fromOption == 31 || fromOption == 32) {
            pins[0].setTranslationX(zones[7].getxCoordinate());
            pins[0].setTranslationY(zones[7].getyCoordinate());
        } else {
            pins[0].setTranslationX(zones[8].getxCoordinate());
            pins[0].setTranslationY(zones[8].getyCoordinate());
        }


        if(toOption >= 1 && toOption <= 4 ){
            pins[1].setTranslationX(zones[0].getxCoordinate());
            pins[1].setTranslationY(zones[0].getyCoordinate());
        }
        else if(toOption == 6 || toOption == 7 ){
            pins[1].setTranslationX(zones[1].getxCoordinate());
            pins[1].setTranslationY(zones[1].getyCoordinate());
        }
        else if(toOption >= 9 && toOption <= 12 ){
            pins[1].setTranslationX(zones[2].getxCoordinate());
            pins[1].setTranslationY(zones[2].getyCoordinate());
        }
        else if(toOption >= 14 && toOption <= 16 ){
            pins[1].setTranslationX(zones[3].getxCoordinate());
            pins[1].setTranslationY(zones[3].getyCoordinate());
        }
        else if(toOption >= 18 && toOption <= 20 ){
            pins[1].setTranslationX(zones[4].getxCoordinate());
            pins[1].setTranslationY(zones[4].getyCoordinate());
        }
        else if(toOption >= 22 && toOption <= 25){
            pins[1].setTranslationX(zones[5].getxCoordinate());
            pins[1].setTranslationY(zones[5].getyCoordinate());
        }
        else if(toOption >= 27 && toOption <= 29){
            pins[1].setTranslationX(zones[6].getxCoordinate());
            pins[1].setTranslationY(zones[6].getyCoordinate());
        }
        else if(toOption == 31 || toOption == 32){
            pins[1].setTranslationX(zones[7].getxCoordinate());
            pins[1].setTranslationY(zones[7].getyCoordinate());
        }
        else {
            pins[1].setTranslationX(zones[8].getxCoordinate());
            pins[1].setTranslationY(zones[8].getyCoordinate());
        }







    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
