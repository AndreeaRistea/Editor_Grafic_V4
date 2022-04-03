package data;

public class FactoryTriunghiuri extends AbstractFactory
{
	@Override
	public FiguraGeometrica creareFigura()
	{
		return new Triunghi.Builder().build();
	}
}
