package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;


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

        zones[0] = new DeskRow("Zone 1", 16, 190,0,0);
        zones[1] = new DeskRow("Zone 2", 48, 216,0,0);
        zones[2] = new DeskRow("Zone 3", 68, 188,0,0);
        zones[3] = new DeskRow("Zone 4", 144, 224,0,0);
        zones[4] = new DeskRow("Zone 5", 160, 120,0,0);
        zones[5] = new DeskRow("Zone 6", 0, 0,125,227);

        zones[6] = new DeskRow("Zone 7", 0,230,124,0);
        zones[7] = new DeskRow("Zone 8", 0, 185,77,0);
        zones[8] = new DeskRow("Zone 9", 0, 185,16,0);


        int fromOption = DesksPage.firstOptionIndex;
        int toOption = DesksPage.secondOptionIndex;

        if (fromOption >= 1 && fromOption <= 4) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[0].getleftCoordinate(),zones[0].gettopCoordinate(),zones[0].getrightCoordinate(),zones[0].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption == 6 || fromOption == 7) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[1].getleftCoordinate(),zones[1].gettopCoordinate(),zones[1].getrightCoordinate(),zones[1].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption >= 9 && fromOption <= 12) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[2].getleftCoordinate(),zones[2].gettopCoordinate(),zones[2].getrightCoordinate(),zones[2].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption >= 14 && fromOption <= 16) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[3].getleftCoordinate(),zones[3].gettopCoordinate(),zones[3].getrightCoordinate(),zones[3].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption >= 18 && fromOption <= 20) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[4].getleftCoordinate(),zones[4].gettopCoordinate(),zones[4].getrightCoordinate(),zones[4].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption >= 22 && fromOption <= 25) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[5].getleftCoordinate(),zones[5].gettopCoordinate(),zones[5].getrightCoordinate(),zones[5].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption >= 27 && fromOption <= 29) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[6].getleftCoordinate(),zones[6].gettopCoordinate(),zones[6].getrightCoordinate(),zones[6].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else if (fromOption == 31 || fromOption == 32) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[7].getleftCoordinate(),zones[7].gettopCoordinate(),zones[7].getrightCoordinate(),zones[7].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        } else {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[8].getleftCoordinate(),zones[8].gettopCoordinate(),zones[8].getrightCoordinate(),zones[8].getbottomCoordinate());
            pins[0].setLayoutParams(params);
        }


        if(toOption >= 1 && toOption <= 4 ){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[0].getleftCoordinate(),zones[0].gettopCoordinate(),zones[0].getrightCoordinate(),zones[0].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption == 6 || toOption == 7 ){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[1].getleftCoordinate(),zones[1].gettopCoordinate(),zones[1].getrightCoordinate(),zones[1].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption >= 9 && toOption <= 12 ){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[2].getleftCoordinate(),zones[2].gettopCoordinate(),zones[2].getrightCoordinate(),zones[2].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption >= 14 && toOption <= 16 ){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[3].getleftCoordinate(),zones[3].gettopCoordinate(),zones[3].getrightCoordinate(),zones[3].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption >= 18 && toOption <= 20 ){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[4].getleftCoordinate(),zones[4].gettopCoordinate(),zones[4].getrightCoordinate(),zones[4].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption >= 22 && toOption <= 25){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[5].getleftCoordinate(),zones[5].gettopCoordinate(),zones[5].getrightCoordinate(),zones[5].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption >= 27 && toOption <= 29){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[6].getleftCoordinate(),zones[6].gettopCoordinate(),zones[6].getrightCoordinate(),zones[6].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else if(toOption == 31 || toOption == 32){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[7].getleftCoordinate(),zones[7].gettopCoordinate(),zones[7].getrightCoordinate(),zones[7].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }
        else {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(zones[8].getleftCoordinate(),zones[8].gettopCoordinate(),zones[8].getrightCoordinate(),zones[8].getbottomCoordinate());

            pins[1].setLayoutParams(params);

        }







    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
