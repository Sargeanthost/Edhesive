// Unit 5: Lesson 7 - Coding Activity
// You don't need the java doc to pass the auto-grader

public class RightTriangle {

  private double base;
  private double height;
  private double hypot;

  public RightTriangle() {
    base = 1;
    height = 1;
    setHypot();
  }

  public RightTriangle(double bs, double ht) {

    base = bs > 1 ? bs : 1;
    height = ht > 1 ? ht : 1;
    setHypot();
  }

  private void setHypot() {

    hypot = Math.hypot(base, height);
  }

  public void setBase(double base) {

    if (base > 0) {
      this.base = base;
    }
  }

  public void setHeight(double height) {

    if (height > 0) {
      this.height = height;
    }
  }

  public double getArea() {

    return (base * height) / 2;
  }

  public double getBase() {

    return base;
  }

  public double getHeight() {

    return height;
  }

  public double getHypotenuse() {
    setHypot();
    return hypot;
  }

  public double getPerimeter() {

    return base + height + getHypotenuse();
  }

  @Override
  public String toString() {
    return "right triangle with base "
        + base
        + ", height "
        + height
        + ", hypotenuse "
        + getHypotenuse();
  }

  @Override
  public boolean equals(Object o) {

    RightTriangle tri = (RightTriangle) o;
    if (o == this) {
      return true;
    }

    if (this.getBase() != tri.getBase()) {
      return false;
    }

    if (this.getHeight() != tri.getHeight()) {
      return false;
    }

    return true;
  }
}
