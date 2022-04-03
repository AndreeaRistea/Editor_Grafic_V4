package data;

public class FactoryPoligoane extends AbstractFactory
{
	@Override
	public FiguraGeometrica creareFigura() 
	{
		return new Poligon.Builder().build();
	}
}
