Write a Java program that checks if two arrays contain the same elements

import java.util.Arrays;
import org.junit.Test;
import org.junit.Assert;

public class Solution {
  boolean sameElement(Integer[] array1, Integer[] array2) {
    //TODO: Implement your solution here
  }

  @Test
  void testYourProgram() {
    Integer[] a1 = {1,2,3,2,1};
    Integer[] a2 = {1,2,3};
    Integer[] a3 = {1,2,3,4};

    Assert.assertTrue(sameElements(a1,a2));
    Assert.assertTrue(sameElements(a2,a1));
    Assert.assertFalse(sameElements(a1,a3));
    Assert.assertFalse(sameElements(a3,a2));

    //Add More Cases Here
  }
}
