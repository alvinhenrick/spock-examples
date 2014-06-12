package org.example;

/**
 * Created by ahenrick on 6/6/14.
 */

public class BasketWeightCalculator {

  private int totalWeight = 0;

  public void addItem(int itemWeight) // Assume weight is always an integer // number
  {
    totalWeight = totalWeight + itemWeight;
  }

  public int getTotalWeight() {
    return totalWeight;
  }
}