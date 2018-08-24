package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class FirstFloorRouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_floor_route);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        DeskRow row24 = new DeskRow("FA 01 - FA 42",164,82,0,0);
        DeskRow row25 = new DeskRow("FA 43 - FA 124",84,0,0,204);

        DeskRow row26 = new DeskRow("BO 01 - BO 26",0,60,72,0);
        DeskRow row27 = new DeskRow("BO 27 - BO 49",0,138,60,0);
        DeskRow row28 = new DeskRow("BO 50 - BO 74",0,0,73,123);
        DeskRow row29 = new DeskRow("BO 75 - BO 118",0,0,70,47);

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
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(desk.getleftCoordinate(),desk.gettopCoordinate(),desk.getrightCoordinate(),desk.getbottomCoordinate());
                pins[0].setLayoutParams(params);
            }
            if(desk.getDeskName().equals(sOption)){
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(desk.getleftCoordinate(),desk.gettopCoordinate(),desk.getrightCoordinate(),desk.getbottomCoordinate());
                pins[1].setLayoutParams(params);
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
