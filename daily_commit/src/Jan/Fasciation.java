package Jan;

public class Fasciation {
    public static void main(String[] args) {
        int[] bandage = {4, 2, 7};
        int health = 20;

        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};

        health = remainHealth(bandage, health, attacks);

        System.out.println("remain health = "+health);

    }

    static int remainHealth(int[] bandage, int health, int[][] attacks){
        int healthLimit = health;
        int inARow = 0; //연속 변수
        int attack = 0;
        for (int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            attack = 0;
            for (int j = 0; j < attacks.length; j++) {
                if (attacks[j][0] == i){
                    inARow = 0;
                    health -= attacks[j][1];
                    if (health<=0) return -1;
                    attack = 1;
                    break;
                }
            }
            if (attack==1) continue;
            health += bandage[1];
            inARow += 1;
            if (health > healthLimit) health = healthLimit;
            if (inARow == bandage[0]) {health += bandage[2]; inARow = 0;}
        }

        return health;
    }

}
