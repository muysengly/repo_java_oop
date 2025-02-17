public class LifeInsurance extends Insurance {
  public LifeInsurance(String _name, int _age, int _coverage) {
    super(_name, _age, _coverage);
  }

  public LifeInsurance() {
    super();
  }

  public double calculateCost() {
    return 10 * age + 0.001 * coverage;
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("\n------Life Insurance policy------");
    buffer.append("\nName: " + name);
    buffer.append("\nAge: " + age);
    buffer.append("\nCoverage: " + coverage);
    buffer.append("\nYearly cost: " + calculateCost());

    return buffer.toString();
  }
}
