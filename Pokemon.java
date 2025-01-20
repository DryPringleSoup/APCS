public class Pokemon {
    static int NUM_TYPES = 3;
    int health;
    int attackPower;
    int defensePower;
    int type;

    public Pokemon(int hp, int attack, int defense, int pType) {
        this.health = hp;
        this.attackPower = attack;
        this.defensePower = defense;
        this.type = pType;
    }

    public void attack(Pokemon opponent) {
        /* Using modular arthimetic to account for the cyclic nature of type advantage
        if the opponent's types is one ahead of us, we're weak to it. However if it's
        one behind our type (same as saying it's the number of types minus one ahead)
        we are strong against it */

        int typeDiff = (this.type-opponent.type+NUM_TYPES)%NUM_TYPES;
        int damage = Math.max(1, this.attackPower-opponent.defensePower);
        damage = typeDiff==1 ? damage*2 : typeDiff==NUM_TYPES-1 ? damage/2 : damage;
        opponent.health = Math.max(0,opponent.health-damage);
    }
}