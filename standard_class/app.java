public class app {
    public static void main(String[] args) {

        character knight = new character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Henry";
        knight.sayMyName();
        knight.sayMyIntelligence();
        knight.sayMyAgility();
        knight.sayMyStrength();

        character mage = new character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Rastaman";
        mage.sayMyName();
        mage.sayMyIntelligence();
        mage.sayMyAgility();
        mage.sayMyStrength();

        character thief = new character();

        thief.strength = 3;
        thief.agility = 15;
        thief.intelligence = 10;
        thief.name = "Gordon";
        thief.sayMyName();
        thief.sayMyIntelligence();
        thief.sayMyAgility();
        thief.sayMyStrength();

        character priest = new character();

        priest.strength = 5;
        priest.agility = 5;
        priest.intelligence = 15;
        priest.name = "Kepweng";
        priest.sayMyName();
        priest.sayMyIntelligence();
        priest.sayMyAgility();
        priest.sayMyStrength();

        character archer = new character();

        archer.strength = 5;
        archer.agility = 10;
        archer.intelligence = 0;
        archer.name = "Marites";
        archer.sayMyName();
        archer.sayMyIntelligence();
        archer.sayMyAgility();
        archer.sayMyStrength();


    }
}

