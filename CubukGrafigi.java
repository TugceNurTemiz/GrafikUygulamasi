import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;

public class CubukGrafigi extends JFrame {

    public CubukGrafigi() {

        initUI();
    }

    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Bar chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset() {

        var dataset = new DefaultCategoryDataset();
        dataset.setValue(159, "KADIN SAYISI", "MARMARA");
        dataset.setValue(56, "KADIN SAYISI", "KARADENÝZ");
        dataset.setValue(82, "KADIN SAYISI", "ÝÇ ANADOLU");
        dataset.setValue(39, "KADIN SAYISI", "DOÐU ANADOLU");
        dataset.setValue(77, "KADIN SAYISI", "EGE");
        dataset.setValue(94, "KADIN SAYISI", "AKDENÝZ");
        dataset.setValue(57, "KADIN SAYISI", "GÜNEYDOÐU ANADOLU");

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "BÖLGELERE GÖRE KADIN CÝNAYETÝ SAYISI",
                "",
                "KADIN SAYISI",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new CubukGrafigi();
            ex.setVisible(true);
        });
    }

	public void start() {
		EventQueue.invokeLater(() -> {

            var ex = new CubukGrafigi();
            ex.setVisible(true);
        });
	}
}