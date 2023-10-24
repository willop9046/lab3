

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] newArray = new int[arr.length];
    int index = 0;
    for(int i = arr.length - 1; i >= 0; i -= 1) {
      newArray[index] = arr[i];
      index++;
    }
    for(int i = 0; i < arr.length; i++){
      arr[i] = newArray[i];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    int index = 0;
    for(int i = arr.length - 1; i >= 0; i -= 1) {
      newArray[index] = arr[i];
      index++;
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    boolean added = false;
    for(double num: arr) {
      if(num == lowest && added == false){
        added = true;
      }else{
        sum += num;
      }
    }
    return sum / arr.length;
  }


}

