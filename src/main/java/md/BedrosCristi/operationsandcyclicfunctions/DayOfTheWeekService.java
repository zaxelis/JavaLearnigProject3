package md.BedrosCristi.operationsandcyclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        String dayName;
        String dayNumber = "5";

        System.out.println(dayNumber.toUpperCase());

        switch (dayNumber.toUpperCase()) {
            case "1":
                dayName = "Luni";
                break;
            case "2":
                dayName = "Marti";
                break;
            case "3":
                dayName = "Miercuri";
                break;
            case "4":
                dayName = "Joi";
                break;
            case "5":
                dayName = "Vineri";
                break;
            case "6":
                dayName = "Simbata";
                break;
            case "7":
                dayName = "Duminica";
            default:
                dayName = "0";
                System.out.println("Ai introdus o cifra prea mare");
        }
        System.out.println("Ziua nr " + dayNumber + " este " + dayName);
    }
}