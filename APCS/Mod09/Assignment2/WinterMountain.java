package Assignment2;

public class WinterMountain extends Mountain {
    
    Double mountainTemp;

    public WinterMountain(int l, int w, int numMountains, Double temp){
        super(l, w, numMountains);
        mountainTemp = temp;
    }

    public String getWinterMountainInfo(){
        return "Winter Mountain " + this.getMountainInfo() +" and a temperature of " + mountainTemp + "\u00B0F";
    }

    @Override
    public String getLandInfo(){
        return "Winter Mountain " + this.getTerrainSize();
    }
}
