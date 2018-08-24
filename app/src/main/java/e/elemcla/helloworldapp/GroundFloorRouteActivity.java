package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class GroundFloorRouteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_floor_route);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

       DeskRow row1=new DeskRow("BY 01 - BY 41",18,38 );
       DeskRow row2=new DeskRow("BY 42 - BY 69",80,279 );
       DeskRow row3=new DeskRow("BY 70 - BY 97",80,398 );
       DeskRow row4=new DeskRow("BY 98 - BY 119",80,480 );
       DeskRow row5=new DeskRow("AT 01 - AT 21",185,268 );
       DeskRow row6=new DeskRow("AT 22 - AT 52",185,398 );
       DeskRow row7=new DeskRow("MX 01 - MX 18",260,150 );
       DeskRow row8=new DeskRow("MX 19 - MX 27",240,270  );
       DeskRow row9=new DeskRow("MX 28 - MX 43",250,267 );
       DeskRow row10=new DeskRow("MX 44 - MX 73",250,380 );
       DeskRow row11=new DeskRow("IN 01 - IN 41",455,398 );
       DeskRow row12=new DeskRow("IN 42 - IN 79",450,474 );
       DeskRow row13=new DeskRow("IN 80 - IN 139",465,550 );
       DeskRow row14=new DeskRow("MA 01 - MA 67",360,270 );
       DeskRow row15=new DeskRow("MA 68 - MA 136",520,280 );
       DeskRow row16=new DeskRow("MA 137 - MA 186",750,276 );
       DeskRow row17=new DeskRow("BE 01 - BE 64",865,276 );
       DeskRow row18=new DeskRow("BE 65 - BE 106",865,440 );
       DeskRow row19=new DeskRow("BE 107 - BE 147",865,565 );
       DeskRow row20=new DeskRow("BE 148 - BE 202",865,760 );
       DeskRow row21=new DeskRow("ED 01 - ED 20",460,720 );
       DeskRow row22=new DeskRow("ED 21 - ED 44",510,720 );
       DeskRow row23=new DeskRow("ED 45 - ED 107",510,785 );


       DeskRow[] desks=new DeskRow[23];

       desks[0]=row1;
       desks[1]=row2;
       desks[2]=row3;
       desks[3]=row4;
       desks[4]=row5;
       desks[5]=row6;
       desks[6]=row7;
       desks[7]=row8;
       desks[8]=row9;
       desks[9]=row10;
       desks[10]=row11;
       desks[11]=row12;
       desks[12]=row13;
       desks[13]=row14;
       desks[14]=row15;
       desks[15]=row16;
       desks[16]=row17;
       desks[17]=row18;
       desks[18]=row19;
       desks[19]=row20;
       desks[20]=row21;
       desks[21]=row22;
       desks[22]=row23;

        int numOfPins = 2;
        ImageView[] pins = new ImageView[numOfPins];

        pins[0] = findViewById(R.id.greenPin);
        pins[1] = findViewById(R.id.redPin);

        String fOption = DesksPage.firstOption;
        String sOption = DesksPage.secondOption;


        for(DeskRow desk : desks ){
            if(desk.getDeskName().equals(fOption)){
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                  RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(desk.getxCoordinate(),desk.yCoordinate,0,0);
                pins[0].setLayoutParams(params);


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
