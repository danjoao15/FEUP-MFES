package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TrainStation {
  private String name;
  private Location location;

  public void cg_init_TrainStation_1(final String n, final Location l) {

    name = n;
    location = l;
  }

  public TrainStation(final String n, final Location l) {

    cg_init_TrainStation_1(n, l);
  }

  public String getName() {

    return name;
  }

  public Location getLocation() {

    return location;
  }

  public TrainStation() {}

  public String toString() {

    return "TrainStation{"
        + "name := "
        + Utils.toString(name)
        + ", location := "
        + Utils.toString(location)
        + "}";
  }
}
