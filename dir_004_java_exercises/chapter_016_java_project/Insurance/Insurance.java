public abstract class Insurance {
    protected String name;
    protected int age;
    protected int coverage;

    public Insurance(String _name, int _age, int _coverage) {
        name = _name;
        age = _age;
        coverage = _coverage;
    }

    public Insurance() {
        name = "N/A";
        age = 0;
        coverage = 0;
    }

    public abstract double calculateCost();

    public abstract String toString();
}
