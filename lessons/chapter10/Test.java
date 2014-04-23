import java.io.File;

public class Test {
  public static void main(String [] args) {
    try {
      SubwayLoader loader = new SubwayLoader();
      Subway subway = loader.loadFile(new File("ObjectvillSubway.txt"));

      System.out.println("Testing stations");
      if (subway.hasStation("Ajax") &&
          subway.hasStation("HTML") &&
          subway.hasStation("LSP")) {
        System.out.println("Passed");
      } else {
        System.out.println("Failed");
      }

      System.out.println("\nTesting connections");
      if (subway.hasConnection("Ajax", "HTML", "Meyer Line")) {
        System.out.println("Passed");
      } else {
        System.out.println("Failed");
      }
    } catch (Exception e) {
      e.printStackTrace(System.out);
    }
  }
}
