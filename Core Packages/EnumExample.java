enum Day
{
    SUNDAY,MONDAY,TUESDAY,WEDNUSDAY,THUSDAY,FRIDAY,SATARDAY
}
public class EnumExample {
    public static void main(String[] args) {
        //create an enum variable
        Day today=Day.FRIDAY;

        //use switch case with enum
        switch(today)
        {
            case MONDAY:
            System.out.println("Start of the week.");
            break;

            case FRIDAY:
            System.out.println("Weekend is near");
            break;

            case SUNDAY:
            System.out.println("It is a relaxing day");
            break;

            default:
            System.out.println("It is a regular weekday");
        }

        //Loop through all enum values
        System.out.println("\nAll days of the week: ");
        for(Day day:Day.values())
        {
            System.out.println(day);
        }
    }
}
