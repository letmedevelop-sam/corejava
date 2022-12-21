package literals;

import java.util.Arrays;

public class Wrapper2 {
    public static void main(String[] args) {
        //Autoboxing
        Double d = 10.3;  //a default double value directly assigned to object type

        //Unboxing
        int i = new Integer(10);  //Right side of the declaration keeps Integer value 10 as an object.
        //Left side of the declaration converts that value to a  primitive type.

        boolean b = Boolean.valueOf("true");
    }


}


class Str1 {
    public static void main(String[] args) {
        String myString1 = "This Is My String";
        for (int i = 0; i < myString1.length(); i++) {
            System.out.print(myString1.charAt(i) + " ");
        }
    }
}

class Str2 {
    public static void main(String[] args) {
        String myString2 = "This Is My String";
        char[] myCharArray = myString2.toCharArray();
        for (int i = 0; i < myCharArray.length; i++) {
            System.out.print(myCharArray[i] + " ");
        }
    }
}

class Str3 {
    public static void main(String[] args) {
        String myString = "This is my string";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 's') {
                builder.append(myString.charAt(i));
            }
        }
        System.out.println(builder.toString());
    }
}

class Str4 {
    public static void main(String[] args) {
        String myString = "interviewgrid.com is awesome";
        StringBuilder builder = new StringBuilder();
        String[] words = myString.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);
            builder.append(" ");
        }
        System.out.println(builder.toString());
    }


}

class str5 {

    public static void main(String[] args) {
        String myString1 = "awesome";
        String myString2 = "someawe";
        System.out.println(checkForPermutation(myString1, myString2));
    }

    static String sort(String str1) {
        char[] charArray = str1.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    static boolean checkForPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }
}

class str6 {
    public static void main(String[] args) {
        // Declare, instantiate and initialize a multi-dimensional array separately
        //Declare a multidimensional array
        String[][] stringArray1;
        //Instantiate multidimensional array
        stringArray1 = new String[2][5];
        //Initialize multi-dimensional array
        stringArray1[1][2] = "Test String";

        //Declare, instantiate and initialize a multidimensional array
        String[][] stringArray2 = {{"Str1", "Str2", "Str3", "Str4", "Str5"}, {
                "abc", "efg"}};
        //Get the result of multidimensional array by using deepToString method
        System.out.println(Arrays.deepToString(stringArray2));
    }
}


class PrintArrays {
    public static void main(String[] args) {
        //Printing a 1D Array
        int marks5[] = {25, 30, 50, 10, 5};
        System.out.println(marks5); //[I@6db3f829
        System.out.println(Arrays.toString(marks5));//[25, 30, 50, 10, 5]

        //Printing a 2D Array
        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix3); //[[I@1d5a0305
        System.out.println(Arrays.toString(matrix3)); //[[I@6db3f829, [I@42698403]
        System.out.println(Arrays.deepToString(matrix3)); //[[1, 2, 3], [4, 5, 6]]

        // matrix3[0] is a 1D Array
        System.out.println(matrix3[0]);//[I@86c347
        System.out.println(Arrays.toString(matrix3[0]));//[1, 2, 3]
    }
}

class ReverseArray {
    public static void main(String[] args) {
        //Loop through the array in reverse order and add to a new array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myReverseArray = new int[myArray.length];
        for (int i = myArray.length - 1; i >= 0; i--) {
            myReverseArray[myArray.length - i - 1] = myArray[i];
        }
        System.out.println(Arrays.toString(myReverseArray));
    }
}

class ArrayCopy {
    public static void main(String[] args) {
        String[] fromArray = {"str1", "str2", "str3", "str4", "str5"};
        String[] toArray = new String[5];
        System.arraycopy(fromArray, 0, toArray, 0, 5);
        System.out.println(Arrays.toString(toArray));
    }
}

class ArrayCopy2 {
    public static void main(String[] args) {
        String[] fromArray = {"str1", "str2", "str3", "str4", "str5"};
        String[] toArray = new String[5];

        //Loop through the array and copy the elements
        for (int i = 0; i < fromArray.length; i++) {
            toArray[i] = fromArray[i];
        }
        System.out.println(Arrays.toString(toArray));
    }
}

class ArraySort {
    public static void main(String[] args) {
        String[] array1 = {"abc", "bkl", "ctr", "mkl", "atc"};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}