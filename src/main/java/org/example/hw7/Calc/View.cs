using Calc;

class View
{
    public double GetValue(string stringName)
    {
        Console.WriteLine(stringName);
        double value = Convert.ToDouble(Console.ReadLine());
        return value;
    }

    public string GetSign(string stringName)
    {
        Console.WriteLine(stringName);
        string sign = Console.ReadLine() ?? "0";
        return sign;
    }

    public void ShowResult(double result)
    {
        Console.WriteLine($"Результат вычисления: {result}");
    }


}