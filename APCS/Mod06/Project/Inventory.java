package Project;

public class Inventory {
    

    public static void main(String[] args) {
        Computer[] computers = {
        new Computer("Vanguard", "ATX", 3.00, 16, 2000),
        new Computer("Dawnbreaker", "Micro-ATX", 2.50, 8, 525),
        new Computer("Rougue", "Mini-ATX", 2.80, 8, 265),
        new Computer("Paladin", "ATX", 3.20, 16, 1000),
        new Computer("Goliath", "EATX", 3.60, 32, 2000),
        new Computer("Elite")};


        //Modify Elite computer
        computers[5].modifySize("ATX");
        computers[5].modifyCpuSpeed(3.50);
        computers[5].modifyRamSize(8);
        computers[5].modifyStorageSize(512);
        computers[5].modifyName("Wizard");
        
        //Print results
        System.out.printf("%30s %n", "PC Inventory List");
        System.out.printf("Name  Board Size  CPU speed(GHz)  RAM Size(GB)  Storage Size(GB)%n");
        System.out.println("======================================================");
        for(Computer i : computers){
            System.out.printf("%s%n", i.toString());
        }
    }
}
