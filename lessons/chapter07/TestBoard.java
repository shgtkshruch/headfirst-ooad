import java.util.List;
public class TestBoard {
  public static void main(String [] args) {
    Board board = new Board(3, 3);
    board.addUnit(new Unit("King"), 1, 1);
    board.addUnit(new Unit("Knite"), 1, 1);

    List units = board.getUnits(1, 1);
    for (int i = 0; i < units.size(); i++) {
      System.out.println(((Unit)units.get(i)).getName());
    }
  }
}
