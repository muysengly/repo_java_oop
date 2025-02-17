public class AutoInsurance extends Insurance {
  protected int carAge;

  public AutoInsurance(String _name, int _age, int _coverage, int _carAge) {
    super(_name, _age, _coverage);
    carAge = _carAge;
  }

  public AutoInsurance() {
    super();
    carAge = 0;
  }

  public int getCarAge() {
    return carAge;
  }

  public double calculateCost() {
    return -age + 0.05 * coverage + 10 * carAge;
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("\n------Auto Insurance policy------");
    buffer.append("\nName: " + name);
    buffer.append("\nAge: " + age);
    buffer.append("\nCoverage: " + coverage);
    buffer.append("\nCar Age: " + carAge);
    buffer.append("\nYearly cost: " + calculateCost());

    return buffer.toString();
  }

}
