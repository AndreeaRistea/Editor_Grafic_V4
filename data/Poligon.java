package data;

import java.awt.Color;
import java.awt.Graphics;


public class Poligon extends FiguraGeometrica 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Punct puncte[];
	int nr_varfuri;
	public static class Builder
	{
		Punct puncte[];
		int nr_varfuri;
		public Builder doNoVertices (int nr)
		{
			this.nr_varfuri = nr;
			return this;
		}
		public Builder doVertices (Punct puncte[])
		{
			for (int i = 0; i<nr_varfuri; i++)
			{
				this.puncte[i] = puncte[i];
			}
			return this;
		}
		public Poligon build()
		{
			return new Poligon();
		}
	}
	private Poligon()
	{
		puncte = new Punct[100];
	}
	public void paint(Graphics g1)
	{
		int r,g,b1;
		r = ( int )( Math.random() * 256 );
        g = ( int )( Math.random() * 256 );
        b1 = ( int )( Math.random() * 256 );
        int numarVarfuri = 6;
        int []x = {40,50,110,140,50,60};
		int []y = {140,110,90,100,30,40};
		g1.setColor(new Color(r,g,b1));
		g1.fillPolygon(x,y,numarVarfuri);
	}
	
	
}
