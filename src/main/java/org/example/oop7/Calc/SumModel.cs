namespace Calc
{
    class SumModel : CalcModel
    {
        public SumModel()
        {
        }

        public SumModel(double x, double y) : base(x, y){}

        public override double Result() => x + y; 

        
       
       
    }
}