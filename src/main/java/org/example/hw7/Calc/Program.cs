namespace Calc;

public class Program
{

    public static void Main(string[] args) 
    {
        Presenter presenter = new Presenter(new View (), new ChooseModel());     

        presenter.ButtonClick();
    

    }
}