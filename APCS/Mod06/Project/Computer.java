package Project;
/*
 * @purpose: Computer object class
 *
 * @author Shawn Velsor
 * @version 2/3/2021
 *
 */
 
 
public class Computer
{
   private String name; //name of build 
   private String size; //Size of motherboard. (Mini-ATX, Micro-ATX, ATX, EATX)
   private double cpuSpeed; //Speed of processor
   private int ramSize; //Amount of RAM inside the computer
   private int storageSize; //Size of storage, formatted as GB
   //RAM and Storage size never has decimal values, since we're looking at max storage volume
   
   //one parameter constructor, all private instance variables initialized
   //iName is short for Initial Name, allows us to see what name to intialize it on.
   public Computer(String iName) {
      name = iName;

   }

   //full parameter constructor
   public Computer(String iName, String mSize, double cSpeed, int rSize, int storSize){
      name = iName;
      size = mSize;
      cpuSpeed = cSpeed;
      ramSize = rSize;
      storageSize = storSize;

   }

   //Modified Name, not initializing it.
   public void modifyName(String mName){
      name = mName;
   }

   //modifying size
   public void modifySize(String mSize){
      size = mSize;
   }

   //modifying cpu speed
   public void modifyCpuSpeed(double mSpeed){
      cpuSpeed = mSpeed;
   }

   public void modifyRamSize(int mSize){
      ramSize = mSize;
   }

   public void modifyStorageSize(int mSize){
      storageSize = mSize;
   }

  //Tried making a sorting method. Didn't work out as intended. Will try again sometime in the future.

   public String toString() {
   
      return String.format("%-15s%-9s %-5s%1.2f %-5s %2d %-5s %d", name, size, "", cpuSpeed, "", ramSize, "", storageSize);  
   }
    
}