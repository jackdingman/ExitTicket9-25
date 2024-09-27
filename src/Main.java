/*
Part 1: Brainstorm three different parent classes with two child classes each

Parent: Vehicle
Children: Motorcycle, Airplane

Parent: Sport
Children: Football, Swimming

Parent: Classes
Children: Mathematics, History

 */
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Motorcycle(10000, "Harley Davidson", 2, 65, 100);
        vehicles[1] = new Motorcycle(100000, "Lamborghini", 3, 75, 150);
        vehicles[2] = new Airplane(155000, "Piper Aircraft", 4, "N4512BC", "Aluminum", 1);
        vehicles[3] = new Airplane(1000000, "Boeing", 150, "AB9812FG", "Aluminum", 8);
        vehicles[4] = new Airplane(1, "Student", 0, "Feather Flyer", "paper", 0);

        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
}
