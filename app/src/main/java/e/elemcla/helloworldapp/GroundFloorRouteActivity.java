package e.elemcla.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

public class GroundFloorRouteActivity extends AppCompatActivity {
    final static int addToYcoord = 230;
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

        DeskRow row5=new DeskRow("AT 01 - AT 21",185,268 + addToYcoord);
        DeskRow row6=new DeskRow("AT 22 - AT 52",185,398 + addToYcoord);

        DeskRow row7=new DeskRow("MX 01 - MX 18",260,150 + addToYcoord);
        DeskRow row8=new DeskRow("MX 19 - MX 27",240,270  + addToYcoord);
        DeskRow row9=new DeskRow("MX 28 - MX 43",250,267 + addToYcoord);
        DeskRow row10=new DeskRow("MX 44 - MX 73",250,380 + addToYcoord);

        DeskRow row11=new DeskRow("IN 01 - IN 41",455,398 + addToYcoord);
        DeskRow row12=new DeskRow("IN 42 - IN 79",450,474 + addToYcoord);
        DeskRow row13=new DeskRow("IN 80 - IN 139",465,550 + addToYcoord);

        DeskRow row14=new DeskRow("MA 01 - MA 67",360,270 + addToYcoord);
        DeskRow row15=new DeskRow("MA 68 - MA 136",520,280 + addToYcoord);
        DeskRow row16=new DeskRow("MA 137 - MA 186",750,276 + addToYcoord);

        DeskRow row17=new DeskRow("BE 01 - BE 64",865,276 + addToYcoord);
        DeskRow row18=new DeskRow("BE 65 - BE 106",865,440 + addToYcoord);
        DeskRow row19=new DeskRow("BE 107 - BE 147",865,565 + addToYcoord);
        DeskRow row20=new DeskRow("BE 148 - BE 202",865,760 + addToYcoord);

