package org.eigenfield;

public class MyLib {
    public static void main(String args[])
    {
        MyLib obj = new MyLib();
        int sum = obj.addNum(3,4);
        System.out.println("sum = " + sum);
    }

    public int addNum(int a, int b)
    {
        return a + b;
    }
}
