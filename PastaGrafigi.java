
import java.awt.*;
import org.jfree.chart.*;
import org.jfree.chart.title.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.*;

public class PastaGrafigi{
public static void main(String arg[]){
  DefaultPieDataset pieDataset = new DefaultPieDataset();
  pieDataset.setValue("Youtube", new Integer(92));
  pieDataset.setValue("Instagram", new Integer(84));
  pieDataset.setValue("Whatsapp", new Integer(83));
  pieDataset.setValue("Facebook", new Integer(82));
  pieDataset.setValue("Twitter", new Integer(58));
  pieDataset.setValue("Mesenger", new Integer(57));
  pieDataset.setValue("Skype", new Integer(31));
  pieDataset.setValue("Snapchat", new Integer(30));
  pieDataset.setValue("LinkedIn", new Integer(28));
  pieDataset.setValue("Pinterest", new Integer(25));
  
  JFreeChart chart = ChartFactory.createPieChart
 ("ÜLKEMÝZDE EN ÇOK KULLANILAN SOSYAL MEDYA UYGULAMALARI VE ORANLARI", pieDataset, true,true,true);

  ChartFrame frame1=new ChartFrame("Pie Chart",chart);
  frame1.setVisible(true);
  frame1.setSize(300,300);
  }
public void start() {
	DefaultPieDataset pieDataset = new DefaultPieDataset();
	  pieDataset.setValue("Youtube", new Integer(92));
	  pieDataset.setValue("Instagram", new Integer(84));
	  pieDataset.setValue("Whatsapp", new Integer(83));
	  pieDataset.setValue("Facebook", new Integer(82));
	  pieDataset.setValue("Twitter", new Integer(58));
	  pieDataset.setValue("Mesenger", new Integer(57));
	  pieDataset.setValue("Skype", new Integer(31));
	  pieDataset.setValue("Snapchat", new Integer(30));
	  pieDataset.setValue("LinkedIn", new Integer(28));
	  pieDataset.setValue("Pinterest", new Integer(25));
	  
	  JFreeChart chart = ChartFactory.createPieChart
	 ("ÜLKEMÝZDE EN ÇOK KULLANILAN SOSYAL MEDYA UYGULAMALARI VE ORANLARI", pieDataset, true,true,true);

	  ChartFrame frame1=new ChartFrame("Pie Chart",chart);
	  frame1.setVisible(true);
	  frame1.setSize(300,300);
	
}
}