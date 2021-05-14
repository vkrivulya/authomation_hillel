package HomeWork11;

public enum WeekDays {
    //1. Write program which stores weekdays in enum and print out every day of week in new line in view:
    //M o N d A y
    //T u E s D a Y
    //and so on

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    @Override
    public String toString() {
        String[] splittedWeekDay = super.toString().toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splittedWeekDay.length; i++) {
            String currentCase = splittedWeekDay[i];
            if (i%2 ==0){
                sb.append(currentCase.toUpperCase() + " ");
            } else {
                sb.append(currentCase + " ");
            }
//            sb.append(currentCase.substring(0, 1).toLowerCase() + currentCase.substring(1) + " ");
        }
        return sb.toString();
    }
}
