package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BusStation {
  private String name;
  private Location location;

  public void cg_init_BusStation_1(final String n, final Location l) {

    name = n;
    location = l;
  }

  public BusStation(final String n, final Location l) {

    cg_init_BusStation_1(n, l);
  }

  public String getName() {

    return name;
  }

  public Location getLocation() {

    return location;
  }

  public BusStation() {}

  public String toString() {

    return "BusStation{"
        + "name := "
        + Utils.toString(name)
        + ", location := "
        + Utils.toString(location)
        + "}";
  }
}
