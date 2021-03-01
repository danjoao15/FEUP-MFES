package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TransportTest extends TestSuiteRome2Rio {
  private Transport tr1 = new Transport(105L);
  private Transport tr2 = new Transport(101L);

  private void testgetId() {

    assertEqual(tr1.getId(), 105L);
    assertEqual(tr2.getId(), 101L);
  }

  public static void main() {

    TransportTest test = new TransportTest();
    test.testgetId();
  }

  public TransportTest() {}

  public String toString() {

    return "TransportTest{"
        + "tr1 := "
        + Utils.toString(tr1)
        + ", tr2 := "
        + Utils.toString(tr2)
        + "}";
  }
}
