namespace Calc
{
    class MultiplicationModel : CalcModel
    {
        public MultiplicationModel()
        {
            
        }
        public MultiplicationModel(double x, double y) : base(x, y){}

        public override double Result() => x * y;

        
       
    }
}