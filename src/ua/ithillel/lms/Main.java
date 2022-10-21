package ua.ithillel.lms;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task14.Apple;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task14.Box;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task14.api.Fruit;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task14.GenericWizard;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task14.Orange;

public class Main {

  public static void main(String[] args) {
    GenericWizard gw = new GenericWizard();
    Double[] dblArr = {3.14, 6.28, 2.71828183};
    List<Double> dblList = gw.toList(dblArr);
    System.out.println(dblList);

    String[] strArr = {"John", "Mike", "Mary", "Jane", "David", "Rebecca"};
    List<String> strList = gw.toList(strArr);
    System.out.println(strList);

    Fruit a = new Apple();
    Fruit o = new Orange();
    System.out.println("Weight of fruits per 1 unit:");
    System.out.println(" Apple: " + a.getWeight() + "\n Orange: " + o.getWeight());

    Box<Apple> appleBox = new Box<>();
    List<Apple> applesList = new ArrayList<>();
    applesList.add(new Apple());
    applesList.add(new Apple());
    applesList.add(new Apple());

    boolean fruitsAdded = appleBox.add(applesList);
    System.out.println((fruitsAdded) ? "Successfully added " + applesList.size() + " fruit(s)" :
        "Apples adding error");

    Box<Orange> orangeBox = new Box<>();
    boolean[] fruitAddedSigns = new boolean[2];
    fruitAddedSigns[0] = orangeBox.add(new Orange());
    fruitAddedSigns[1] = orangeBox.add(new Orange());
    for (int i = 0; i < fruitAddedSigns.length; i++) {
      System.out.println((fruitAddedSigns[i]) ? "Fruit#" + (i + 1) + " was successfully added!" :
          " Fruit#" + (i + 1) + " adding error!");
    }

    boolean isTheSameWeight = appleBox.compare(orangeBox);

    System.out.println("Apple box weight: " + appleBox.getWeight());
    System.out.println("Orange box weight: " + orangeBox.getWeight());
    System.out.println((isTheSameWeight) ? "Weights are equal" : "Weights are non-equal");

    System.out.println("Weight of boxes BEFORE merge:");
    Box<Apple> newBox = new Box<>();
    System.out.println(" New box: " + newBox.getWeight());
    System.out.println(" Old box: " + appleBox.getWeight());
    newBox.merge(appleBox);
    System.out.println("Weight of boxes AFTER merging");
    System.out.println("New box: " + newBox.getWeight());
    System.out.println("Old box: " + appleBox.getWeight());
  }
}