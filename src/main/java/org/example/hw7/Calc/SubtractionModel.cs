namespace Calc
{
    class SubtractionModel : CalcModel
    {
        public SubtractionModel()
        {
            
        }
        public SubtractionModel(double x, double y) : base(x, y){}

        public override double Result() => x - y;

      
       
    }
}