/* Refaktorer koden for at gøre den mere læselig.
   Hvad betyder fx 1.2?
   Hvorfor > 2500?
   Hvad er formålet med denne formel? 
*/

void main() {
    double salary = 3000;

    if (salary > 2500) {
        salary = salary * 1.2;
    }

    IO.println(salary);
}
