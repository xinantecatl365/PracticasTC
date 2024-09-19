class Main {
    public static void main(String[] args) {
        // Factorial of a number
        int iterations = 20;
        if (iterations == 1) {
            System.out.println(0);
            return;
        }
        int beforeNumber = 0;
        int newNumber = 1;
        int aux;
        for (int i = 1; i < iterations + 1; i++) {
            newNumber += beforeNumber;
            aux = beforeNumber;
            beforeNumber = newNumber;
            newNumber = aux;
            System.out.println(newNumber);
        }

    }
}
