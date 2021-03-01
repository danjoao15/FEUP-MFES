package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BusStationTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private BusStation bs1 = new BusStation("Aliados", l1);
  private BusStation bs2 = new BusStation("IPO", l1);
  private BusStation bs3 = new BusStation("Santa Catarina", l1);
  private BusStation bs4 = new BusStation("Trindade", l1);

  private void testgetName() {

    assertEqual(bs1.getName(), "Aliados");
    assertEqual(bs2.getName(), "IPO");
    assertEqual(bs3.getName(), "Santa Catarina");
    assertEqual(bs4.getName(), "Trindade");
  }

  private void testgetLocation() {

    assertEqual(bs1.getLocation(), l1);
    assertEqual(bs2.getLocation(), l1);
    assertEqual(bs3.getLocation(), l1);
    assertEqual(bs4.getLocation(), l1);
  }

  public static void main() {

    BusStationTest test = new BusStationTest();
    test.testgetName();
    test.testgetLocation();
  }

  public BusStationTest() {}

  public String toString() {

    return "BusStationTest{"
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
        + "}";
  }
}
