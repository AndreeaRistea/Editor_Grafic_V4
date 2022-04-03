package data;

public class FactoryDrepte extends AbstractFactory
{
	@Override
	public FiguraGeometrica creareFigura() 
	{
		return new Dreapta.Builder().build();
	}
}
