package e.elemcla.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class GroundFloorRouteActivity extends AppCompatActivity {
    final int addToYcoord = 230;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_floor_route);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }



       DeskRow row1=new DeskRow("BY 01 - BY 41",78,155 + addToYcoord);
       DeskRow row2=new DeskRow("BY 42 - BY 69",80,279 + addToYcoord);
       DeskRow row3=new DeskRow("BY 70 - BY 97",80,398 + addToYcoord);
       DeskRow row4=new DeskRow("BY 98 - BY 119",80,480 + addToYcoord);

       DeskRow row5=new DeskRow("AT 01 - AT 21",195,268 + addToYcoord);
       DeskRow row6=new DeskRow("AT 22 - AT 52",195,398 + addToYcoord);

       DeskRow row7=new DeskRow("MX 01 - MX 18",260,150 + addToYcoord);
       DeskRow row8=new DeskRow("MX 19 - MX 27",240,270  + addToYcoord);
       DeskRow row9=new DeskRow("MX 28 - MX 43",250,267 + addToYcoord);
       DeskRow row10=new DeskRow("MX 44 - MX 73",250,380 + addToYcoord);

       DeskRow row11=new DeskRow("IN 01 - IN 41",455,398 + addToYcoord);
       DeskRow row12=new DeskRow("IN 42 - IN 79",450,474 + addToYcoord);
       DeskRow row13=new DeskRow("IN 80 - IN 139",465,440 + addToYcoord);

       DeskRow row14=new DeskRow("MA 01 - MA 67",289,270 + addToYcoord);
       DeskRow row15=new DeskRow("MA 68 - MA 136",249,280 + addToYcoord);
       DeskRow row16=new DeskRow("MA 137 - MA 186",710,276 + addToYcoord);

       DeskRow row17=new DeskRow("BE 01 - BE 64",842,276 + addToYcoord);
       DeskRow row18=new DeskRow("BE 65 - BE 106",840,440 + addToYcoord);
       DeskRow row19=new DeskRow("BE 107 - BE 147",840,565 + addToYcoord);
       DeskRow row20=new DeskRow("BE 148 - BE 202",840,740 + addToYcoord);

       DeskRow row21=new DeskRow("ED 01 - ED 20",460,710 + addToYcoord);
       DeskRow row22=new DeskRow("ED 21 - ED 44",510,706 + addToYcoord);
       DeskRow row23=new DeskRow("ED 45 - ED 107",510,785 + addToYcoord);


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
//        pins[2] = findViewById(R.id.zoneTwoStart);
//        pins[3] = findViewById(R.id.zoneTwoEnd);
//        pins[4] = findViewById(R.id.zoneThreeStart);
//        pins[5] = findViewById(R.id.zoneThreeEnd);
//        pins[6] = findViewById(R.id.zoneFourStart);
//        pins[7] = findViewById(R.id.zoneFourEnd);
//        pins[8] = findViewById(R.id.zoneFiveStart);
//        pins[9] = findViewById(R.id.zoneFiveEnd);
//        pins[10] = findViewById(R.id.zoneSixStart);
//        pins[11] = findViewById(R.id.zoneSixEnd);
//        pins[12] = findViewById(R.id.zoneSevenStart);
//        pins[13] = findViewById(R.id.zoneSevenEnd);

        String fOption = DesksPage.firstOption;
        String sOption = DesksPage.secondOption;



        for(DeskRow desk : desks ){
            if(desk.getDeskName().equals(fOption)){
                pins[0].setTranslationX(desk.getxCoordinate());
                pins[0].setTranslationY(desk.getyCoordinate());
            }
            if(desk.getDeskName().equals(sOption)){
                pins[1].setTranslationX(desk.getxCoordinate());
                pins[1].setTranslationY(desk.getyCoordinate());
            }
        }




       /* switch (fOption) {
            case "Zone 1":
//                pins[1].setVisibility(View.VISIBLE);

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
        }*/

       /* switch (sOption) {
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
        }*/
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
