import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //ex 1
        int[] m1 = new int[3];
        for (byte i = 0; i < m1.length; i++)
        {
            m1[i] = i+1;
        }
        float[] m2 = {1.57f, 7.654f, 9.986f};
        byte[] m3 = {5, 6, 3, 6, 2, 7, 98};

        //ex2
        System.out.print(m1[0] +", "+m1[1] +", "+m1[2]);
        System.out.println();

        for (int i = 0; i < m2.length; i++)
        {
            System.out.print(m2[i]);
            if (i!= m2.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < m3.length-1; i++)
        {
            System.out.print(m3[i] + ", ");
        }
        System.out.println(m3[m3.length-1]);

        //ex3
        System.out.println();
        for (int i = m1.length-1; i >0; i--)
        {
            System.out.print(m1[i] + ", ");
        }
        System.out.println(m1[0]);

        for (int i = m2.length-1; i >0; i--)
        {
            System.out.print(m2[i] + ", ");
        }
        System.out.println(m2[0]);

        for (int i = m3.length-1; i >0; i--)
        {
            System.out.print(m3[i] + ", ");
        }
        System.out.println(m3[0]);

        //ex4
        System.out.println();
        for (int i = 0; i < m1.length; i++)
        {
            if (m1[i]%2!=0){
                m1[i] +=1;
            }
        }
        System.out.println(Arrays.toString(m1));

    }
}