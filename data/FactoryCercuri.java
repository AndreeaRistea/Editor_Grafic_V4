package data;

public class FactoryCercuri extends AbstractFactory
{
	@Override
	public FiguraGeometrica creareFigura() 
	{
		return new Cerc.Builder().build();
	}

}
