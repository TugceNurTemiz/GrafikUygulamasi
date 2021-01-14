import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class IkiSeriliCizgiGrafigi extends JFrame {

    public IkiSeriliCizgiGrafigi() {

        initUI();
    }

    private void initUI() {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        
        add(chartPanel);

        pack();
        setTitle("Line chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private XYDataset createDataset() {

        var series1 = new XYSeries("AYÞE");
        series1.add(1, 50);
        series1.add(2, 44);
        series1.add(3, 62);
        series1.add(4, 78);
        series1.add(5, 89);
        series1.add(6, 55);
        series1.add(7, 59);
        series1.add(8, 74);
        series1.add(9, 87);
        series1.add(10, 84);

        var series2 = new XYSeries("AHMET");
        series2.add(1, 42);
        series2.add(2, 53);
        series2.add(3, 58);
        series2.add(4, 67);
        series2.add(5, 84);
        series2.add(6, 62);
        series2.add(7, 40);
        series2.add(8, 70);
        series2.add(9, 85);
        series2.add(10, 80);

        var dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

        return dataset;
    }

    private JFreeChart createChart(final XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "AYÞE VE AHMET'ÝN SON 10 DENEMEDEKÝ NET SAYILARI",
                "DENEME",
                "NET SAYISI",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        var renderer = new XYLineAndShapeRenderer();

        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("AYÞE VE AHMET'ÝN SON 10 DENEMEDEKÝ NET SAYILARI",
                        new Font("Serif", Font.BOLD, 18)
                )
        );

        return chart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new IkiSeriliCizgiGrafigi();
            ex.setVisible(true);
        });
    }

	public void start() {
		EventQueue.invokeLater(() -> {

            var ex = new IkiSeriliCizgiGrafigi();
            ex.setVisible(true);
        });
	}
}