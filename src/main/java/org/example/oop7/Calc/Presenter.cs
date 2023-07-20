using Calc;


class Presenter
{
    View myView;
    ChooseModel myModel;
    

    
    public Presenter(View myView, ChooseModel myModel) 
    {
        this.myView = myView;
        this.myModel = myModel;
                
    }

    public void ButtonClick()
    {
        double a = myView.GetValue("Введите первое число: ");
        string sign = myView.GetSign("Знак вычисления: ");
        double b = myView.GetValue("Введите второе число: ");

        List<double> operandList = new List<double>();
        operandList.Add(a);
        operandList.Add(b);
        
        double result = myModel.ChooseMod(sign, operandList).Result();
       
        myView.ShowResult(result);
        
     
    }
}