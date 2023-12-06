//Implement a solution to remove duplicate elements in a list. Do not change any method signatures

import java.util.*;
import org.junit.Test;
import org.junit.Assert;

public class Solution {
  <T> void removeDuplicates(List<T> list) {
    for(T element: list) {
      if(isDuplicate(list,element)) {
        list.remove(element);
      }
    }
  }

  <T> boolean isDuplicate(List<T> list, T element) {
    //TODO: Implement a solution to check if a given element is a duplicate
    return false;
  }

  @Test
  public void testYourProgram() {
    List<Integer> testList = new ArrayList<>(Arrays.asList(1,3,2,2));
    removeDuplicates(testList);
    Assert.assertEquals(new ArrayList<>(Arrays.asList(1,3,2)), testList);
  }
}
