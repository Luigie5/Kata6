package view;
import model.Histogram;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay<T> extends ApplicationFrame {
    private final  Histogram<T> histogram;
    private final String ejeX; 
    public HistogramDisplay(Histogram<T> histogram, String ejeX){
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
        this.ejeX = ejeX;
    }
    private JPanel createPanel(){
        ChartPanel panel= new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return panel;
    }
    private JFreeChart createChart(DefaultCategoryDataset data){
        JFreeChart chart=ChartFactory.createBarChart("Histograma JFreeChart",
                ejeX,"Nº de dominios",data);
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset data=new DefaultCategoryDataset();
        for (T key : histogram.keySet()) {
            data.addValue(histogram.get(key),"",(Comparable)key);
        }
        return data;
        
    }
    public void execute(){
        setVisible(true);
    }
}