package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GroundFloorRouteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_floor_route);


        int numOfPins = 14;
        ImageView[] pins = new ImageView[numOfPins];

        pins[0] = findViewById(R.id.zoneOneStart);
        pins[1] = findViewById(R.id.zoneOneEnd);
        pins[2] = findViewById(R.id.zoneTwoStart);
        pins[3] = findViewById(R.id.zoneTwoEnd);
        pins[4] = findViewById(R.id.zoneThreeStart);
        pins[5] = findViewById(R.id.zoneThreeEnd);
        pins[6] = findViewById(R.id.zoneFourStart);
        pins[7] = findViewById(R.id.zoneFourEnd);
        pins[8] = findViewById(R.id.zoneFiveStart);
        pins[9] = findViewById(R.id.zoneFiveEnd);
        pins[10] = findViewById(R.id.zoneSixStart);
        pins[11] = findViewById(R.id.zoneSixEnd);
        pins[12] = findViewById(R.id.zoneSevenStart);
        pins[13] = findViewById(R.id.zoneSevenEnd);

        String fOption = DesksPage.firstOption;
        String sOption = DesksPage.secondOption;

        switch (fOption) {
            case "Zone 1":
                pins[1].setVisibility(View.VISIBLE);
                break;
            case "Zone 2":
                pins[3].setVisibility(View.VISIBLE);
                break;
            case "Zone 3":
                pins[5].setVisibility(View.VISIBLE);
                break;
            case "Zone 4":
                pins[7].setVisibility(View.VISIBLE);
                break;
            case "Zone 5":
                pins[9].setVisibility(View.VISIBLE);
                break;
            case "Zone 6":
                pins[11].setVisibility(View.VISIBLE);
                break;
            default:
                pins[13].setVisibility(View.VISIBLE);
                break;
        }

        switch (sOption) {
            case "Zone 1":
                pins[0].setVisibility(View.VISIBLE);
                break;
            case "Zone 2":
                pins[2].setVisibility(View.VISIBLE);
                break;
            case "Zone 3":
                pins[4].setVisibility(View.VISIBLE);
                break;
            case "Zone 4":
                pins[6].setVisibility(View.VISIBLE);
                break;
            case "Zone 5":
                pins[8].setVisibility(View.VISIBLE);
                break;
            case "Zone 6":
                pins[10].setVisibility(View.VISIBLE);
                break;
            default:
                pins[12].setVisibility(View.VISIBLE);
                break;
        }
    }

}
