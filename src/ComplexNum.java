
public class ComplexNum
{
	//immutable number
	private double a;
	private double b;

	//calculated values for quick get
	private double r;
	private Double t;

	public ComplexNum(double a, double b)
	{
		this.a = a;
		this.b = b;
		r = setRadius();
		t = setTheta();
	}

	private Double setTheta()
	{
		if (a == 0)
			return null;

		return Math.atan(b / a); //TODO make sure this is correct for negative values
	}

	private double setRadius()
	{
		double aSquared = a * a;
		double bSquared = b * b;

		return Math.sqrt(aSquared + bSquared);
	}

	public double getA()
	{
		return a;
	}

	public double getB()
	{
		return b;
	}

	public double getRadius()
	{
		return r;
	}

	public Double getTheta()
	{
		return t;
	}

	public ComplexNum add(ComplexNum addend)
	{
		double newA = this.a + addend.a;
		double newB = this.b + addend.b;
		return new ComplexNum(newA, newB);
	}

	public ComplexNum subtract(ComplexNum subtrahend)
	{
		double newA = this.a - subtrahend.a;
		double newB = this.b - subtrahend.b;
		return new ComplexNum(newA, newB);
	}

	public ComplexNum multiply(ComplexNum multiplier)
	{
		double newA = (this.a * multiplier.a - this.b * multiplier.b);
		double newB = (this.a * multiplier.b + this.b * multiplier.a);
		return new ComplexNum(newA, newB);
	}

	public ComplexNum scale(double c)
	{
		double newA = this.a * c;
		double newB = this.b * c;
		return new ComplexNum(newA, newB);
	}

	public ComplexNum rotate(double i)
	{
		double newA = -this.a * i;
		double newB = this.b * i;
		return new ComplexNum(newA, newB);
	}

	@Override
	public String toString()
	{
		if (b >= 0)
			return a + " + " + b + "i";
		else
			return a + " - " + b + "i";
	}

	public static void main(String[] args)
	{

	}

}
