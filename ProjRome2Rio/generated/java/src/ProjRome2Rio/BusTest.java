package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BusTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private BusStation bs1 = new BusStation("Aliados", l1);
  private BusStation bs2 = new BusStation("IPO", l1);
  private BusStation bs3 = new BusStation("Santa Catarina", l1);
  private BusStation bs4 = new BusStation("Trindade", l1);
  private Bus b1 = new Bus(105L, bs1, bs2);
  private Bus b2 = new Bus(205L, bs3, bs4);

  private void testgetDestinyStation() {

    assertEqual(b1.getDestinyStation(), bs1);
    assertEqual(b2.getDestinyStation(), bs3);
  }

  private void testgetOriginStation() {

    assertEqual(b1.getOriginStation(), bs2);
    assertEqual(b2.getOriginStation(), bs4);
  }

  public static void main() {

    BusTest test = new BusTest();
    test.testgetDestinyStation();
    test.testgetOriginStation();
  }

  public BusTest() {}

  public String toString() {

    return "BusTest{"
        + "l1 := "
        + Utils.toString(l1)
        + ", l2 := "
        + Utils.toString(l2)
        + ", bs1 := "
        + Utils.toString(bs1)
        + ", bs2 := "
        + Utils.toString(bs2)
        + ", bs3 := "
        + Utils.toString(bs3)
        + ", bs4 := "
        + Utils.toString(bs4)
        + ", b1 := "
        + Utils.toString(b1)
        + ", b2 := "
        + Utils.toString(b2)
        + "}";
  }
}
