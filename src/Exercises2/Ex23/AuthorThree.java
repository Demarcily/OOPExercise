package Exercises2.Ex23;

public class AuthorThree {
  private String name;
  private String email;

  public AuthorThree(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return "Author [Name = " + name + ", Email = " + email + "]";
  }
}
