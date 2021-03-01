package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Rome2RioTest extends TestSuiteRome2Rio {
  private Rome2Rio r = new Rome2Rio();
  private Location l1 = new Location("Porto", "Portugal");
  private Location l2 = new Location("Madrid", "Spain");
  private Location l3 = new Location("Aveiro", "Portugal");
  private TrainStation ts1 = new TrainStation("Campanha", l1);
  private TrainStation ts2 = new TrainStation("Espinho", l2);
  private TrainStation ts3 = new TrainStation("Trindade", l1);
  private TrainStation ts4 = new TrainStation("Estarreja", l2);
  private Airport a1 = new Airport("Aeroporto do Porto", l1);
  private Airport a2 = new Airport("Aeroporto de Madrid", l2);
  private BusStation bs1 = new BusStation("Aliados", l1);
  private BusStation bs2 = new BusStation("IPO", l1);
  private BusStation bs3 = new BusStation("Santa Catarina", l1);
  private BusStation bs4 = new BusStation("Trindade", l1);
  private Bus b1 = new Bus(105L, bs1, bs2);
  private Bus b2 = new Bus(205L, bs3, bs4);
  private DateTime d1 = new DateTime(2018L, 12L, 30L, 20L, 30L);
  private DateTime d2 = new DateTime(2018L, 10L, 30L, 20L, 30L);
  private DateTime d3 = new DateTime(2018L, 12L, 30L, 21L, 30L);
  private Plane p1 = new Plane(101L, a1, a2);
  private Plane p2 = new Plane(100L, a2, a1);
  private User u1 = new User("danjoao@gmail.com", "Malhoa", "123");
  private User u2 = new User("diogohp@gmail.com", "Palhas", "simples");
  private Transport tr1 = new Transport(105L);
  private Transport tr2 = new Transport(101L);
  private Train t1 = new Train(76L, ts1, ts2);
  private Train t2 = new Train(66L, ts3, ts4);

  private void testgetUserByEmail() {

    assertEqual(r.getUserByEmail("danjoao@gmail.com"), u1);
    assertEqual(r.getUserByEmail("diogohp@gmail.com"), u2);
  }

  private void testgetCurrentUser() {

    assertEqual(r.getCurrentUser(), u1);
  }

  private void testgetUsers() {

    assertEqual(r.getUsers(), SetUtil.set(u1, u2));
  }

  private void testgetTransportByLocations() {

    assertEqual(r.getTransportByLocations(l1, l2), SetUtil.set(tr1));
  }

  private void testgetPlanesByLocations() {

    assertEqual(r.getPlanesByLocations(l1, l2), SetUtil.set(p1));
  }

  private void testgetTrainsByLocations() {

    assertEqual(r.getTrainsByLocations(l1, l2), SetUtil.set(t1));
  }

  private void testgetBusesByLocations() {

    assertEqual(r.getBusesByLocations(l1, l2), SetUtil.set(b1));
  }

  private void testgetDestinies() {

    assertEqual(r.getDestinies(l1), SetUtil.set(l1));
  }

  private void testaddUser() {

    r.addUser(u1);
    r.addUser(u2);
  }

  private void testaddPlane() {

    r.addPlane(p1);
    r.addPlane(p2);
  }

  private void testaddBus() {

    r.addBus(b1);
    r.addBus(b2);
  }

  private void testaddTrain() {

    r.addTrain(t1);
    r.addTrain(t2);
  }

  private void testloginUser() {

    assertEqual(r.loginUser("danjoao@gmail.com", "123"), true);
  }

  private void testlogout() {

    r.logout();
  }

  public static void main() {

    Rome2RioTest test = new Rome2RioTest();
    test.testgetUserByEmail();
    test.testgetCurrentUser();
    test.testgetUsers();
    test.testgetTransportByLocations();
    test.testgetPlanesByLocations();
    test.testgetTrainsByLocations();
    test.testgetBusesByLocations();
    test.testgetDestinies();
    test.testaddUser();
    test.testaddPlane();
    test.testaddBus();
    test.testaddTrain();
    test.testloginUser();
    test.testlogout();
  }

  public Rome2RioTest() {}

  public String toString() {

    return "Rome2RioTest{"
        + "r := "
        + Utils.toString(r)
        + ", l1 := "
        + Utils.toString(l1)
        + ", l2 := "
        + Utils.toString(l2)
        + ", l3 := "
        + Utils.toString(l3)
        + ", ts1 := "
        + Utils.toString(ts1)
        + ", ts2 := "
        + Utils.toString(ts2)
        + ", ts3 := "
        + Utils.toString(ts3)
        + ", ts4 := "
        + Utils.toString(ts4)
        + ", a1 := "
        + Utils.toString(a1)
        + ", a2 := "
        + Utils.toString(a2)
        + ", bs1 := "
        + Utils.toString(bs1)
        + ", bs2 := "
        + Utils.toString(bs2)
        + ", bs3 := "
        + Utils.toString(bs3)
        + ", bs4 := "
        + Utils.toString(bs4)
        + ", b1 := "
        + Utils.toString(b1)
        + ", b2 := "
        + Utils.toString(b2)
        + ", d1 := "
        + Utils.toString(d1)
        + ", d2 := "
        + Utils.toString(d2)
        + ", d3 := "
        + Utils.toString(d3)
        + ", p1 := "
        + Utils.toString(p1)
        + ", p2 := "
        + Utils.toString(p2)
        + ", u1 := "
        + Utils.toString(u1)
        + ", u2 := "
        + Utils.toString(u2)
        + ", tr1 := "
        + Utils.toString(tr1)
        + ", tr2 := "
        + Utils.toString(tr2)
        + ", t1 := "
        + Utils.toString(t1)
        + ", t2 := "
        + Utils.toString(t2)
        + "}";
  }
}
