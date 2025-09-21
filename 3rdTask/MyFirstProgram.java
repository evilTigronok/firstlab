class MyFirstClass {
    public static void main(String[] args)
    {
        MySecondClass o = new MySecondClass(2,7);
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

class MySecondClass {
    private int num1; //Объявление приватных полей int
    private int num2;

    public int getNum1() //Получение значений
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }

    public void setNum1(int new1) //Модификация значений
    {
        this.num1=new1;
    }
    public void setNum2(int new2)
    {
        this.num2=new2;
    }

    public MySecondClass(int f, int s) //Конструктор
    {
        this.num1=f;
        this.num2=s;
    }

    public int maximum() //Функция поиска максимума
    {
        return Math.max(num1, num2);
    }
}