        DeskRow row21=new DeskRow("ED 01 - ED 20",460,720 + addToYcoord);
        DeskRow row22=new DeskRow("ED 21 - ED 44",510,720 + addToYcoord);
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
//Zone 1
        if((fOption.equals("BY 01 - BY 41")|| fOption.equals("BY 42 - BY 69")|| fOption.equals("BY 70 - BY 97") || fOption.equals("BY 98 - BY 119"))
                && sOption.equals("AT 01 - AT 21") || sOption.equals("AT 22 - AT 52") ){
            ImageView pathOne = (ImageView)findViewById(R.id.pathImage);
            pathOne.setImageResource(R.drawable.zone1to2);
        }
        else if ((fOption.equals("BY 01 - BY 41")|| fOption.equals("BY 42 - BY 69")|| fOption.equals("BY 70 - BY 97") || fOption.equals("BY 98 - BY 119"))
                && sOption.equals("MX 01 - MX 18") || sOption.equals("MX 19 - MX 27") || sOption.equals("MX 28 - MX 43")|| sOption.equals("MX 44 - MX 73")){
            ImageView pathTwo = (ImageView)findViewById(R.id.pathImage2);
            pathTwo.setImageResource(R.drawable.zone1to3);
        }
        else if ((fOption.equals("BY 01 - BY 41")|| fOption.equals("BY 42 - BY 69")|| fOption.equals("BY 70 - BY 97") || fOption.equals("BY 98 - BY 119"))
                && sOption.equals("IN 01 - IN 41") || sOption.equals("IN 42 - IN 79") || sOption.equals("IN 80 - IN 139")){
            ImageView pathThree = (ImageView)findViewById(R.id.pathImage3);
            pathThree.setImageResource(R.drawable.zone1to4);
        }
        else if ((fOption.equals("BY 01 - BY 41")|| fOption.equals("BY 42 - BY 69")|| fOption.equals("BY 70 - BY 97") || fOption.equals("BY 98 - BY 119"))
                && sOption.equals("MA 01 - MA 67") || sOption.equals("MA 68 - MA 136") || sOption.equals("MA 137 - MA 186")){
            ImageView pathFour = (ImageView)findViewById(R.id.pathImage4);
            pathFour.setImageResource(R.drawable.zone1to5);
        }
        else if ((fOption.equals("BY 01 - BY 41")|| fOption.equals("BY 42 - BY 69")|| fOption.equals("BY 70 - BY 97") || fOption.equals("BY 98 - BY 119"))
                && sOption.equals("BE 01 - BE 64") || sOption.equals("BE 65 - BE 106") || sOption.equals("BE 107 - BE 147")|| sOption.equals("BE 148 - BE 202")){
            ImageView pathFive = (ImageView)findViewById(R.id.pathImage5);
            pathFive.setImageResource(R.drawable.zone1to6);
        }
        else if ((fOption.equals("BY 01 - BY 41")|| fOption.equals("BY 42 - BY 69")|| fOption.equals("BY 70 - BY 97") || fOption.equals("BY 98 - BY 119"))
                && sOption.equals("ED 01 - ED 20") || sOption.equals("ED 21 - ED 44") || sOption.equals("ED 45 - ED 107")){
            ImageView pathSix = (ImageView)findViewById(R.id.pathImage6);
            pathSix.setImageResource(R.drawable.zone1to7);
        }
        //Zone 2
        else if ((fOption.equals("AT 01 - AT 21")|| fOption.equals("AT 22 - AT 52"))
                && sOption.equals("BY 01 - BY 41") || sOption.equals("BY 42 - BY 69") || sOption.equals("BY 70 - BY 97")|| sOption.equals("BY 98 - BY 119")){
            ImageView pathSeven = (ImageView)findViewById(R.id.pathImage7);
            pathSeven.setImageResource(R.drawable.zone2to1);
        }
        else if ((fOption.equals("AT 01 - AT 21")|| fOption.equals("AT 22 - AT 52"))
                && sOption.equals("MX 01 - MX 18") || sOption.equals("MX 19 - MX 27") || sOption.equals("MX 28 - MX 43")|| sOption.equals("MX 44 - MX 73")){
            ImageView pathEight = (ImageView)findViewById(R.id.pathImage8);
            pathEight.setImageResource(R.drawable.zone2to3);
        }
        else if ((fOption.equals("AT 01 - AT 21")|| fOption.equals("AT 22 - AT 52"))
                && sOption.equals("IN 01 - IN 41") || sOption.equals("IN 42 - IN 79") || sOption.equals("IN 80 - IN 139")){
            ImageView pathNine = (ImageView)findViewById(R.id.pathImage9);
            pathNine.setImageResource(R.drawable.zone2to4);
        }
        else if ((fOption.equals("AT 01 - AT 21")|| fOption.equals("AT 22 - AT 52"))
                && sOption.equals("MA 01 - MA 67") || sOption.equals("MA 68 - MA 136") || sOption.equals("MA 137 - MA 186")){
            ImageView pathTen = (ImageView)findViewById(R.id.pathImage10);
            pathTen.setImageResource(R.drawable.zone2to5);
        }
        else if ((fOption.equals("AT 01 - AT 21")|| fOption.equals("AT 22 - AT 52"))
                && sOption.equals("BE 01 - BE 64") || sOption.equals("BE 65 - BE 106") || sOption.equals("BE 107 - BE 147")|| sOption.equals("BE 148 - BE 202")){
            ImageView pathEleven = (ImageView)findViewById(R.id.pathImage11);
            pathEleven.setImageResource(R.drawable.zone2to6);
        }
        else if ((fOption.equals("AT 01 - AT 21")|| fOption.equals("AT 22 - AT 52"))
                && sOption.equals("ED 01 - ED 20") || sOption.equals("ED 21 - ED 44") || sOption.equals("ED 45 - ED 107")){
            ImageView pathTwelve = (ImageView)findViewById(R.id.pathImage12);
            pathTwelve.setImageResource(R.drawable.zone2to7);
        }
//Zone 3
        else if ((fOption.equals("MX 01 - MX 18")|| fOption.equals("MX 19 - MX 27")|| fOption.equals("MX 28 - MX 43")|| fOption.equals("MX 44 - MX 73"))
                && sOption.equals("BY 01 - BY 41") || sOption.equals("BY 42 - BY 69") || sOption.equals("BY 70 - BY 97")|| sOption.equals("BY 98 - BY 119")){
            ImageView pathThirteen = (ImageView)findViewById(R.id.pathImage13);
            pathThirteen.setImageResource(R.drawable.zone3to1);
        }
        else if ((fOption.equals("MX 01 - MX 18")|| fOption.equals("MX 19 - MX 27")|| fOption.equals("MX 28 - MX 43")|| fOption.equals("MX 44 - MX 73"))
                && sOption.equals("AT 01 - AT 21") || sOption.equals("AT 22 - AT 52")){
            ImageView pathFourteen = (ImageView)findViewById(R.id.pathImage14);
            pathFourteen.setImageResource(R.drawable.zone3to2);
        }
        else if ((fOption.equals("MX 01 - MX 18")|| fOption.equals("MX 19 - MX 27")|| fOption.equals("MX 28 - MX 43")|| fOption.equals("MX 44 - MX 73"))
                && sOption.equals("IN 01 - IN 41") || sOption.equals("IN 42 - IN 79") || sOption.equals("IN 80 - IN 139")){
            ImageView pathFifteen = (ImageView)findViewById(R.id.pathImage15);
            pathFifteen.setImageResource(R.drawable.zone3to4);
        }
        else if ((fOption.equals("MX 01 - MX 18")|| fOption.equals("MX 19 - MX 27")|| fOption.equals("MX 28 - MX 43")|| fOption.equals("MX 44 - MX 73"))
                && sOption.equals("MA 01 - MA 67") || sOption.equals("MA 68 - MA 136") || sOption.equals("MA 137 - MA 186")){
            ImageView pathSixteen = (ImageView)findViewById(R.id.pathImage16);
            pathSixteen.setImageResource(R.drawable.zone3to5);
        }
        else if ((fOption.equals("MX 01 - MX 18")|| fOption.equals("MX 19 - MX 27")|| fOption.equals("MX 28 - MX 43")|| fOption.equals("MX 44 - MX 73"))
                && sOption.equals("BE 01 - BE 64") || sOption.equals("BE 65 - BE 106") || sOption.equals("BE 107 - BE 147")|| sOption.equals("BE 148 - BE 202")){
            ImageView pathSeventeen = (ImageView)findViewById(R.id.pathImage17);
            pathSeventeen.setImageResource(R.drawable.zone3to6);
        }
        else if ((fOption.equals("MX 01 - MX 18")|| fOption.equals("MX 19 - MX 27")|| fOption.equals("MX 28 - MX 43")|| fOption.equals("MX 44 - MX 73"))
                && sOption.equals("ED 01 - ED 20") || sOption.equals("ED 21 - ED 44") || sOption.equals("ED 45 - ED 107")){
            ImageView pathEightteen = (ImageView)findViewById(R.id.pathImage18);
            pathEightteen.setImageResource(R.drawable.zone3to7);
        }
        //Zone 4
        else if ((fOption.equals("IN 01 - IN 41")|| fOption.equals("IN 42 - IN 79")|| fOption.equals("IN 80 - IN 139"))
                && sOption.equals("BY 01 - BY 41") || sOption.equals("BY 42 - BY 69") || sOption.equals("BY 70 - BY 97")|| sOption.equals("BY 98 - BY 119")){
            ImageView pathNineteen = (ImageView)findViewById(R.id.pathImage19);
            pathNineteen.setImageResource(R.drawable.zone4to1);
        }
        else if ((fOption.equals("IN 01 - IN 41")|| fOption.equals("IN 42 - IN 79")|| fOption.equals("IN 80 - IN 139"))
                && sOption.equals("AT 01 - AT 21") || sOption.equals("AT 22 - AT 52")){
            ImageView pathTwenty = (ImageView)findViewById(R.id.pathImage20);
            pathTwenty.setImageResource(R.drawable.zone4to2);
        }
        else if ((fOption.equals("IN 01 - IN 41")|| fOption.equals("IN 42 - IN 79")|| fOption.equals("IN 80 - IN 139"))
                && sOption.equals("MX 01 - MX 18") || sOption.equals("MX 19 - MX 27") || sOption.equals("MX 28 - MX 43")|| sOption.equals("MX 44 - MX 73")){
            ImageView pathTwentyOne = (ImageView)findViewById(R.id.pathImage21);
            pathTwentyOne.setImageResource(R.drawable.zone4to3);
        }
        else if ((fOption.equals("IN 01 - IN 41")|| fOption.equals("IN 42 - IN 79")|| fOption.equals("IN 80 - IN 139"))
                && sOption.equals("MA 01 - MA 67") || sOption.equals("MA 68 - MA 136") || sOption.equals("MA 137 - MA 186")){
            ImageView pathTwentyTwo = (ImageView)findViewById(R.id.pathImage22);
            pathTwentyTwo.setImageResource(R.drawable.zone4to5);
        }
        else if ((fOption.equals("IN 01 - IN 41")|| fOption.equals("IN 42 - IN 79")|| fOption.equals("IN 80 - IN 139"))
                && sOption.equals("BE 01 - BE 64") || sOption.equals("BE 65 - BE 106") || sOption.equals("BE 107 - BE 147")|| sOption.equals("BE 148 - BE 202")){
            ImageView pathTwentyThree = (ImageView)findViewById(R.id.pathImage23);
            pathTwentyThree.setImageResource(R.drawable.zone4to6);
        }
        else if ((fOption.equals("IN 01 - IN 41")|| fOption.equals("IN 42 - IN 79")|| fOption.equals("IN 80 - IN 139"))
                && sOption.equals("ED 01 - ED 20") || sOption.equals("ED 21 - ED 44") || sOption.equals("ED 45 - ED 107")){
            ImageView pathTwentyFour = (ImageView)findViewById(R.id.pathImage24);
            pathTwentyFour.setImageResource(R.drawable.zone4to7);
        }
//Zone 5
        else if ((fOption.equals("MA 01 - MA 67")|| fOption.equals("MA 68 - MA 136")|| fOption.equals("MA 137 - MA 186"))
                && sOption.equals("BY 01 - BY 41") || sOption.equals("BY 42 - BY 69") || sOption.equals("BY 70 - BY 97")|| sOption.equals("BY 98 - BY 119")){
            ImageView pathTwentyFive = (ImageView)findViewById(R.id.pathImage25);
            pathTwentyFive.setImageResource(R.drawable.zone5to1);
        }
        else if ((fOption.equals("MA 01 - MA 67")|| fOption.equals("MA 68 - MA 136")|| fOption.equals("MA 137 - MA 186"))
                && sOption.equals("AT 01 - AT 21") || sOption.equals("AT 22 - AT 52")){
            ImageView pathTwentySix = (ImageView)findViewById(R.id.pathImage26);
            pathTwentySix.setImageResource(R.drawable.zone5to2);
        }
        else if ((fOption.equals("MA 01 - MA 67")|| fOption.equals("MA 68 - MA 136")|| fOption.equals("MA 137 - MA 186"))
                && sOption.equals("MX 01 - MX 18") || sOption.equals("MX 19 - MX 27") || sOption.equals("MX 28 - MX 43")|| sOption.equals("MX 44 - MX 73")){
            ImageView pathTwentySeven = (ImageView)findViewById(R.id.pathImage27);
            pathTwentySeven.setImageResource(R.drawable.zone5to3);
        }
        else if ((fOption.equals("MA 01 - MA 67")|| fOption.equals("MA 68 - MA 136")|| fOption.equals("MA 137 - MA 186"))
                && sOption.equals("IN 01 - IN 41") || sOption.equals("IN 42 - IN 79") || sOption.equals("IN 80 - IN 139")){
            ImageView pathTwentyEight = (ImageView)findViewById(R.id.pathImage28);
            pathTwentyEight.setImageResource(R.drawable.zone5to4);
        }
        else if ((fOption.equals("MA 01 - MA 67")|| fOption.equals("MA 68 - MA 136")|| fOption.equals("MA 137 - MA 186"))
                && sOption.equals("BE 01 - BE 64") || sOption.equals("BE 65 - BE 106") || sOption.equals("BE 107 - BE 147")|| sOption.equals("BE 148 - BE 202")){
            ImageView pathTwentyNine = (ImageView)findViewById(R.id.pathImage29);
            pathTwentyNine.setImageResource(R.drawable.zone5to6);
        }
        else if ((fOption.equals("MA 01 - MA 67")|| fOption.equals("MA 68 - MA 136")|| fOption.equals("MA 137 - MA 186"))
                && sOption.equals("ED 01 - ED 20") || sOption.equals("ED 21 - ED 44") || sOption.equals("ED 45 - ED 107")){
            ImageView pathThirty = (ImageView)findViewById(R.id.pathImage30);
            pathThirty.setImageResource(R.drawable.zone5to7);
        }
//Zone6
        else if ((fOption.equals("BE 01 - BE 64")|| fOption.equals("BE 65 - BE 106")|| fOption.equals("BE 107 - BE 147") || fOption.equals("BE 148 - BE 202"))
                && sOption.equals("BY 01 - BY 41") || sOption.equals("BY 42 - BY 69") || sOption.equals("BY 70 - BY 97")|| sOption.equals("BY 98 - BY 119")){
            ImageView pathThirtyOne = (ImageView)findViewById(R.id.pathImage31);
            pathThirtyOne.setImageResource(R.drawable.zone6to1);
        }
        else if ((fOption.equals("BE 01 - BE 64")|| fOption.equals("BE 65 - BE 106")|| fOption.equals("BE 107 - BE 147") || fOption.equals("BE 148 - BE 202"))
                && sOption.equals("AT 01 - AT 21") || sOption.equals("AT 22 - AT 52")){
            ImageView pathThirtyTwo = (ImageView)findViewById(R.id.pathImage32);
            pathThirtyTwo.setImageResource(R.drawable.zone6to2);
        }
        else if ((fOption.equals("BE 01 - BE 64")|| fOption.equals("BE 65 - BE 106")|| fOption.equals("BE 107 - BE 147") || fOption.equals("BE 148 - BE 202"))
                && sOption.equals("MX 01 - MX 18") || sOption.equals("MX 19 - MX 27") || sOption.equals("MX 28 - MX 43")|| sOption.equals("MX 44 - MX 73")){
            ImageView pathThirtyThree = (ImageView)findViewById(R.id.pathImage33);
            pathThirtyThree.setImageResource(R.drawable.zone6to3);
        }
        else if ((fOption.equals("BE 01 - BE 64")|| fOption.equals("BE 65 - BE 106")|| fOption.equals("BE 107 - BE 147") || fOption.equals("BE 148 - BE 202"))
                && sOption.equals("IN 01 - IN 41") || sOption.equals("IN 42 - IN 79") || sOption.equals("IN 80 - IN 139")){
            ImageView pathThirtyFour = (ImageView)findViewById(R.id.pathImage34);
            pathThirtyFour.setImageResource(R.drawable.zone6to4);
        }
        else if ((fOption.equals("BE 01 - BE 64")|| fOption.equals("BE 65 - BE 106")|| fOption.equals("BE 107 - BE 147") || fOption.equals("BE 148 - BE 202"))
                && sOption.equals("MA 01 - MA 67") || sOption.equals("MA 68 - MA 136") || sOption.equals("MA 137 - MA 186")){
            ImageView pathThirtyFive = (ImageView)findViewById(R.id.pathImage35);
            pathThirtyFive.setImageResource(R.drawable.zone6to5);
        }
        else if ((fOption.equals("BE 01 - BE 64")|| fOption.equals("BE 65 - BE 106")|| fOption.equals("BE 107 - BE 147") || fOption.equals("BE 148 - BE 202"))
                && sOption.equals("ED 01 - ED 20") || sOption.equals("ED 21 - ED 44") || sOption.equals("ED 45 - ED 107")){
            ImageView pathThirtySix = (ImageView)findViewById(R.id.pathImage36);
            pathThirtySix.setImageResource(R.drawable.zone6to7);
        }
        //Zone7
        else if ((fOption.equals("ED 01 - ED 20")|| fOption.equals("ED 21 - ED 44")|| fOption.equals("ED 45 - ED 107"))
                && sOption.equals("BY 01 - BY 41") || sOption.equals("BY 42 - BY 69") || sOption.equals("BY 70 - BY 97")|| sOption.equals("BY 98 - BY 119")){
            ImageView pathThirtySeven = (ImageView)findViewById(R.id.pathImage37);
            pathThirtySeven.setImageResource(R.drawable.zone7to1);
        }
        else if ((fOption.equals("ED 01 - ED 20")|| fOption.equals("ED 21 - ED 44")|| fOption.equals("ED 45 - ED 107"))
                && sOption.equals("AT 01 - AT 21") || sOption.equals("AT 22 - AT 52")){
            ImageView pathThirtyEight = (ImageView)findViewById(R.id.pathImage38);
            pathThirtyEight.setImageResource(R.drawable.zone7to2);
        }
        else if ((fOption.equals("ED 01 - ED 20")|| fOption.equals("ED 21 - ED 44")|| fOption.equals("ED 45 - ED 107"))
                && sOption.equals("MX 01 - MX 18") || sOption.equals("MX 19 - MX 27") || sOption.equals("MX 28 - MX 43")|| sOption.equals("MX 44 - MX 73")){
            ImageView pathThirtyNine = (ImageView)findViewById(R.id.pathImage39);
            pathThirtyNine.setImageResource(R.drawable.zone7to3);
        }
        else if ((fOption.equals("ED 01 - ED 20")|| fOption.equals("ED 21 - ED 44")|| fOption.equals("ED 45 - ED 107"))
                && sOption.equals("IN 01 - IN 41") || sOption.equals("IN 42 - IN 79") || sOption.equals("IN 80 - IN 139")){
            ImageView pathForty = (ImageView)findViewById(R.id.pathImage40);
            pathForty.setImageResource(R.drawable.zone7to4);
        }
        else if ((fOption.equals("ED 01 - ED 20")|| fOption.equals("ED 21 - ED 44")|| fOption.equals("ED 45 - ED 107"))
                && sOption.equals("MA 01 - MA 67") || sOption.equals("MA 68 - MA 136") || sOption.equals("MA 137 - MA 186")){
            ImageView pathFortyOne = (ImageView)findViewById(R.id.pathImage41);
            pathFortyOne.setImageResource(R.drawable.zone7to5);
        }
        else if ((fOption.equals("ED 01 - ED 20")|| fOption.equals("ED 21 - ED 44")|| fOption.equals("ED 45 - ED 107"))
                && sOption.equals("BE 01 - BE 64") || sOption.equals("BE 65 - BE 106") || sOption.equals("BE 107 - BE 147")|| sOption.equals("BE 148 - BE 202")){
            ImageView pathFortyTwo = (ImageView)findViewById(R.id.pathImage42);
            pathFortyTwo.setImageResource(R.drawable.zone7to6);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
