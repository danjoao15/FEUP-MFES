package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Plane extends Transport {
  private Airport destinyStation;
  private Airport originStation;

  public void cg_init_Plane_1(final Number i, final Airport ds, final Airport os) {

    cg_init_Transport_1(i);
  }

  public Plane(final Number i, final Airport ds, final Airport os) {

    cg_init_Plane_1(i, ds, os);
  }

  public Airport getDestinyStation() {

    return destinyStation;
  }

  public Airport getOriginStation() {

    return originStation;
  }

  public Plane() {}

  public String toString() {

    return "Plane{"
        + "destinyStation := "
        + Utils.toString(destinyStation)
        + ", originStation := "
        + Utils.toString(originStation)
        + "}";
  }
}
