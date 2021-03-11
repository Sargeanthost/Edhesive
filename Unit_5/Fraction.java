package Unit_5;

// Assignment 5: Fraction

public class Fraction {

  private static int total = 0;
  private int n1;
  private int d1;

  public Fraction() {

    total++;
    n1 = 1;
    d1 = 1;
  }

  public Fraction(int n, int d) {

    total++;
    setNumerator((n > 0 ? n : 1));
    setDenominator((d > 0 ? d : 1));
  }

  public static int getNumFractions() {

    return total;
  }

  public int getNumerator() {

    return n1;
  }

  public int getDenominator() {

    return d1;
  }

  public void setDenominator(int denominator) {

    if (denominator > 0) {
      d1 = denominator;
    }
  }

  public void setNumerator(int numerator) {

    if (numerator > 0) {
      n1 = numerator;
    }
  }

  public void add(int n2, int d2) {

    if (n2 > 0 && d2 > 0) {
      n1 = n1 * d2 + n2 * d1;
      d1 = d1 * d2;
    }
  }

  public void add(Fraction fraction) {

    n1 = n1 * fraction.getDenominator() + fraction.getNumerator() * d1;
    d1 = d1 * fraction.getDenominator();
  }

  public void multiply(int n2, int d2) {

    if (n2 > 0 && d2 > 0) {
      n1 *= n2;
      d1 *= d2;
    }
  }

  public void multiply(Fraction fraction) {

    n1 *= fraction.getNumerator();
    d1 *= fraction.getDenominator();
  }

  public String mixedNumber() {

    int a = getNumerator() / getDenominator();
    int b = getNumerator() % getDenominator();
    return a != 0 ? (a + " " + b + "/" + getDenominator()) : (b + "/" + getDenominator());
  }

  @Override
  public String toString() {

    return n1 + "/" + d1;
  }
}
