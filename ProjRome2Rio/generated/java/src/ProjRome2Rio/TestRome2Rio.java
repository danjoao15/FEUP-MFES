package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestRome2Rio {
  public static void main() {

    new AirportTest().main();
    new BusTest().main();
    new BusStationTest().main();
    new DateTimeTest().main();
    new LocationTest().main();
    new PlaneTest().main();
    new TrainTest().main();
    new TrainStationTest().main();
    new TransportTest().main();
    new UserTest().main();
    new Rome2RioTest().main();
  }

  public TestRome2Rio() {}

  public String toString() {

    return "TestRome2Rio{}";
  }
}
