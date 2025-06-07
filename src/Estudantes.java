public class Estudantes {
    public String name;
    public double grade1;
    public double grade2;

    // Método para calcular a média
    public double calculateAverage() {
        return (grade1 + grade2) / 2;
    }
}

//public class EstudanteTeste {
//    public static void main(String[] args) {
//        Estudantes estudantes1 = new Estudantes();
//        estudantes1.name = "Alice";
//        estudantes1.grade1 = 8.5;
//        estudantes1.grade2 = 9.0;
//
//        Estudantes estudantes2 = new Estudantes();
//        estudantes2.name = "Bob";
//        estudantes2.grade1 = 7.0;
//        estudantes2.grade2 = 6.5;
//
//        System.out.println(estudantes1.name + " tem média: " + estudantes1.calculateAverage());
//        System.out.println(estudantes2.name + " tem média: " + estudantes2.calculateAverage());
//    }
//}