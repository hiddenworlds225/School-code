package Assignment2;

public class TerrainTester {
    public static void main(String[] args) {
        Terrain terrain = new Terrain(500, 500);
        Forest forest = new Forest(600, 600, 520);
        Mountain mountain = new Mountain(800, 800, 20);
        WinterMountain winterMountain = new WinterMountain(800, 800, 14, 15.12);

        System.out.println(terrain.getTerrainSize());
        System.out.println(forest.getForestInfo());
        System.out.println(mountain.getMountainInfo());
        System.out.println(winterMountain.getWinterMountainInfo());
    }
}
