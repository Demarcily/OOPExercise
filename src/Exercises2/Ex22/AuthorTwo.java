package Exercises2.Ex22;

public class AuthorTwo {
  private String name;
  private String email;
  private char gender;

  public AuthorTwo(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public char getGender() {
    return gender;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
  }
}
