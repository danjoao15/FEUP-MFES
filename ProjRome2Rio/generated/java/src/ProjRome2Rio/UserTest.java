package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class UserTest extends TestSuiteRome2Rio {
  private User u1 = new User("danjoao@gmail.com", "Malhoa", "123");
  private User u2 = new User("diogohp@gmail.com", "Palhas", "simples");

  private void testgetEmail() {

    assertEqual(u1.getEmail(), "danjoao@gmail.com");
    assertEqual(u2.getEmail(), "diogohp@gmail.com");
  }

  private void testgetName() {

    assertEqual(u1.getName(), "Malhoa");
    assertEqual(u2.getName(), "Palhas");
  }

  private void testgetPassword() {

    assertEqual(u1.getPassword(), "123");
    assertEqual(u2.getPassword(), "simples");
  }

  private void testsetName() {

    u1.setName("Ana Malhoa");
    u2.setName("Palhinhas");
  }

  private void testsetPassword() {

    u1.setPassword("321");
    u2.setPassword("dificil");
  }

  public static void main() {

    UserTest test = new UserTest();
    test.testgetEmail();
    test.testgetName();
    test.testsetName();
    test.testsetPassword();
  }

  public UserTest() {}

  public String toString() {

    return "UserTest{" + "u1 := " + Utils.toString(u1) + ", u2 := " + Utils.toString(u2) + "}";
  }
}
