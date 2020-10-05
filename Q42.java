class Tile{
    int edgeLength;
    Tile(){}
    Tile(int edgeLength){
       this.edgeLength=edgeLength;
    }
   int getLength(){
        return edgeLength; 
    }
}

class Floor extends Tile{
    private int length;
    private int width;

    Floor(){

    }
    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }

    void totalTiles(Tile t){
       int areaTile=t.edgeLength*t.edgeLength;
       int NumOfTile=(areaTile/(length*width));
       System.out.println(NumOfTile);
    }
}

class Q42{
    public static void main(String args[]) {
        Floor f=new Floor(45,45);
        Tile t=new Tile(180);
        //f.Floor(2,4);
       f.totalTiles(t);
    }
}