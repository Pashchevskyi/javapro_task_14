package ua.ithillel.lms.javapro.pavlopashchevskyi.task14;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task14.api.Fruit;

public class Box<T extends Fruit> {

  private final List<T> fruits;

  public Box() {
    this.fruits = new ArrayList<>();
  }

  public boolean add(T fruit) {
    return fruits.add(fruit);
  }

  public boolean add(List<T> fruits) {
    return this.fruits.addAll(fruits);
  }

  public float getWeight() {
    return (fruits.size() > 0) ? fruits.get(0).getWeight() * fruits.size() : 0.0f;
  }

  public boolean compare(Box<? extends Fruit> b) {
    return b.getWeight() == this.getWeight();
  }

  public void merge(Box<T> b) {
    this.fruits.addAll(b.fruits);
    b.fruits.removeAll(this.fruits);
  }
}
