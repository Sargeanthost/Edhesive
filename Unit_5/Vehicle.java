package Unit_5;
public class Vehicle {
  int location = 0;

  public Vehicle() {

    location = 0;
  }

  public Vehicle(int loc) {

    location = loc <= 20 && loc >= -20 ? loc : 0;
  }

  public void forward() {

    location += location < 20 && location > -20 ? 1 : 0;
  }

  public void backward() {

    location -= location < 20 && location > -20 ? 1 : 0;
  }

  public int getLocation() {

    return location;
  }

  public String toString() {

    String str = "";
    for (int i = -20; i < location; i++) {
      str += " ";
    }
    str += "@";
    return str;
  }
}
