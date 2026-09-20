/* Prøv at håndtere når name er null */

void main() {
    String name = "John Doe";
    IO.print(name);

    String noName = null;
    IO.println(initials(noName));
}

String initials(String name) {
    String initials = "";
    String[] parts = name.split(" ");
    
    for (String part : parts) {
        initials = initials + part.charAt(0);
    }

    return initials.toUpperCase();
}
