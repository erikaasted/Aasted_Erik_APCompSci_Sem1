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

  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalTopToBottom()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalTopToBottom();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBottomToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottomToTop();
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

  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }

  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }

  public static void testCopy()
  {
    Picture butterfly = new Picture("butterfly1.jpg");
    butterfly.copy(butterfly, 100, 100);
    butterfly.explore();
  }

  public static void testCopy2()
  {
    Picture cumberland = new Picture("CumberlandIsland.jpg");
    cumberland.copy2(cumberland, 30, 60, 30, 60);
    cumberland.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture collage = new Picture("640x480.jpg");
    collage.createCollage();
    collage.explore();
  }

  public static void testMyCollage()
  {
    Picture mycollage = new Picture("640x480.jpg");
    mycollage.myCollage();
    mycollage.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2();
    swan.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontalTopToBottom();
    // testMirrorHorizontalBottomToTop();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    // testCopy();
    // testCopy2();
    // testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}