package Assignment2;

public class Mountain extends Terrain {

    int numMountains;

    public Mountain(int length, int width, int mountainCount){
        super(length, width);
        numMountains = mountainCount;
        
    }

    public String getMountainInfo(){
        return "Mountain " + this.getTerrainSize() + " and has " + numMountains + " mountains";
    } 

    public int getNumMountains(){
        return numMountains;
    }

    public String getLandInfo(){
        return "Mountain " + this.getTerrainSize();
    }

}
