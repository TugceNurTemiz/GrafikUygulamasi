import java.awt.event.ActionEvent;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.*;
import org.jfree.data.*;

public class CizgiGrafigi{
public static void main(String arg[]){
  XYSeries series = new XYSeries("Ýþsizlik Oraný");
  
  series.add(2011, 11.1);
  series.add(2012, 9.6);
  series.add(2013, 9.8);
  series.add(2014, 10.2);
  series.add(2015, 11.3);
  series.add(2016, 11.1);
  series.add(2017, 13.4);
  series.add(2018, 10.8);
  series.add(2019, 14.6);
  series.add(2020, 13.8);
  
  XYDataset xyDataset = new XYSeriesCollection(series);
  JFreeChart chart = ChartFactory.createXYLineChart
  ("SON 10 YILIN ÝÞSÝZLÝK ORANLARI", "YILLAR", "ÝÞSÝZLÝK ORANI",
 xyDataset, PlotOrientation.VERTICAL, true, true, false);
  ChartFrame frame1=new ChartFrame("XYLine Chart",chart);
  frame1.setVisible(true);
  frame1.setSize(300,300);
  }

public void start() {
	XYSeries series = new XYSeries("Ýþsizlik Oraný");
	  
	  series.add(2011, 11.1);
	  series.add(2012, 9.6);
	  series.add(2013, 9.8);
	  series.add(2014, 10.2);
	  series.add(2015, 11.3);
	  series.add(2016, 11.1);
	  series.add(2017, 13.4);
	  series.add(2018, 10.8);
	  series.add(2019, 14.6);
	  series.add(2020, 13.8);
	  
	  XYDataset xyDataset = new XYSeriesCollection(series);
	  JFreeChart chart = ChartFactory.createXYLineChart
	  ("SON 10 YILIN ÝÞSÝZLÝK ORANLARI", "YILLAR", "ÝÞSÝZLÝK ORANI",
	 xyDataset, PlotOrientation.VERTICAL, true, true, false);
	  ChartFrame frame1=new ChartFrame("XYLine Chart",chart);
	  frame1.setVisible(true);
	  frame1.setSize(300,300);
}

}