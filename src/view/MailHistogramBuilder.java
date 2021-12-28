
package view;

import java.util.List;
import model.Histogram;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<String> emails){
        Histogram <String> histogram = new Histogram();
        for(int i=0;i<emails.size();i++) {
            histogram.increment(emails.get(i));
        }    
        return histogram;   
    }
}
