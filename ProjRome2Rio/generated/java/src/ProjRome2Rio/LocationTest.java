package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LocationTest extends TestSuiteRome2Rio {
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");

  private void testgetCity() {

    assertEqual(l1.getCity(), "Porto");
    assertEqual(l2.getCity(), "Madrid");
  }

  private void testgetCountry() {

    assertEqual(l1.getCountry(), "Portugal");
    assertEqual(l2.getCountry(), "Spain");
  }

  private void testsetCity() {

    l1.setCity("Lisbon");
    l2.setCity("Barcelona");
  }

  private void testsetCountry() {

    l1.setCountry("Lusitanos");
    l2.setCountry("Mouros");
  }

  public static void main() {

    LocationTest test = new LocationTest();
    test.testgetCity();
    test.testgetCountry();
    test.testsetCity();
    test.testsetCountry();
  }

  public LocationTest() {}

  public String toString() {

    return "LocationTest{" + "l1 := " + Utils.toString(l1) + ", l2 := " + Utils.toString(l2) + "}";
  }
}
