public class CompuertasLogicas {

    // Método para compuerta AND
    public static boolean AND(boolean a, boolean b) {
        return a && b;
    }

    // Método para compuerta OR
    public static boolean OR(boolean a, boolean b) {
        return a || b;
    }

    // Método para compuerta NOT
    public static boolean NOT(boolean a) {
        return !a;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        boolean a = true;
        boolean b = false;

        System.out.println("AND: " + AND(a, b)); // false
        System.out.println("OR: " + OR(a, b));   // true
        System.out.println("NOT: " + NOT(a));    // false
    }
}