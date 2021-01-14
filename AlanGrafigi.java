import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.plot.*;

public class AlanGrafigi {
	
	public static void main(String arg[]){
		  DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		  dataset.addValue(8.86, "Karadeniz", "2016");
		  dataset.addValue(4.48, "Ýç Anadolu", "2016");
		  dataset.addValue(6.20, "Karadeniz", "2017");
		  dataset.addValue(3.54,"Ýç Anadolu", "2017");
		  dataset.addValue(7.12, "Karadeniz", "2018");
		  dataset.addValue(4.50, "Ýç Anadolu", "2018");
		  dataset.addValue(6.10, "Karadeniz", "2019");
		  dataset.addValue(3.23, "Ýç Anadolu", "2019");

		  JFreeChart chart = ChartFactory.createAreaChart
		   ("KARADENÝZ VE ÝÇ ANADOLU BÖLGESÝ SON 4 YILLIK YAÐIÞ MÝKTARI","YILLAR", "YAÐIÞ MÝKTARI",
		    dataset, PlotOrientation.VERTICAL, true,true, false);
		  chart.setBackgroundPaint(Color.white);
		  chart.getTitle().setPaint(Color.blue); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setForegroundAlpha(0.7f);
		  p.setRangeGridlinePaint(Color.red); 
		  p.setDomainGridlinesVisible(true);
		  p.setDomainGridlinePaint(Color.black);
		  CategoryItemRenderer renderer = p.getRenderer();
		  renderer.setSeriesPaint(1, Color.red);
		  renderer.setSeriesPaint(0, Color.green);
		  ChartFrame frame1=new ChartFrame("Area Chart",chart);
		  frame1.setVisible(true);
		  frame1.setSize(300,300);
		  
	}

	public void start() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		  dataset.addValue(8.86, "Karadeniz", "2016");
		  dataset.addValue(4.48, "Ýç Anadolu", "2016");
		  dataset.addValue(6.20, "Karadeniz", "2017");
		  dataset.addValue(3.54,"Ýç Anadolu", "2017");
		  dataset.addValue(7.12, "Karadeniz", "2018");
		  dataset.addValue(4.50, "Ýç Anadolu", "2018");
		  dataset.addValue(6.10, "Karadeniz", "2019");
		  dataset.addValue(3.23, "Ýç Anadolu", "2019");

		  JFreeChart chart = ChartFactory.createAreaChart
		   ("KARADENÝZ VE ÝÇ ANADOLU BÖLGESÝ SON 4 YILLIK YAÐIÞ MÝKTARI","YILLAR", "YAÐIÞ MÝKTARI",
		    dataset, PlotOrientation.VERTICAL, true,true, false);
		  chart.setBackgroundPaint(Color.white);
		  chart.getTitle().setPaint(Color.blue); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setForegroundAlpha(0.7f);
		  p.setRangeGridlinePaint(Color.red); 
		  p.setDomainGridlinesVisible(true);
		  p.setDomainGridlinePaint(Color.black);
		  CategoryItemRenderer renderer = p.getRenderer();
		  renderer.setSeriesPaint(1, Color.red);
		  renderer.setSeriesPaint(0, Color.green);
		  ChartFrame frame1=new ChartFrame("Area Chart",chart);
		  frame1.setVisible(true);
		  frame1.setSize(300,300);
	}
	
	
	
}
