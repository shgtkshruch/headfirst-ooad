public class UnitTest {

  public void testType(Unit unit, String type,
      String expectedOutputType) {

    System.out.println("\nTesting setting/getting the type property.");

    unit.setType(type);
    String outputType = unit.getType();
    if (expectedOutputType.equals(outputType)) {
      System.out.println("Test passed");
    } else {
      System.out.println("Test failed: " + outputType + " didn't match " + expectedOutputType);
    }
  }

  public void testPropety(Unit unit, String property, Object inputValue, 
      Object expectedOutputValue) {
    
      System.out.println("\nTesting setting/getting a unit-specific property.");

    unit.setProperty(property, inputValue);
    Object outputValue = unit.getProperty(property);
    if (outputValue.equals(expectedOutputValue)) {
      System.out.println("Test passed");
    } else {
      System.out.println("Test failed: " + outputValue + " didn't match " + expectedOutputValue);
    }
  }

  public void testChangeProperty(Unit unit, String property, 
      Object changeValue, Object expectedOutputValue) {
    
      System.out.println("\nTesting change unit-specific property value.");
    unit.setProperty(property, new Integer(25));
    unit.setProperty(property, changeValue);
    Object outputValue = unit.getProperty(property);
    if (expectedOutputValue.equals(outputValue)) {
      System.out.println("Test passed");
    } else {
      System.out.println("Test failed: " + outputValue + " didn't match " + expectedOutputValue);
    }
  }

  public void testNonExsistentProperty(Unit unit, String property) {

    System.out.println("\nTesting getting a non-existent property's value.");

    Object outputValue = unit.getProperty(property);
    if (outputValue == null) {
      System.out.println("Test passed");
    } else {
      System.out.println("Test failed with value of " + outputValue);
    }
  }

  public static void main(String [] args) {
    UnitTest tester = new UnitTest();
    Unit unit = new Unit(100);
    tester.testType(unit, "king", "king");
    tester.testPropety(unit, "hitPoints", new Integer(25), 
        new Integer(25));
    tester.testChangeProperty(unit, "hitPoints", new Integer(15), 
        new Integer(15));
    tester.testNonExsistentProperty(unit, "strength");
  }
}
