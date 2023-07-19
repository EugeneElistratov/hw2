namespace Calc
{
    abstract class CalcModel : IModel
    {
        public double x;
        public double y;

        public CalcModel()
        {
            
        }

        public CalcModel(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

            public abstract double Result();

        

    }
}