package myfirstpackage;

public class MyFirstPackage { //Переименован класс (чтобы по названию совпадал с названием программы)
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

    public MyFirstPackage (int f, int s) //Конструктор
    {
        this.num1=f;
        this.num2=s;
    }

    public int maximum() //Функция поиска максимума
    {
        return Math.max(num1, num2);
    }
}