// JVECT.DIST SUBPACKAGE

// PACKAGE DEFINITION   
package pyvect.dist;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;

public class dist
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

    // FUNCTION TO FIND THE DISTANCE BETWEEN TWO PARALLEL LINES
    public static double pl_line(int[] a1, int[] a2, int[] u)
    {
        int arr[] = new int[3];
        for (int i = 0; i<3; i++) arr[i] = a2[i] - a1[i];
        double x = modVector(cross(u, arr));
        return x/modVector(u);
    }

    // FUNCTION TO FIND THE DISTANCE BETWEEN TWO SKEW LINES
    public static double sk_line(int[] a1, int[] a2, int[] u, int[] v)
    {
        int arr[] = new int[3];
        for (int i = 0; i<3; i++) arr[i] = a2[i] - a1[i];
        int x = arr[0]*(u[1]*v[2] - (u[2]*v[1])) - (arr[1]*(u[0]*v[2] - (u[2]*v[0]))) + (arr[2]*(u[0]*v[1] - (u[1]*v[0])));
        return Math.abs(x/modVector(cross(u,v)));
    }

    // FUNCTION TO FIND THE DISTANCE BETWEEN A POINT AND A PLANE
    public static double pt_plane(int x, int y, int z, int a, int b, int c, int d)
    {
        return Math.abs(((a*x)+(b*y)+(c*z)+d)/(Math.pow((a*a)+(b*b)+(c*c),0.5)));
    }

    // FUNCTION TO FIND THE DISTANCE BETWEEN THE ORIGIN AND A PLANE
    public static double or_plane(int a, int b, int c, int d)
    {
        return Math.abs(d/(Math.pow((a*a)+(b*b)+(c*c),0.5)));
    }
    

    /*
    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args){
        int a1[] = {1,2,3}, a2[] = {2,3,4}, u[] = {4,-2,5}, v[] = {2,8,7};
        System.out.println(or_plane(1,2,3,4));
    }
    */
    
}