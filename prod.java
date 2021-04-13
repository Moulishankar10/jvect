// JVECT.PROD SUBPACKAGE

// PACKAGE DEFINITION
package jvect.prod;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;

public class prod
{
    // FUNCTION TO FIND DOT PRODUCT
    public static int dot(int x[], int y[])
    {
        int dot_prod = 0;
        for(int i=0;i<3;i++) dot_prod += x[i]*y[i];
        return dot_prod;
    }

    // FUNCTION TO FIND CROSS PRODUCT
    public static int[] cross(int x[],int y[])
    {
        int[] cross_prod = new int[3];
        cross_prod[0] = x[1]*y[2] - x[2]*y[1];
        cross_prod[1] = x[2]*y[0] - x[0]*y[2];
        cross_prod[2] = x[0]*y[1] - x[1]*y[0];
        return cross_prod;
    }

    // FUNCTION TO FIND MODULUS OF A VECTOR
    public static double modVector(int arr[])
    {
        return Math.sqrt((arr[0]*arr[0])+(arr[1]*arr[1])+(arr[2]*arr[2]));
    }

    // FUNCTION TO FIND SCALAR TRIPLE PRODUCT FOR THE GIVEN THREE VECTORS
    public static int s3(int[] x, int[] y, int[] z)
    {
        return dot(cross(x,y),z);
    }

    // FUNCTION TO FIND SCALAR PRODUCT FOR THE GIVEN FOUR VECTORS
    public static int s4(int[] w, int[] x, int[] y, int[] z)
    {
        return dot(cross(w,x),cross(y,z));
    }

    // FUNCTION TO FIND VECTOR TRIPLE PRODUCT FOR THE GIVEN THREE VECTORS
    public static int[] v3(int[] x, int[] y, int[] z)
    {
        return cross(cross(x,y),z);
    }

    // FUNCTION TO FIND SCALAR PRODUCT FOR THE GIVEN FOUR VECTORS
    public static int[] v4(int[] w, int[] x, int[] y, int[] z)
    {
        return cross(cross(w,x),cross(y,z));
    }

    
    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args){
        int a1[] = {1,2,3}, a2[] = {2,3,4}, a3[] = {4,2,8}, a4[] = {3,4,8};
        int[] arr = v4(a1,a2,a3,a4);
        System.out.println(Arrays.toString(arr));
    }
    
}
