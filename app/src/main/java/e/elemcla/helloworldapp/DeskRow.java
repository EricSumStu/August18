package e.elemcla.helloworldapp;

public class DeskRow {
    String deskName;
    int leftCoordinate;
    int topCoordinate;
    int rightCoordinate;
    int bottomCoordinate;


    public DeskRow(String deskName,    int leftCoordinate,int topCoordinate,int rightCoordinate,int bottomCoordinate
    ){
        this.deskName=deskName;
        this.leftCoordinate=leftCoordinate;
        this.topCoordinate=topCoordinate;
        this.rightCoordinate=rightCoordinate;
        this.bottomCoordinate=bottomCoordinate;
    }

    public String getDeskName() {
        return deskName;
    }
    public int getleftCoordinate() {return leftCoordinate;}
    public int gettopCoordinate() {return topCoordinate;}
    public int getrightCoordinate() {return rightCoordinate;}
    public int getbottomCoordinate() {return bottomCoordinate;}
}
