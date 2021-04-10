package Assignment2;

public class Forest extends Terrain{

    int treeCount;

    public Forest(int l, int w, int numTrees){
        super(l, w);
        treeCount = numTrees;
    }

    public String getForestInfo(){
        return "Forest " + this.getTerrainSize() + " and has " + treeCount + " trees";
    } 

    public int getNumTrees(){
        return treeCount;
    }

    public String getLandInfo(){
        return "Forest " + this.getTerrainSize();
    }
}
