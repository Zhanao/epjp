package s039;

public class SwitchEnum {

    public static void main(String[] args) {
        WeekendDay day = WeekendDay.SATURDAY;

        // usato se ho delle costanti

        switch (day) {
        case SATURDAY:
            System.out.println("No alarm clock today");
            break;
        case SUNDAY:
            System.out.println("Ready for a new week?");
            break;
        //non c é bisogno del default perche solitamente io nei case
        //ho già ricoperto tutti i casi. Se non lo faccio il sistema dopo il controllo
        //mi da un Warning.
        }
    }
}