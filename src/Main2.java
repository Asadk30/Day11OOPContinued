import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, -1};

        // Steps for adding a value to an array
        // 1: Create a new array that's larger
        int[] nums2 = new int[nums.length*2];

        // 2: Copy all values from the old array to the new array
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }

        // 3: Add the new value to the new array.
        nums2[4] = 5;

        // ArrayLists allow us to dynamically add/remove values from an array
        ArrayList<Integer> numArrList = new ArrayList<>();

        // Adding values to the array list
        numArrList.add(1);
        numArrList.add(2);
        numArrList.add(3);

        System.out.println(numArrList);

        // Removing a value by index.
        numArrList.remove(2);

        System.out.println(numArrList);

        int[] nums4 = {11, 67, 99, 101, 344, 500, 800, 1000, 1045};

        /*
        Update your CodingClassroom class to use an ArrayList of String
        students instead of an array of strings.

        You'll need to update the class field (property) and the parameter
        in the constructor.

        You'll also need to update how you're passing that data in Main
         */
    }

    // 500
}
