public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Squirtle", "Water", 5);
        Pokemon pokemon2 = new Pokemon("Pikachu");
        System.out.println(pokemon1.toString());

        pokemon2.setName("XXXTENTACION");
        System.out.println(pokemon2.getName());
    }
}
