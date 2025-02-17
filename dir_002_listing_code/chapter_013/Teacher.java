public class Teacher {
  final String name; // Final data field
  final Date birthDate;
  final double weight;
  
  public Teacher(String name, Date birthDate, double weight) {
    this.name = name;
    this.birthDate = birthDate;
    this.weight = weight;
  }
  
  public String name() {
    return name;
  }
  
  public Date birthDate() {
    return birthDate;
  }
  
  public double weight() {
    return weight;
  }
  
  @Override
  public String toString() {
    return "Teacher[" + "name=" + name + ", birthDate=" + birthDate
      + ", weight=" + weight + "]";
  }
  
  @Override
  public boolean equals(Object o) {
    return name.equals(((Teacher)o).name) && 
      birthDate.equals(((Teacher)o).birthDate) && 
      weight == ((Teacher)o).weight;
  }
}