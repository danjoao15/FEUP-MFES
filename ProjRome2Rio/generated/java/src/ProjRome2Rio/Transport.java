package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Transport {
  private Number id;

  public void cg_init_Transport_1(final Number i) {

    id = i;
  }

  public Transport(final Number i) {

    cg_init_Transport_1(i);
  }

  public Number getId() {

    return id;
  }

  public Transport() {}

  public String toString() {

    return "Transport{" + "id := " + Utils.toString(id) + "}";
  }
}
