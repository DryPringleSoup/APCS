public class Battle {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(100, 30, 20, 1);
        Pokemon squirtle = new Pokemon(100, 25, 25, 2);
        
        int win;
        while (true) {
            System.out.println("Pikachu's health: "+pikachu.health+"\nSquirtle's health: "+squirtle.health+"\n"+"-".repeat(30));
            pikachu.attack(squirtle); if (squirtle.health == 0) { win = 1; break; }
            squirtle.attack(pikachu); if (pikachu.health == 0) { win = 2; break; }
        }
        System.out.println("Pikachu's health: "+pikachu.health+"\nSquirtle's health: "+squirtle.health+"\n"+"-".repeat(30));

        // Since pokemon battles are turn based, ties are impossible
        switch (win) {
            case 1 -> System.out.println("Pickachu PULVERIZES the competition!");
            default -> System.out.println("Squirtle STOMPS the opposition!");
        }
    }
}