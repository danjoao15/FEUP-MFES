package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class AirportTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private Airport a1 = new Airport("Aeroporto do Porto", l1);
  private Airport a2 = new Airport("Aeroporto de Madrid", l2);

  private void testgetName() {

    assertEqual(a1.getName(), "Aeroporto de Lisboa");
    assertEqual(a2.getName(), "Aeroporto do Porto");
  }

  private void testgetLocation() {

    assertEqual(a1.getLocation(), "Lisboa");
    assertEqual(a2.getLocation(), "Porto");
  }

  public static void main() {

    AirportTest test = new AirportTest();
    test.testgetName();
    test.testgetLocation();
  }

  public AirportTest() {}

  public String toString() {

    return "AirportTest{"
        + "l1 := "
        + Utils.toString(l1)
        + ", l2 := "
        + Utils.toString(l2)
        + ", a1 := "
        + Utils.toString(a1)
        + ", a2 := "
        + Utils.toString(a2)
        + "}";
  }
}
