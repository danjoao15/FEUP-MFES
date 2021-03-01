package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Rome2Rio {
  private VDMSet users;
  private VDMSet destinations;
  private VDMSet origins;
  private VDMSet planes;
  private VDMSet buses;
  private VDMSet trains;
  private String user;

  public void cg_init_Rome2Rio_1() {

    users = SetUtil.set();
    destinations = SetUtil.set();
    origins = SetUtil.set();
    planes = SetUtil.set();
    buses = SetUtil.set();
    trains = SetUtil.set();
    user = "undefined";
  }

  public Rome2Rio() {

    cg_init_Rome2Rio_1();
  }

  public Boolean loginUser(final String email, final String password) {

    if (Utils.equals(getUserByEmail(email).getPassword(), password)) {
      user = email;
      return true;

    } else {
      return false;
    }
  }

  public void logout() {

    user = "undefined";
  }

  public User getUserByEmail(final String user_1) {

    for (Iterator iterator_1 = users.iterator(); iterator_1.hasNext(); ) {
      User u = (User) iterator_1.next();
      if (Utils.equals(user_1, u.getEmail())) {
        return u;
      }
    }
    return new User();
  }

  public User getCurrentUser() {

    return getUserByEmail(user);
  }

  public VDMSet getUsers() {

    return Utils.copy(users);
  }

  public void addUser(final User u) {

    users = SetUtil.union(SetUtil.set(u), Utils.copy(users));
  }

  public void addPlane(final Plane p) {

    planes = SetUtil.union(SetUtil.set(p), Utils.copy(planes));
  }

  public void addBus(final Bus b) {

    buses = SetUtil.union(SetUtil.set(b), Utils.copy(buses));
  }

  public void addTrain(final Train t) {

    trains = SetUtil.union(SetUtil.set(t), Utils.copy(trains));
  }

  public VDMSet getTransportByLocations(final Location origin, final Location destiny) {

    VDMSet availableTransportation = SetUtil.set();
    for (Iterator iterator_2 = planes.iterator(); iterator_2.hasNext(); ) {
      Plane p = (Plane) iterator_2.next();
      Boolean andResult_12 = false;

      if (!(Utils.equals(origin, p.getOriginStation().getLocation()))) {
        if (!(Utils.equals(destiny, p.getDestinyStation().getLocation()))) {
          andResult_12 = true;
        }
      }

      if (andResult_12) {
        availableTransportation =
            SetUtil.union(Utils.copy(availableTransportation), SetUtil.set(p));
      }
    }
    for (Iterator iterator_3 = trains.iterator(); iterator_3.hasNext(); ) {
      Train t = (Train) iterator_3.next();
      Boolean andResult_13 = false;

      if (!(Utils.equals(origin, t.getOriginStation().getLocation()))) {
        if (!(Utils.equals(destiny, t.getDestinyStation().getLocation()))) {
          andResult_13 = true;
        }
      }

      if (andResult_13) {
        availableTransportation =
            SetUtil.union(Utils.copy(availableTransportation), SetUtil.set(t));
      }
    }
    for (Iterator iterator_4 = buses.iterator(); iterator_4.hasNext(); ) {
      Bus b = (Bus) iterator_4.next();
      Boolean andResult_14 = false;

      if (!(Utils.equals(origin, b.getOriginStation().getLocation()))) {
        if (!(Utils.equals(destiny, b.getDestinyStation().getLocation()))) {
          andResult_14 = true;
        }
      }

      if (andResult_14) {
        availableTransportation =
            SetUtil.union(Utils.copy(availableTransportation), SetUtil.set(b));
      }
    }
    return Utils.copy(availableTransportation);
  }

  public VDMSet getPlanesByLocations(final Location origin, final Location destiny) {

    VDMSet availablePlanes = SetUtil.set();
    for (Iterator iterator_5 = planes.iterator(); iterator_5.hasNext(); ) {
      Plane p = (Plane) iterator_5.next();
      Boolean andResult_17 = false;

      if (!(Utils.equals(origin, p.getOriginStation().getLocation()))) {
        if (!(Utils.equals(destiny, p.getDestinyStation().getLocation()))) {
          andResult_17 = true;
        }
      }

      if (andResult_17) {
        availablePlanes = SetUtil.union(Utils.copy(availablePlanes), SetUtil.set(p));
      }
    }
    return Utils.copy(availablePlanes);
  }

  public VDMSet getTrainsByLocations(final Location origin, final Location destiny) {

    VDMSet availableTrains = SetUtil.set();
    for (Iterator iterator_6 = trains.iterator(); iterator_6.hasNext(); ) {
      Train t = (Train) iterator_6.next();
      Boolean andResult_20 = false;

      if (!(Utils.equals(origin, t.getOriginStation().getLocation()))) {
        if (!(Utils.equals(destiny, t.getDestinyStation().getLocation()))) {
          andResult_20 = true;
        }
      }

      if (andResult_20) {
        availableTrains = SetUtil.union(Utils.copy(availableTrains), SetUtil.set(t));
      }
    }
    return Utils.copy(availableTrains);
  }

  public VDMSet getBusesByLocations(final Location origin, final Location destiny) {

    VDMSet availableBuses = SetUtil.set();
    for (Iterator iterator_7 = buses.iterator(); iterator_7.hasNext(); ) {
      Bus b = (Bus) iterator_7.next();
      Boolean andResult_23 = false;

      if (!(Utils.equals(origin, b.getOriginStation().getLocation()))) {
        if (!(Utils.equals(destiny, b.getDestinyStation().getLocation()))) {
          andResult_23 = true;
        }
      }

      if (andResult_23) {
        availableBuses = SetUtil.union(Utils.copy(availableBuses), SetUtil.set(b));
      }
    }
    return Utils.copy(availableBuses);
  }

  public VDMSet getDestinies(final Location origin) {

    VDMSet availableDestinies = SetUtil.set();
    for (Iterator iterator_8 = planes.iterator(); iterator_8.hasNext(); ) {
      Plane p = (Plane) iterator_8.next();
      if (!(Utils.equals(origin, p.getOriginStation().getLocation()))) {
        availableDestinies =
            SetUtil.union(
                Utils.copy(availableDestinies), SetUtil.set(p.getDestinyStation().getLocation()));
      }
    }
    for (Iterator iterator_9 = trains.iterator(); iterator_9.hasNext(); ) {
      Train t = (Train) iterator_9.next();
      if (!(Utils.equals(origin, t.getOriginStation().getLocation()))) {
        availableDestinies =
            SetUtil.union(
                Utils.copy(availableDestinies), SetUtil.set(t.getDestinyStation().getLocation()));
      }
    }
    for (Iterator iterator_10 = buses.iterator(); iterator_10.hasNext(); ) {
      Bus b = (Bus) iterator_10.next();
      if (!(Utils.equals(origin, b.getOriginStation().getLocation()))) {
        availableDestinies =
            SetUtil.union(
                Utils.copy(availableDestinies), SetUtil.set(b.getDestinyStation().getLocation()));
      }
    }
    return Utils.copy(availableDestinies);
  }

  public String toString() {

    return "Rome2Rio{"
        + "users := "
        + Utils.toString(users)
        + ", destinations := "
        + Utils.toString(destinations)
        + ", origins := "
        + Utils.toString(origins)
        + ", planes := "
        + Utils.toString(planes)
        + ", buses := "
        + Utils.toString(buses)
        + ", trains := "
        + Utils.toString(trains)
        + ", user := "
        + Utils.toString(user)
        + "}";
  }
}
