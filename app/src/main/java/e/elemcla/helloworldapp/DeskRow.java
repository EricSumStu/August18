package e.elemcla.helloworldapp;

public class DeskRow {
    String deskName;
    int xCoordinate;
    int yCoordinate;


    public DeskRow(String deskName,int xCoordinate, int yCoordinate){
        this.deskName=deskName;
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }

    public String getDeskName() {
        return deskName;
    }
    public int getxCoordinate() {
        return xCoordinate;
    }
    public int getyCoordinate() {
        return yCoordinate;
    }
}
