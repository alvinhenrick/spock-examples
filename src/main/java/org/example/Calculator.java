package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahenrick on 6/6/14.
 */
public class Calculator {

  private final List<Integer> accumulators;

  public Calculator() {
    this.accumulators = new ArrayList<Integer>();
  }

  public static Calculator take(int accumulator) {
    return new Calculator(accumulator);
  }

  private Calculator(int accumulator) {
    this();
    add(accumulator);
  }

  public Calculator add(int x) {
    accumulators.add(x);
    return this;
  }

  public Calculator subtract(int x) {
    accumulators.add(-x);
    return this;
  }

  public int calculate() {
    Integer result = 0;
    for (Integer accumulator : accumulators) {
      result += accumulator;
    }
    return result;
  }

  public Calculator multiply(int p) {
    int accumulator = calculate() * p;
    accumulators.clear();
    add(accumulator);
    return this;
  }
}