package ua.ithillel.lms.javapro.pavlopashchevskyi.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericWizard {

  public <T> List<T> toList(T[] array) {
    if (array == null) {
      return new ArrayList<>();
    }
    return new ArrayList<>(Arrays.asList(array));
  }
}
