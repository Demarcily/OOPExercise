public class Employee {
  private int id;
  private String firstname;
  private String lastname;
  private int salary;


  public Employee(int id, String firstname, String lastname, int salary) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.salary = salary;
  }

  public int getID() {
    return id;
  }
  public String getFirstName() {
    return firstname;
  }
  public String getLastName() {
    return lastname;
  }
  public String getName() {
    return firstname + " " + lastname;
  }
  public int getSalary() {
    return salary;
  }

  public int getAnnualSalary() {
    return (salary*12);
  }

  public void setSalary(int newSalary) {
    this.salary = newSalary;
  }

  public int raiseSalary(int percent) {
    return (salary * (percent + 100) / 100);
  }

  public String toString() {
    return "Employee [id=" + id + " name=" + firstname + " " + lastname + " salary =" + salary + "]";
  }

}
