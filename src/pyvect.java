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

    public static double mod_vector(int arr[])
    {
        double mod = Math.sqrt((arr[0]^2)+(arr[1]^2)+(arr[2]^2));
        return mod;
    }

    public static double angle(int arr1[],int arr2[])
    {
        double ang = Math.acos((dot(arr1,arr2))/(mod_vector(arr1)*mod_vector(arr2)));
        return ang;
    }

    public static double projection(int arr1[], int arr2[])
    {
        double mod = mod_vector(arr2);
        double proj = dot(arr1,arr2)/mod;
        return proj;
    }
}
