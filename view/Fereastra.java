package view;
import javax.swing.*;
import data.Cerc;
import data.Dreapta;
import data.FactoryCercuri;
import data.FactoryDrepte;
import data.FactoryPatrulatere;
import data.FactoryPoligoane;
import data.FactoryTriunghiuri;
import data.FiguraGeometrica;
import data.GestiuneFiguriGeometrice;
import data.Patrulater;
import data.Poligon;
import data.Punct;
import data.Triunghi;
import view.Observer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.text.View;

import XML.Load;
import XML.Save;

import java.io.*;
import java.util.*;

public class Fereastra extends JFrame implements ActionListener
{
	  private GestiuneFiguriGeometrice g;
	  private static final long serialVersionUID = 1L;
	  private JTextField setX; 
	  private JTextField setY;
	  private JTextField setX2; 
	  private JTextField setY2;
	  private JButton update;
	  private JButton btnlinie;
	  //private JButton btnpatrulater;
	  
	  private JPanel components = new JPanel( new GridLayout( 2, 6 ) );
	  private JPanel canv = new JPanel( new GridLayout( 1,0 ) );
	  private Font f = new Font( "Trebuchet MS", Font.BOLD, 12 );
	  private Font f2 = new Font( "Trebuchet MS", Font.PLAIN, 12 );
	  private Dreapta d;
	  public Fereastra ()
	  {
		    super();
		    g = GestiuneFiguriGeometrice.CreareGestiune();
		    this.init();
	        this.setSize( new Dimension(600,900));
	        this.setTitle( "Figuri Geometrice" );
	        this.setVisible(true);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    }
	  public void init()
	  {

	     Container c = this.getContentPane();
	     c.setLayout( new GridLayout( 5, 1 ) );
	     
	     FactoryDrepte drepte = new FactoryDrepte();
	     Dreapta d = (Dreapta) drepte.creareFigura();
	     g.AdaugaFigura(d);
	     g.Adauga(d);
	     canv.add(d);
	     Punct p1 = new Punct.Builder().doX(100).doY(200).build();
	     Punct p2 = new Punct.Builder().doX(200).doY(300).build();
	     Dreapta d1 = new Dreapta.Builder().doPointStart(p1).doPointFinish(p2).build();
	     d1 = (Dreapta) drepte.creareFigura();
	     g.AdaugaFigura(d1);
	     g.Adauga(d1);
	     canv.add(d1);
	     
	     FactoryTriunghiuri triunghiuri = new FactoryTriunghiuri();
	     Triunghi t = (Triunghi) triunghiuri.creareFigura();
	     g.AdaugaFigura(t);
	     g.Adauga(t);
	     canv.add(t);
	     
	     FactoryCercuri cercuri = new FactoryCercuri();
	     Cerc cer = (Cerc) cercuri.creareFigura();
	     g.AdaugaFigura(cer);
	     g.Adauga(cer);
	     canv.add(cer);
	     
	     FactoryPatrulatere patrulatere = new FactoryPatrulatere();
	     Patrulater p = (Patrulater) patrulatere.creareFigura();
	     g.AdaugaFigura(p);
	     g.Adauga(p);
	     canv.add(p);
	     
	     FactoryPoligoane poligoane = new FactoryPoligoane();
	     Poligon pol = (Poligon) poligoane.creareFigura();
	     g.AdaugaFigura(pol);
	     g.Adauga(pol);
	     canv.add(pol);
	     
         c.add(canv);
         c.add(components);
         
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == update)
		{
			try {
				d.update();
			} catch(Exception ex) {}
		
		}
	}
	public static void main (String args[])
	{
		Fereastra fereastra = new Fereastra();
		fereastra.setVisible(true);
	}
}
	

