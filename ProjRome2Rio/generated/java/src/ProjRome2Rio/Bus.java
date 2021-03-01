package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Bus extends Transport {
  private BusStation destinyStation;
  private BusStation originStation;

  public void cg_init_Bus_1(final Number i, final BusStation ds, final BusStation os) {

    cg_init_Transport_1(i);
  }

  public Bus(final Number i, final BusStation ds, final BusStation os) {

    cg_init_Bus_1(i, ds, os);
  }

  public BusStation getDestinyStation() {

    return destinyStation;
  }

  public BusStation getOriginStation() {

    return originStation;
  }

  public Bus() {}

  public String toString() {

    return "Bus{"
        + "destinyStation := "
        + Utils.toString(destinyStation)
        + ", originStation := "
        + Utils.toString(originStation)
        + "}";
  }
}
