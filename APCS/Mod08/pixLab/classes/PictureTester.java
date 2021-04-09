package pixLab.classes;

/*
 * Purpose: Shawn Velsor
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("APCS\\Mod08\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("APCS\\Mod08\\pixLab\\images\\arch.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.write("APCS\\Mod08\\pixLab\\images\\mrtl.jpg");
    caterpillar.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture arch = new Picture("APCS\\Mod08\\pixLab\\images\\arch.jpg");
    arch.mirrorHorizontal();
    arch.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture arch = new Picture("APCS\\Mod08\\pixLab\\images\\arch.jpg");
    arch.mirrorHorizontalBotToTop();
    arch.write("APCS\\Mod08\\pixLab\\images\\archbtt.jpg");
    arch.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("APCS\\Mod08\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms()
  {
    Picture temple = new Picture("APCS\\Mod08\\pixLab\\images\\snowman.jpg");
    temple.mirrorArms();
    temple.explore();
  }

  public static void testMirrorGull() {
    Picture gull = new Picture("APCS\\Mod08\\pixLab\\images\\seagull.jpg");
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyRed() {
    Picture caterpillar = new Picture("APCS\\Mod08\\pixLab\\images\\caterpillar.jpg");
    caterpillar.keepOnlyRed();
    caterpillar.explore();
  }

  public static void testNegate() {
    Picture lion = new Picture("APCS\\Mod08\\pixLab\\images\\femaleLionAndHall.jpg");
    lion.negate();
    lion.explore();
  }

  public static void testGrayscale() {
    Picture arch = new Picture("APCS\\Mod08\\pixLab\\images\\arch.jpg");
    arch.grayscale();
    arch.write("APCS\\Mod08\\pixLab\\images\\greyscale.jpg");
    arch.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("APCS\\Mod08\\pixLab\\images\\water.jpg");
    water.fixUnderWater();
    water.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyRed();
    //testNegate();
    //testGrayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












