package flujos;

/*
Operaciones intermedias

Las operaciones de flujo intermedio son métodos que devuelven un flujo.
Dado que el valor devuelto es un flujo,
podemos llamar secuencialmente a las operaciones intermedias.
Las operaciones intermedias típicas incluyen
convertir un valor de una forma a otra utilizando map
y su forma más específica mapToInt utilizada para
convertir una secuencia en una secuencia de enteros.
Otros incluyen filtrar valores con filter,
identificar valores únicos con distinct y
organizar valores con sorted (si es posible).

Veamos estos métodos en acción a través de
algunos problemas. Digamos que tenemos
la siguiente clase Person.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

}

