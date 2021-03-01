package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Airport {
  private String name;
  private Location location;

  public void cg_init_Airport_1(final String n, final Location l) {

    name = n;
    location = l;
  }

  public Airport(final String n, final Location l) {

    cg_init_Airport_1(n, l);
  }

  public String getName() {

    return name;
  }

  public Location getLocation() {

    return location;
  }

  public Airport() {}

  public String toString() {

    return "Airport{"
        + "name := "
        + Utils.toString(name)
        + ", location := "
        + Utils.toString(location)
        + "}";
  }
}
