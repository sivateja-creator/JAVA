class Hello
{
    int add(int a, int b)
    {
        return a + b;
    }
}

public class Best1
{
    public static void main(String[] args)
    {
        Hello op = new Hello();
        int result = op.add(5, 6);
        System.out.println("Sum = " + result);
    }
}
