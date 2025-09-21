import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] args)
    {
        MyFirstPackage o = new MyFirstPackage(2,7);
        System.out.println(o.maximum());
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 1; j <= 8; j++)
            {
                o.setNum1(i);
                o.setNum2(j);
                System.out.print(o.maximum());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
