/* isCold er unødigt kompliceret, 
   refakterer den så den bliver enklere
*/

void main() {
    int temperature = 20;

    if (isCold(temperature)) {
        IO.println("It's cold");
    } else {
        IO.println("It's not cold");
    }
}

boolean isCold(int temperature) {
    boolean cold = false;

    if (temperature > 0) {
        if (temperature < 10) {
            cold = true;
        } else {
            if (temperature < 20) {
                cold = true;
            } else {
                cold = false;
            }
        }
    } else {
        cold = true;
    }

    return cold;
}
