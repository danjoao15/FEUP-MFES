package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PlaneTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private Airport a1 = new Airport("Aeroporto do Porto", l1);
  private Airport a2 = new Airport("Aeroporto de Madrid", l2);
  private Plane p1 = new Plane(101L, a1, a2);
  private Plane p2 = new Plane(100L, a2, a1);

  private void testgetDestinyStation() {

    assertEqual(p1.getDestinyStation(), a1);
    assertEqual(p2.getDestinyStation(), a2);
  }

  private void testgetOriginStation() {

    assertEqual(p1.getOriginStation(), a2);
    assertEqual(p2.getOriginStation(), a1);
  }

  public static void main() {

    PlaneTest test = new PlaneTest();
    test.testgetDestinyStation();
    test.testgetOriginStation();
  }

  public PlaneTest() {}

  public String toString() {

    return "PlaneTest{"
        + "l1 := "
        + Utils.toString(l1)
        + ", l2 := "
        + Utils.toString(l2)
        + ", a1 := "
        + Utils.toString(a1)
        + ", a2 := "
        + Utils.toString(a2)
        + ", p1 := "
        + Utils.toString(p1)
        + ", p2 := "
        + Utils.toString(p2)
        + "}";
  }
}
