package TaskSheet.tasksheet_1_2_1;

public class MyDate {
    public static void main(String[] args) {
        // Create DateTask objects
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        date1.setDate(1, 1, 1978);        
        date2.setDate(9, 21, 1984);       

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        DateTask.leapYears();
    }
}
