package flujos;

public class Human implements Comparable<Human> {
    private String name;
    private int salario;

    public Human(String name, int salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return this.name;
    }

    public int getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getSalario() + ")";
    }

    @Override
    public int compareTo (Human other){
        if (this.salario == other.getSalario()) {
            return 0;
        } else if (this.salario > other.getSalario()) {
            return -1;
        } else {
            return 1;
        }
        //Lo ordena de menor a mayor
        //return this.getSalario() - other.getSalario()
        //Y así de mayor a menor
        //return other.getSalario() - this.getSalario()
    }

}