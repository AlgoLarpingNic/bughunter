/* Prøv at simplificere isWeekend-metoden */

void main() {
    String dayOfWeek = "Mandag";

    boolean weekend = isWeekend(dayOfWeek);
    IO.println("Er " + dayOfWeek + " i weekenden: " + weekend);
}

boolean isWeekend(String day) {
    boolean weekend = false;

    switch (day) {
        case "Mandag":
            weekend = false;
            break;
        case "Tirsdag":
            weekend = false;
            break;
        case "Onsdag":
            weekend = false;
            break;
        case "Torsdag":
            weekend = false;
            break;
        case "Fredag":
            weekend = false;
            break;
        case "Lørdag":
            weekend = true;
            break;
        case "Søndag":
            weekend = true;
            break;
        default:
            weekend = false;
            break;
    }
    return weekend;
}
