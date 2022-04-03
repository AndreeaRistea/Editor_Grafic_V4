package data;

public class FactoryPatrulatere extends AbstractFactory
{
	@Override
	public FiguraGeometrica creareFigura() 
	{
		return new Patrulater.Builder().build();
	}
	
}
