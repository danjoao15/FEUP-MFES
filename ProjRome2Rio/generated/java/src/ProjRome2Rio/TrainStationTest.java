package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TrainStationTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private Location l3 = new Location("Aveiro", "Portugal");
  private TrainStation ts1 = new TrainStation("Campanha", l1);
  private TrainStation ts2 = new TrainStation("Espinho", l2);
  private TrainStation ts3 = new TrainStation("Trindade", l1);
  private TrainStation ts4 = new TrainStation("Estarreja", l2);

  private void testgetName() {

    assertEqual(ts1.getName(), "Campanha");
    assertEqual(ts2.getName(), "Espinho");
    assertEqual(ts3.getName(), "Trindade");
    assertEqual(ts4.getName(), "Estarreja");
  }

  private void testgetLocation() {

    assertEqual(ts1.getLocation(), l1);
    assertEqual(ts2.getLocation(), l2);
    assertEqual(ts3.getLocation(), l1);
    assertEqual(ts4.getLocation(), l2);
  }

  public static void main() {

    TrainStationTest test = new TrainStationTest();
    test.testgetName();
    test.testgetLocation();
  }

  public TrainStationTest() {}

  public String toString() {

    return "TrainStationTest{"
        + "l1 := "
        + Utils.toString(l1)
        + ", l2 := "
        + Utils.toString(l2)
        + ", l3 := "
        + Utils.toString(l3)
        + ", ts1 := "
        + Utils.toString(ts1)
        + ", ts2 := "
        + Utils.toString(ts2)
        + ", ts3 := "
        + Utils.toString(ts3)
        + ", ts4 := "
        + Utils.toString(ts4)
        + "}";
  }
}
