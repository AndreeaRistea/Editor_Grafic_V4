package data;

import java.awt.Color;
import java.awt.Graphics;



public class Cerc extends FiguraGeometrica 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Punct c;
	int r;
	public static class Builder
	{
		Punct c;
		int r;
		public Builder doRadius (int r)
		{
			this.r = r;
			return this;
		}
		public Builder doCenter (Punct c)
		{
			this.c = c;
			return this;
		}
		public Cerc build()
		{
			return new Cerc();
		}
	}
	private Cerc()
	{
		c = new Punct.Builder().build();
	}
	private Cerc(Punct c, int r)
	{
		this.c = c;
		this.r = r;
	}
	public void paint(Graphics g1)
	{
		int r1,g,b1;
		r1 = ( int )( Math.random() * 256 );
        g = ( int )( Math.random() * 256 );
        b1 = ( int )( Math.random() * 256 );
        g1.setColor(new Color(r1,g,b1));
        c.x = 200;
        c.y = 100;
        r = 100;
        c.x = c.x - (r/2);
        c.y = c.y - (r/2);
        g1.fillOval(c.x, c.y, r, r);
       // g1.fillOval(100, 100, 50, 50);
	}
	public boolean setVisiblie() {
		return true;
	}
}
