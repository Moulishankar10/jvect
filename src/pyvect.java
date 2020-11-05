import java.lang.Math;

class pyvect
{
    public static int dot(int arr1[], int arr2[])
    {
        int dot_prod = 0, n = 3;
        for(int i=0;i<n;i++)
        {
            dot_prod = dot_prod + arr1[i]*arr2[i];
        }
        return dot_prod;
    }

    public static int[] cross(int arr1[],int arr2[])
    {
        int cross_prod[] = {0,0,0};
        cross_prod[0] = arr1[1]*arr2[2] - arr1[2]*arr2[1];
        cross_prod[1] = arr1[2]*arr1[0] - arr1[0]*arr2[2];
        cross_prod[2] = arr1[0]*arr2[1] - arr1[1]*arr2[0];
        return cross_prod;
    }

    public static double modVector(int arr[])
    {
        double mod = Math.sqrt((arr[0]^2)+(arr[1]^2)+(arr[2]^2));
        return mod;
    }

    public static double angle(int arr1[],int arr2[])
    {
        double ang = Math.acos((dot(arr1,arr2))/(modVector(arr1)*modVector(arr2)));
        return ang;
    }

    public static double projection(int arr1[], int arr2[])
    {
        double mod = modVector(arr2);
        double proj = dot(arr1,arr2)/mod;
        return proj;
    }

    public static Boolean isPerpendicular(int arr1[], int arr2[])
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

    public static Boolean isCollinear(int arr1[], int arr2[])
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

    public static double[] unitNormal(int arr1[],int arr2[])
    {   
        int cross_prod[] = cross(arr1,arr2);
        double u_norm[] = unitVector(cross_prod);
        return u_norm;
    }

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

    public static double[] positionVector(int arr1[],int arr2[])
    {
        double pos[] = {0,0,0};
        for(int i=0;i<3;i++)
        {
            pos[i] = 0.5*(arr1[i]+arr2[i]);
        }
        return pos;
    }

    public static Boolean isCoplanar(int arr1[],int arr2[],int arr3[])
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
}
