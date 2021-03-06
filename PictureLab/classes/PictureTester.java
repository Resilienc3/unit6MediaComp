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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
   
  /** Method to test zeroBlue */
  public static void testZeroRed()
  {
    Picture helix = new Picture("helix.jpg");
    helix.explore();
    helix.zeroRed();
    helix.explore();
  }
  
    /** Method to test zeroBlue */
  public static void testZeroGreen()
  {
    Picture helix= new Picture("helix.jpg");
    helix.explore();
    helix.zeroGreen();
    helix.explore();
  }
    /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture helix= new Picture("helix.jpg");
    helix.explore();
    helix.keepOnlyBlue();
    helix.explore();
  }
  
      /** Method to test keepOnlyBlue */
  public static void testKeepOnlyRed()
  {
    Picture helix= new Picture("helix.jpg");
    helix.explore();
    helix.keepOnlyRed();
    helix.explore();
  }
  
      /** Method to test keepOnlyBlue */
  public static void testKeepOnlyGreen()
  {
    Picture helix= new Picture("helix.jpg");
    helix.explore();
    helix.keepOnlyGreen();
    helix.explore();
  }
  
      /** Method to test grayscale */
  public static void testNegate()
  {
    Picture logo= new Picture("resilienc3.jpg");
    logo.explore();
    logo.negate();
    logo.explore();
  }
  
       /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture helix= new Picture("resilienc3.jpg");
    helix.explore();
    helix.grayscale();
    helix.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
   /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar= new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
   /** Method to test mirrorHorizontal*/
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("resilienc3.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
     /** Method to test mirrorHorizontalBotToTop*/
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms*/
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
    
  /** Method to test mirrorArms*/
  public static void testMirrorGull()
  {
   Picture seagull = new Picture("seagull.jpg");
   seagull.explore();
   seagull.mirrorGull();
   seagull.explore();
  }
  
  /** Method to test mirrorArms*/
  public static void testFixUnderwater()
  {
   Picture water = new Picture("water.jpg");
   water.explore();
   water.fixUnderwater();
   water.explore();
  }
  
  /** Method to test scaleByHalf */
  public static void testScaleByHalf()
  {
    Picture helix = new Picture("helix.jpg");
    helix.explore();
    Picture scaledHelix = helix.scaleByHalf();
    scaledHelix.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("helix.jpg");
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
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}