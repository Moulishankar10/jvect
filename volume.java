// JVECT.DIST SUBPACKAGE

// PACKAGE DEFINITION
package jvect.volume;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;

public class volume
{
    // FUNCTION TO FIND DOT PRODUCT
    public static int dot(int[] x, int[] y)
    {
        int dot_prod = 0;
        for(int i=0;i<3;i++) dot_prod += x[i]*y[i];
        return dot_prod;
    }

    // FUNCTION TO FIND CROSS PRODUCT
    public static int[] cross(int[] x,int[] y)
    {
        int[] cross_prod = new int[3];
        cross_prod[0] = x[1]*y[2] - x[2]*y[1];
        cross_prod[1] = (x[0]*y[2] - x[2]*y[0])*-1; 
        cross_prod[2] = x[0]*y[1] - x[1]*y[0];
        return cross_prod;
    }

    // FUNCTION TO FIND THE VOLUME OF A PARALLELOPIPED
    public static int parallelopiped(int[] x, int[] y, int[] z)
    {
        return Math.abs(dot(cross(x,y),z));
    }

    /*
    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args){
        int a[] = {10,2,4}, b[] = {4,2,6}, c[] = {-7,-6,-9}, d[] = {4,20,12}, b1[] = {1,2,-2,9}, b2[] = {2,4,-4,-6};      
        System.out.println(parallelopiped(a,b,c));
    }
    */
}
