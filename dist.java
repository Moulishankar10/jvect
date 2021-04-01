package pyvect.dist;

public class dist
{
    public static double[] pl_line(int[] a1, int[] a2, int[] u)
    {
        int arr[] = new int[3];
        for (int i = 0; i<3; i++) arr[i] = a2[i] - a1[i];
        double x = modVector(cross(u, arr));
        return x/modVector(u);
    }

    public static void main(String[] args){
        int a1[] = {1,2,3}, a2[] = {2,3,4}, u[] = {5,6,7};
        System.out.println(pl_line(a1,a2,u));
    }
}