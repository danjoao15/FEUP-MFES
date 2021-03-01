package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TrainTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private TrainStation ts1 = new TrainStation("Campanha", l1);
  private TrainStation ts2 = new TrainStation("Espinho", l2);
  private TrainStation ts3 = new TrainStation("Trindade", l1);
  private TrainStation ts4 = new TrainStation("Estarreja", l2);
  private Train t1 = new Train(76L, ts1, ts2);
  private Train t2 = new Train(66L, ts3, ts4);

  private void testgetDestinyStation() {

    assertEqual(t1.getDestinyStation(), ts1);
    assertEqual(t2.getDestinyStation(), ts2);
  }

  private void testgetOriginStation() {

    assertEqual(t1.getOriginStation(), ts3);
    assertEqual(t2.getOriginStation(), ts4);
  }

  public static void main() {

    TrainTest test = new TrainTest();
    test.testgetDestinyStation();
    test.testgetOriginStation();
  }

  public TrainTest() {}

  public String toString() {

    return "TrainTest{"
        + "l1 := "
        + Utils.toString(l1)
        + ", l2 := "
        + Utils.toString(l2)
        + ", ts1 := "
        + Utils.toString(ts1)
        + ", ts2 := "
        + Utils.toString(ts2)
        + ", ts3 := "
        + Utils.toString(ts3)
        + ", ts4 := "
        + Utils.toString(ts4)
        + ", t1 := "
        + Utils.toString(t1)
        + ", t2 := "
        + Utils.toString(t2)
        + "}";
  }
}
