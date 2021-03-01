package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Location {
  private String city;
  private String country;

  public void cg_init_Location_1(final String c, final String p) {

    city = c;
    country = p;
    return;
  }

  public Location(final String c, final String p) {

    cg_init_Location_1(c, p);
  }

  public String getCity() {

    return city;
  }

  public String getCountry() {

    return country;
  }

  public void setCity(final String c) {

    city = c;
    return;
  }

  public void setCountry(final String p) {

    country = p;
    return;
  }

  public Location() {}

  public String toString() {

    return "Location{"
        + "city := "
        + Utils.toString(city)
        + ", country := "
        + Utils.toString(country)
        + "}";
  }
}
