import lombok.*; // Import lombok package

@NoArgsConstructor
@ToString
class Rectangle extends GeometricObject {
  @Getter @Setter private double width;
  @Getter @Setter private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(double width, double height, String color, 
      boolean filled) {
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }

  /** Return area */
  public double getArea() {
    return width * height;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }
}

public class TestLombok {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.setWidth(4.5);
    System.out.println("The width is " + r.getWidth());
    System.out.println(r);
  } 
}