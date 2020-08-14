import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * User: wangtao
 * Date: 2020/8/4
 *
 * @author false
 * Description:
 */
public class MainTest {

    public static void main(String[] args) {

        int num = 1600;
        int c = 500;
        int p = (int)Math.ceil((double) num/c);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int wednesday = calendar.get(Calendar.WEDNESDAY);
        String vasion = String.valueOf(year)+String.valueOf(month)+String.valueOf(wednesday);
        System.out.println(p);
    }


}
