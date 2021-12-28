package kata5p2;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import static view.MailHistogramBuilder.build;
import view.MailListReaderBD;

public class Kata5P2 {
    List<String> mailList = new ArrayList<>();
    Histogram<String> histogram = new Histogram<>();
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Kata5P2 aplicacion = new Kata5P2();
        aplicacion.execute();
        }
    
    public void execute() throws FileNotFoundException, InterruptedException {
        input();
        process();
        output();
    }
    
    public void input() throws FileNotFoundException, InterruptedException {
        MailListReaderBD bd = new MailListReaderBD();
        bd.selectAll();
        for(Mail emails : bd.read()){
            mailList.add(emails.getDomain());
        }
    }
    
    public void process() {
        histogram = build(mailList);
    }
    
    public void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}

