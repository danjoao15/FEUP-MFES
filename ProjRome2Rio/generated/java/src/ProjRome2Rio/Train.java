package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Train extends Transport {
  private TrainStation destinyStation;
  private TrainStation originStation;

  public void cg_init_Train_1(final Number i, final TrainStation ds, final TrainStation os) {

    cg_init_Transport_1(i);
  }

  public Train(final Number i, final TrainStation ds, final TrainStation os) {

    cg_init_Train_1(i, ds, os);
  }

  public TrainStation getDestinyStation() {

    return destinyStation;
  }

  public TrainStation getOriginStation() {

    return originStation;
  }

  public Train() {}

  public String toString() {

    return "Train{"
        + "destinyStation := "
        + Utils.toString(destinyStation)
        + ", originStation := "
        + Utils.toString(originStation)
        + "}";
  }
}
