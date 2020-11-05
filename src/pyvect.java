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

    public static double angle(int arr1[],int arr2[])
    {
        double mod_a = Math.sqrt((arr1[0]^2)+(arr1[1]^2)+(arr1[2]^2));
        double mod_b = Math.sqrt((arr2[0]^2)+(arr2[1]^2)+(arr2[2]^2));
        double ang = Math.acos((dot(arr1,arr2))/(mod_a*mod_b));
        return ang;
    }
}
