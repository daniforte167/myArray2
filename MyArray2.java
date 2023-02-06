package com.gradescope.arrays
//For some reason the tester code cuts off in the middle of intersection code and I couldn't figure out why. I also had to do a for loop in some of the tester codes to print the array and for some reason it printed an extra number on my "end of tester code" lines.`

import java.util.Arrays;

public class MyArray2 {
    
    //copy code
    public static int[] copy(int [] array){
        int [] CopyofArray = new int[array.length];
        for (int i=0; i< array.length; i++){
            //setting new array to the same index of the array
            CopyofArray[i] = array [i];
        }
        System.out.println("New, Duplicated Array: " + Arrays.toString(CopyofArray));
        return CopyofArray;
    }

    //addAll code
    public static int addAll(int [] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];
            }
        System.out.println("The sum is: " + sum);
        return sum;
    }
        
    //addArrays code
    public static int [] addArrays(int [] array, int [] array2){
        int [] sumArray = new int[array.length];
        int Array1Num;
        int Array2Num;
        int sum;
        for (int i=0; i<array.length; i++){
            Array1Num = array [i];
            Array2Num = array2 [i];
            sum = Array1Num + Array2Num;
            sumArray[i] = sum;

        }
        System.out.println("Sum Array:" + Arrays.toString(sumArray));
        return sumArray;
    }
    
    //multiplyAll code
    public static int [] multiplyAll(int [] array){
        int product = 0;
        for (int i = 0; i<array.length; i++){
            product = product * array[i];
            }
        System.out.println("The product of array is: " + product);
        return array;
    }

    //findAverage code
    public static int findAverage(int [] array){
        int sumForaverage = 0;
        int average = 0;
        for (int i = 0; i<array.length; i++){
            sumForaverage = sumForaverage + array[i];
            average = sumForaverage / array.length;
            }
        System.out.println("The Average is: " + average);
        return average;
    }

    //swap code
    public static int [] swap(int [] array, int x, int y){
        int z = array[x]; // set variable equal to a random integer in the array
        z = array[x];
        array[x] = array[y];
        array[y] = z;
        System.out.println("The Swapped Array: " + Arrays.toString(array));
        return array;
        
    }

    //isElement code
    public static boolean isElement(int [] array, int value){
        for(int i=0; i < array.length; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }

    //indexOf code
    public static int indexOf(int [] array, int y){
        int indexValue = -1; //returns -1 if it isn't there
        for (int i = 0; i < array.length; i++){
            if(y == array[i]){
                indexValue = i;
            }
        }
        System.out.println("The Index is: " + indexValue);
        return indexValue;
    }

    //findMin code
    public static int findMin(int [] array){
        int minValue = array[0]; //setting it to first index, 'cause it has to start there then it'll go and compare the new values until it finds somethign smaller
        for (int i = 0; i<array.length; i++){
            if (array[i] <= minValue){
                minValue = array[i];
            }
        }
        System.out.println("The Minimum Value is: " + minValue);
        return minValue;

    }

    //findMinIndex code
    public static int findMinIndex(int [] array){
        int indexValue = -1; //returns -1 if it isn't there
        int minValue = array[0]; //setting it to first index, 'cause it has to start there then it'll go and compare the new values until it finds somethign smaller
        for (int i = 0; i<array.length; i++){
            if (array[i] <= minValue){
                minValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if(minValue == array[i]){
                indexValue = i;
            }
        }
        System.out.println("The Minimum Value is: " + minValue);
        System.out.println("The Minimum Value Index is: " + indexValue);
        return indexValue;
    }

    //findMax code
    public static int findMax(int [] array){
        int maxValue = array[0]; //setting it to first index, 'cause it has to start there then it'll go and compare the new values until it finds somethign smaller
        for (int i = 0; i<array.length; i++){
            if (array[i] >= maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("The Maximum Value is: " + maxValue);
        return maxValue;

    }

    //findMaxIndex code
    public static int findMaxIndex(int [] array){
        int indexValue = -1; //returns -1 if it isn't there
        int maxValue = array[0]; //setting it to first index, 'cause it has to start there then it'll go and compare the new values until it finds somethign smaller
        for (int i = 0; i<array.length; i++){
            if (array[i] <= maxValue){
                maxValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if(maxValue == array[i]){
                indexValue = i;
            }
        }
        System.out.println("The Maximum Value is: " + maxValue);
        System.out.println("The Maximum Value Index is: " + indexValue);
        return indexValue;
    } 

    //reverse code
    public static int [] reverse(int [] array){
        int [] reverseArray = new int[array.length];
        int reverseElement = 0; //starts at 0, and  then will add one in the code so that while it' going down from the last value in the array, it's adding it to said array and going up
        for(int i=0; i < array.length; i++){ //i=array.length-1 because we need it to start at our actual max index, otherwise it's trying to do it where it doesn't exisst
            reverseElement  = array.length - 1 - i; //it'll go down one in the index/array till it gets to the end 
            reverseArray[reverseElement] = array[i];
        }
        System.out.println("The Reverse Array is: " + Arrays.toString(reverseArray));
        return array;
    }

    //intersection code
    public static int [] intersection(int [] array, int [] array2){ //returns the numbers that appear in both arrays
        int [] intersectArray = new int [array.length];
        int arrayvalue;
        for (int i = 0; i < array.length; i++){
            arrayvalue = array[i];
            for (int k = 0; k < array2.length; i++){
                if (isElement(array2, arrayvalue) &! isElement(intersectArray, arrayvalue)){ //sees if the value is intersected then checks if its already in array, if not, it gets added
                    intersectArray[i] = arrayvalue;
                }
            }
        }
        System.out.println("The Intersection Array: " + Arrays.toString(intersectArray));
        return intersectArray;
    }

    //union code
    public static int [] union(int [] array, int [] array2){
        int [] combinedArray = new int[array.length*2];
        int index = 0;
        int value = 0;
        for(int i=0; i < array.length; i++){
            if(! isElement(combinedArray, array[i])){
                combinedArray[index] = array[i = value];              
                index ++;
            }
        }

        for(int i=0; i < array2.length; i++){
            if(! isElement(combinedArray, array2[i])){
                combinedArray[index] = array2[i = value];              
                index ++;
            }
        }

        return combinedArray;
    }

//tester codes

    //tester for copy
    public static void test_copy(){
        System.out.println("\n===== Starting Tester Code, copy() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: new Array with values 1, 2, 3, 4");
        System.out.println("Given result: " + Arrays.toString(copy(testingArray)));
        System.out.println("===== Ending Tester Code, copy() ===== \n");
    }

    //tester for addAll
    public static void test_addAll(){
        System.out.println("\n===== Starting Tester Code, addAll() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 10");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(addAll(testingArray));
        }
        System.out.println("===== Ending Tester Code, addAll() ===== \n");
    }

    //tester for addArray
    public static void test_addArray(){
        System.out.println("\n===== Starting Tester Code, addArray() ======");
        int [] testingArray = {1, 2, 3, 4, 5};
        int [] testingArray2 = {6, 7, 8, 9, 10};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray2));
        System.out.println("Expected value: New Array = {7, 9, 11, 13, 15");
        System.out.println("Given result: " + Arrays.toString(addArrays(testingArray, testingArray2)));
        System.out.println("===== Ending Tester Code, addArray() ===== \n");
    }

    //tester for multiplyAll
    public static void test_multiplyAll(){
        System.out.println("\n===== Starting Tester Code, multiplyAll() ======");
        int [] testingArray = {1, 2, 3, 4, 5};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 120");
        System.out.println("Given result: " + Arrays.toString(multiplyAll(testingArray)));
        System.out.println("===== Ending Tester Code, multiplyAll() ===== \n");
    }

    //tester for findAverage
    public static void test_findAverage(){
        System.out.println("\n===== Starting Tester Code, findAverage() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 2.5");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(findAverage(testingArray));
        }
        System.out.println("===== Ending Tester Code, findAverage() ===== \n");
    }

    //tester for isElement
    public static void test_isElement(){
        System.out.println("\n===== Starting Tester Code isElement() =====");
        int [] testingArray = {1, 2, 3, 4, 100};
        int value = testingArray[testingArray.length - 1]; //selecting an element from the array
        System.out.println("Testing isElement with value:" + value);
        System.out.println("Result: " + isElement(testingArray, value));//Expected to return true
    
        value = 100;
        System.out.println("Testing isElement with value:" + value);
        System.out.println("Result: " + isElement(testingArray, value));//Expected to return true
        System.out.println("===== Ending Tester Code isElement() =====\n");
    }
    
    //tester for swap
    public static void test_swap(){
        System.out.println("\n===== Starting Tester Code, swap() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: new Array with values 1, 2, 3, 4");
        System.out.println("Given result: " + Arrays.toString(copy(testingArray)));
        System.out.println("===== Ending Tester Code, swap() ===== \n");
    }

    //tester for indexOf
    public static void test_indexOf(){
        System.out.println("\n===== Starting Tester Code, indexOf() ======");
        int [] testingArray = {1, 2, 3, 4};
        int y = 2;
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: new Array with values 1, 2, 3, 4");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(indexOf(testingArray, y));
        }
        System.out.println("===== Ending Tester Code, indexOf() ===== \n");
    }

    //tester for findMin
    public static void test_findMin(){
        System.out.println("\n===== Starting Tester Code, findMin() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 1");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(findMin(testingArray));
        }
        System.out.println("===== Ending Tester Code, findMin() ===== \n");
    }

    //tester for findMinIndex
    public static void test_findMinIndex(){
        System.out.println("\n===== Starting Tester Code, findMinIndex() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 0");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(findMinIndex(testingArray));
        }
        System.out.println("===== Ending Tester Code, findMinIndex() ===== \n");
    }

    //tester for findMax
    public static void test_findMax(){
        System.out.println("\n===== Starting Tester Code, findMax() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 4");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(findMax(testingArray));
        }
        System.out.println("===== Ending Tester Code, findMax() ===== \n");
    }

    //tester for findMaxIndex
    public static void test_findMaxIndex(){
        System.out.println("\n===== Starting Tester Code, findMaxIndex() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: 3.");
        System.out.println("Given result: ");
        for(int i = 0; i < 1; i++){
            System.out.print(findMaxIndex(testingArray));
        }
        System.out.println("===== Ending Tester Code, findMaxIndex() ===== \n");
    }

    //tester for reverse
    public static void test_reverse(){
        System.out.println("\n===== Starting Tester Code, reverse() ======");
        int [] testingArray = {1, 2, 3, 4};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: Reverse Array: 4, 3, 2, 1");
        System.out.println("Given result: " + Arrays.toString(reverse(testingArray)));
        System.out.println("===== Ending Tester Code, reverse() ===== \n");
    }

    //tester for intersection
    public static void test_intersection(){
        System.out.println("\n===== Starting Tester Code, intersection() ======");
        int [] testingArray = {1, 2, 3, 4};
        int [] testingArray2 = {1, 5, 7, 2};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: Intersection Array: {2}");
        System.out.println("Given result: " + Arrays.toString(intersection(testingArray, testingArray2)));
        System.out.println("===== Ending Tester Code, intersection() ===== \n");
    }

    //tester for union
    public static void test_union(){
        System.out.println("\n===== Starting Tester Code, union() ======");
        int [] testingArray = {1, 2, 3, 4};
        int [] testingArray2 = {2, 19, 22, 8};
        System.out.println("TestingArray Values: " + Arrays.toString(testingArray));
        System.out.println("Expected value: Combined Array: {11, 3, 4, 19, 22, 8}");
        System.out.println("Given result: " + Arrays.toString(union(testingArray, testingArray2)));
        System.out.println("===== Ending Tester Code, union() ===== \n");
    }
    
    //main
    public static void main(String[] args){       
     //creating and initializing an input array for testing
        int [] array = {3, 4, 5, 12, 87, 31, 56, 32, 29, 1, 4, 5, 6, 7};
        int [] array2 = {5, 7, 4, 5, 22, 43, 32, 1, 35, 12, 13, 2, 5, 6};

        //Printing the array
        System.out.println("Array for testing: " + Arrays.toString(array));
    //     copy(array);
    //     // addAll(array);
    //     // addArrays(array, array);
    //     // multiplyAll(array);
    //     //findAverage(array);
    //     // reverse(array);
    //     // intersection(array, array2);
    //   //  swap(array, 1, 5);
    //     indexOf(array, 5);
    //     findMin(array);
    //     findMinIndex(array);
    //     findMax(array);
    //     findMaxIndex(array);

        test_copy();
        test_addAll();
        test_addArray();
        test_multiplyAll();
        test_findAverage();
        test_isElement();
        test_swap();
        test_indexOf();
        test_findMin();
        test_findMinIndex();
        test_findMax();
        test_findMaxIndex();
        test_intersection();
        test_union();
    
    }

}
