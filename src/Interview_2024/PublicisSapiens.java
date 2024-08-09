package Interview_2024;

public class PublicisSapiens {
    public static int method() {
        try {

            int x = 18/0;

        }catch(Exception e){

            System.out.println("catch");
            return 30;
        }finally {
            System.out.println("finally");
            return 40;
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
        int x = 40;
        switch(x){
            case x>20 :
                System.out.println("i m ok");
        }

        String s1= "abc";

        String s2 ="abc";

        System.out.println(s1=s2);

        //[3:23 PM] TRISHUL S
        //SELECT EMP_NAME WHERE EMP_NAME LIKE "%i%"
        //
        //[3:23 PM] Snigdha Prusty
        //id  name   dept
        //1  trishul   HR
        //SELECT DEPT,COUNT(DEPT) AS DEPY_COUNT FROM EMPLOYEE WHERE DEPT_COUNT<2
        //[3:26 PM] TRISHUL S
        //SELECT UPPER(NAME) as NAME_UPPER FROM EMPLOYEE WHERE name = "TRISHUL"
    }
}
