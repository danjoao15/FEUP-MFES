package ProjRome2Rio;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class User {
  private String email = "";
  private String name = "";
  private String password = "";

  public void cg_init_User_1(final String e, final String n, final String p) {

    email = e;
    name = n;
    password = p;
  }

  public User(final String e, final String n, final String p) {

    cg_init_User_1(e, n, p);
  }

  public String getEmail() {

    return email;
  }

  public String getName() {

    return name;
  }

  public String getPassword() {

    return password;
  }

  public void setName(final String n) {

    name = n;
  }

  public void setPassword(final String p) {

    password = p;
  }

  public User() {}

  public String toString() {

    return "User{"
        + "email := "
        + Utils.toString(email)
        + ", name := "
        + Utils.toString(name)
        + ", password := "
        + Utils.toString(password)
        + "}";
  }
}
