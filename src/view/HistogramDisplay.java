package view;
import model.Histogram;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    private final  Histogram<String> histogram;
    public HistogramDisplay(Histogram<String> histogram){
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    private JPanel createPanel(){
        ChartPanel panel= new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return panel;
    }
    private JFreeChart createChart(DefaultCategoryDataset data){
        JFreeChart chart=ChartFactory.createBarChart("Histograma JFreeChart",
                "Nombres de dominios","Nº de dominios",data);
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset data=new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            data.addValue(histogram.get(key),"",key);
        }
        return data;
        
    }
    public void execute(){
        setVisible(true);
    }
}