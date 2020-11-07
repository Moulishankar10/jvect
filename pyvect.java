// PACKAGE DEFINITION
package pyvect;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;

// PYVECT MAIN CLASS
public class pyvect
{

    // FUNCTION TO FIND DOT PRODUCT
    public static int dot(int arr1[], int arr2[])
    {
        int dot_prod = 0;
        for(int i=0;i<3;i++)
        {
            dot_prod = dot_prod + arr1[i]*arr2[i];
        }
        return dot_prod;
    }

    // FUNCTION TO FIND CROSS PRODUCT
    public static int[] cross(int arr1[],int arr2[])
    {
        int cross_prod[] = {0,0,0};
        cross_prod[0] = arr1[1]*arr2[2] - arr1[2]*arr2[1];
        cross_prod[1] = arr1[2]*arr1[0] - arr1[0]*arr2[2];
        cross_prod[2] = arr1[0]*arr2[1] - arr1[1]*arr2[0];
        return cross_prod;
    }

    // FUNCTION TO FIND MODULUS OF A VECTOR
    public static double modVector(int arr[])
    {
        double mod = Math.sqrt((arr[0]^2)+(arr[1]^2)+(arr[2]^2));
        return mod;
    }

    // FUNCTION TO FIND ANGLE BETWEEN TWO VECTORS
    public static double angle(int arr1[],int arr2[])
    {
        double ang = Math.acos((dot(arr1,arr2))/(modVector(arr1)*modVector(arr2)));
        return ang;
    }

    // FUNCTION TO FIND PROJECTION OF A VECTOR OVER ANOTHER
    public static double projection(int arr1[], int arr2[])
    {
        double mod = modVector(arr2);
        double proj = dot(arr1,arr2)/mod;
        return proj;
    }

    // FUNCTION TO FIND IF TWO VECTORS ARE PERPENDICULAR
    public static boolean isPerpendicular(int arr1[], int arr2[])
    {
        if (dot(arr1,arr2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // FUNCTION TO FIND IF TWO VECTORS ARE COLLINEAR
    public static boolean isCollinear(int arr1[], int arr2[])
    {
        int res[] = cross(arr1,arr2);
        if ((res[0]==0)||(res[1]==0)||(res[2]==0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // FUNCTION TO FIND UNIT VECTOR
    public static double[] unitVector(int arr[])
    {
        double unit[] = {0,0,0};
        double mod = modVector(arr);
        for(int i=0;i<3;i++)
        {
            unit[i] = unit[i]/mod;
        }
        return unit;
    }

    // FUNCTION TO FIND UNIT NORMAL 
    public static double[][] unitNormal(int arr1[],int arr2[])
    {   
        int cross_prod[] = cross(arr1,arr2);
        double u_norm[] = unitVector(cross_prod);
        double u_norm_inv[] = new double[3];
        for (int i=0;i<3;i++)
        {
            u_norm_inv[i] = u_norm[i]*-1;
        }
        return new double[][] {u_norm,u_norm_inv};
    }

    // FUNCTION TO FIND BISECTOR OF TWO VECTORS
    public static double[] bisector(int arr1[],int arr2[])
    {
        double bsect[] = {0,0,0};
        double unit_a[] = unitVector(arr1);
        double unit_b[] = unitVector(arr2);
        for (int i=0;i<3;i++)
        {
            bsect[i] = unit_a[i]+unit_b[i];
        }
        return bsect;
    }

    // FUNCTION TO FIND POSITION VECTOR
    public static double[] positionVector(int arr1[],int arr2[])
    {
        double pos[] = {0,0,0};
        for(int i=0;i<3;i++)
        {
            pos[i] = 0.5*(arr1[i]+arr2[i]);
        }
        return pos;
    }

    // FUNCTION TO FIND IF TWO VECTORS ARE COPLANAR
    public static boolean isCoplanar(int arr1[],int arr2[],int arr3[])
    {
        int cop = dot(cross(arr1,arr2),arr3);
        if (cop == 0)
        {
            return true;
        } 
        else
        {
            return false;
        }
    }

    // FUNCTION TO FIND RECIPROCAL OF THREE VECTORS
    public static double[][] reciprocal(int arr1[],int arr2[],int arr3[])
    {
        double rec1[] = {0,0,0};
        double rec2[] = {0,0,0};
        double rec3[] = {0,0,0};
        int c1[] = cross(arr2,arr3);
        int c2[] = cross(arr3,arr1);
        int c3[] = cross(arr1,arr2);
        int d = dot(cross(arr1,arr2),arr3);
        for (int i=0;i<3;i++)
        {
            rec1[i] = c1[i]/d;
            rec2[i] = c2[i]/d;
            rec3[i] = c3[i]/d;
        }
        return new double[][] {rec1,rec2,rec3};
    }

    // FUNCTION TO FIND THE MAXIMUM VALUE OF ANY TWO VECTORS
    public static double maxValue(int arr1[],int arr2[])
    {
        return modVector(arr1)*modVector(arr2);
    }

    // FUNCTION TO FIND THE MINIMUM VALUE OF ANY TWO VECTORS
    public static double minValue(int arr1[],int arr2[])
    {
        return -1.0*(modVector(arr1)*modVector(arr2));
    }

    // MAIN FUNCTION
    /*public static void main(String[] args) 
    {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        double res[][] = unitNormal(a,b);
       System.out.print(res);
    }

    */
}
