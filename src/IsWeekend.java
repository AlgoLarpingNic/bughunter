/* Prøv at simplificere isWeekend-metoden */

void main() {
    String[] dayOfWeek = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

    boolean weekend = dayOfWeek[5].equals("Lørdag") || dayOfWeek[6].equals("Søndag");
    for (String day : dayOfWeek){
        IO.println(day);
    if (weekend != true){
        IO.println("Juhu det er weekend" + day);

    }

    }
}