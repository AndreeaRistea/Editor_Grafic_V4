package data;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;



public class Punct extends FiguraGeometrica
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	int y;
	
	public static class Builder
	{
		int x;
		int y;
		public Builder doX (int x)
		{
			this.x = x;
			return this;
		}
		public Builder doY (int y)
		{
			this.y = y;
			return this;
		}
		public Punct build()
		{
			return new Punct();
		}
	}
	
	private Punct()
	{
	}
	private Punct(int x1, int y1)
	{
		this.x = x1;
		this.y = y1;
	}
	private Punct(Builder b)
	{
		this.x = b.x;
		this.y = b.y;
	}
	public void setPunct (Punct a)
	{
		this.x = a.x;
		this.y = a.y;
	}
	public Punct getPunct (Punct a)
	{
		return a;
	}
	public void paint (Graphics g1)
	{
		Graphics2D g2d = (Graphics2D)g1;
		int r,g,b;
		r = ( int )( Math.random() * 256 );
        g = ( int )( Math.random() * 256 );
        b = ( int )( Math.random() * 256 );
        g2d.setColor(new Color(r,g,b));
        g2d.drawLine (x,y,x,y);
	}
}
