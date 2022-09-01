public class app {
    /**
     * @param args
     */
    public static void main(String[] args){
 // Character Class
        /*character knight = new character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        character mage = new character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        character thief = new character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        enemy boss = new enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        enemy skeleton = new enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        enemy dragon = new enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
*/

        items heal = new items();

        heal.price = 10;
        heal.weight = 5.3f;
        heal.quantity = 1;
        heal.description = "Healing potion! Can be healed for 100 hp";
        heal.canbetraded = true;
        heal.itemProperties();

        items rage = new items();

        rage.price = 20;
        rage.weight = 9.5f;
        rage.quantity = 1;
        rage.description = "The Angry Potion! Rage for 30 seconds ";
        rage.canbetraded = true;
        rage.itemProperties();

        items invisible = new items();

        invisible.price = 15;
        invisible.weight = 4.8f;
        invisible.quantity = 1;
        invisible.description = "Sneaky Potion, Invisible for 1 minute ";
        invisible.canbetraded = false;
        invisible.itemProperties();

        items poison = new items();

        poison.price = 5;
        poison.weight = 1.1f;
        poison.quantity = 1;
        poison.description = "Poison for instant death ";
        poison.canbetraded = false;
        poison.itemProperties();

        pet dog = new pet();
        dog.price = 75;
        dog.weight = 30.2f;
        dog.quantity = 1;
        dog.description = "This is Dog";
        dog.canbetraded = true;
        dog.petCompanion();

        pet dragon = new pet();
        dragon.price = 500;
        dragon.weight = 1000.2f;
        dragon.quantity = 1;
        dragon.description = "This is Dragon";
        dragon.canbetraded = false;
        dragon.petCompanion();

        pet horse = new pet();
        horse.price = 200;
        horse.weight = 89.2f;
        horse.quantity = 1;
        horse.description = "This is horse";
        horse.canbetraded = true;
        horse.petCompanion();


        bird bird = new bird(75, 30.2f, 1, "This is Bird", true );
        bird.sayMyPet();

        bird eagle = new bird(75, 30.2f, 1, "This is eagle", true );
        eagle.sayMyPet();

        bird vulture = new bird(75, 30.2f, 1, "This is eagle", true );
        vulture.sayMyPet();
    }
}
    
