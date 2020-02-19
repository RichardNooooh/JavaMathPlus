
public class ComplexNum
{
	//immutable number
	private double a;
	private double b;

	//calculated values for quick get
	private double r;
	private double t;

	public ComplexNum(double a, double b)
	{
		this.a = a;
		this.b = b;
		r = setRadius();
		t = setTheta();
	}

	private double setTheta()
	{
		return Math.tan(b / a); //TODO make sure this is correct for negative values
	}

	private double setRadius()
	{
		double aSquared = a * a;
		double bSquared = b * b;

		return Math.sqrt(aSquared + bSquared);
	}

	public static void main(String[] args)
	{

	}

}
