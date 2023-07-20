namespace Calc
{
    class DivisionModel : CalcModel
    {
        public DivisionModel()
        {
            
        }
        public DivisionModel(double x, double y) : base(x, y){}

        public override double Result()
        {
            if (y == 0)
            {
                Console.WriteLine("На ноль делить нельзя!");
            }
            return x / y;
        }  
      
       
    }
}