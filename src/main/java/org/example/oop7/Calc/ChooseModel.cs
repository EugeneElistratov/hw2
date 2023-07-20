using Calc;
using System.Collections;

class ChooseModel 
{    
    public IModel ChooseMod(string sign, List<double> operandList)
    { 
        
        IModel? myAction = null;

        switch (sign) 
        {
            case "*":
                myAction = new MultiplicationModel(operandList[0], operandList[1]);
                break;
            case "/":
                myAction = new DivisionModel(operandList[0], operandList[1]);
                break;
            case "+":
                myAction = new SumModel(operandList[0], operandList[1]);
                break;
            case "-":
                myAction = new SubtractionModel(operandList[0], operandList[1]);
                break;
        }
        return myAction;
    }

}