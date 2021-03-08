import com.sun.xml.internal.ws.binding.FeatureListUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.sql.Timestamp;
import java.text.*;
import java.util.*;

public class Client extends Object {

    public static void main(String[] args) throws Exception {
//        List<String> first = new ArrayList<String>();
//
//
//        first.add("One");
//        first.add("One");
//        first.add("Two");
//        first.add("Three");
//
//
//        List<String> second = new ArrayList<String>();
//
//        second.add("Ten");
//        second.add("Eleven");
//        second.add("Twelve");
//
//
//
//
//
//        first.addAll(second);
//
//
//        List<String> temp = new ArrayList<String>();
//        for (String s: first){
//
//            for (String d: second){
//                if (d.length() == s.length())
//                    temp.add(d);
//            }
//
//        }


//        Date d = new SimpleDateFormat("dd-MMM-yy").parse("02-1-19");
//        System.out.println(d);
       /// Date d1 = new SimpleDateFormat("dd-MMM-yy").parse("02-1-19");
//        java.util.Date d = new java.util.Date();
//        Timestamp ts = new Timestamp(d.getTime());
//        System.out.println(ts);

//        String sDate1="31/12/98".replace("/","-");
//        Date date1=new SimpleDateFormat("dd-MM-yy").parse(sDate1);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//     //   System.out.println(sdf.format(date1));
//        System.out.println(getDate(sdf.format(date1)));

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(',');

        DecimalFormat formatter = new DecimalFormat("##,####.##", symbols);
        System.out.println(formatter.format(1221112.21));


    }
    private static final String pattern = "dd-MMM-yy";
    private static DateTime getDate(final String date ) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yy");
        DateTime dt = formatter.parseDateTime("31-12-18");

        //System.out.println("month="+dt.getMonthOfYear());
        System.out.println(dt);


        //Thu Jan 24 05:00:00 PKT 2019
        //2019-01-01T05:00:00.000+05:00
        String dateTime = "2019-01-01T05:00:00.000+05:00";
        DateTime dateTime1 = new DateTime(dateTime);
        String format = dateTime1.getDayOfMonth()+"/"+dateTime1.getMonthOfYear()+"/"+dateTime1.getYear();
        System.out.println("formated="+format);
//// Format for input
//        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
//// Parsing the date
//        DateTime jodatime = dtf.parseDateTime(dateTime);
//// Format for output
//        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("yyyy-MM-dd");
//


//
////
////// Printing the date
//        System.out.println("===============\n"+dtfOut.print(jodatime));

//        DateTime dateTime1 = new DateTime(dtfOut.print(jodatime));
       // System.out.println(dateTime1);
        return null;
    }

    public static Timestamp parseToTimeStamp(DateTime jodaDate) {
        if (jodaDate == null) {
            return null;
        }

        return new Timestamp(jodaDate.toDate().getTime());

    }
    @Override
    protected void finalize() throws Throwable {

    }





}
