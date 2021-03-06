package edu.cnm.deepdive;

public class Search {

  public static int linearSearch(int[] haystack, int needle) {
    // Is the array sorted ?
    // What is the range of possible values?

    /* 1. Declare a variable */
    int position = -1;

    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] == needle) {
        position = i;
        break;
      }
    }
    /* 2. Return the variable */
    return position;
  }

  public static int binarySearch(int[] haystack, int needle) {
    return binarySearch(haystack, needle, 0, haystack.length);
  }

  private static int binarySearch(int[] haystack, int needle, int start, int end) {
    int position = ~start;
    while (end > start) {
      int mid = (start + end) / 2;
      int value = haystack[mid];

      if (value == needle) {
        position = mid;
        break;
      } else if (value < needle) {


        start = mid + 1;
        position = ~start;
      } else {
        end = mid;
      }

    }
    return position;
  }

}
