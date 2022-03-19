import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class arrayTest {

    private static List getMonthBetween(String minDate, String maxDate){
        ArrayList result = new ArrayList();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
            Calendar min = Calendar.getInstance();
            Calendar max = Calendar.getInstance();
            min.setTime(sdf.parse(minDate));
            min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
            max.setTime(sdf.parse(maxDate));
            max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
            Calendar curr = min;
            while (curr.before(max)) {
                result.add(sdf.format(curr.getTime()));
                curr.add(Calendar.MONTH, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return result;
    }
    private static List getMonthBetween(String minDate, intObject maxDate){
        ArrayList result = new ArrayList();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
            Calendar min = Calendar.getInstance();
            Calendar max = Calendar.getInstance();
            min.setTime(sdf.parse(minDate));
            min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
            max.setTime(sdf.parse(maxDate));
            max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
            Calendar curr = min;
            while (curr.before(max)) {
                result.add(sdf.format(curr.getTime()));
                curr.add(Calendar.MONTH, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return result;
    }

    public static int f(int x){
        if (x == 1 || x == 2){
            return 1;
        }else {
            return f(x-1)+f(x-2);
        }
    }

    public static void main(String[] args) {


        // 获取某段时间日期
//        List list = getMonthBetween("2018-06","2021-07");
//        for(Object s : list){
//            System.out.println("日期："+s);
//        }

//        int i = 0;
//        for ( i = 1; i<=20; i++){
//            System.out.println(f(i));
//        }


            for(int k=2;k<=100;k++) {
                boolean flag = true;
                for(int i =2;i<=k-1;i++) {
                    if(k%i == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(k+"是质数");
                }
            }


//        list =list []
//        for i in range(2,101):
//        for j in range(2,i):
//        if i%j == 0:
//        break
//        else
//        list.append(i)
//        print(list)

        //  18.6-21.7  s
        // 18.6-21.7    18.9  20.6-12 21.7
        // a + b  = c
//        int a[][] = new int[3][4];
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("i="+i);
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println("j="+j);
//            }
//        }
//        String s1 = new String("123");
//        String s2 = new String("123");
//        String s3 = new String("常浩");
//        String s4 = new String("常浩");
//        System.out.println(s1.equals(s2));
//        System.out.println(s3.equals(s4));
//        a a1 = new a();
//        String ss1 = "123";
//        a1.a = ss1;
//        a a2 = new a();
//        String ss2 = "123";
//        a2.a = ss2;
//        System.out.println(a1.a.equals(a2.a));
    }

    
   
}
