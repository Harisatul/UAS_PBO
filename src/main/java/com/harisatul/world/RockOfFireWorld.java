package com.harisatul.world;

import com.harisatul.character.Hero.*;
import com.harisatul.character.enemy.Enemy;
import com.harisatul.character.enemy.HatPig;
import com.harisatul.character.enemy.IronPig;
import com.harisatul.function.Instructions;
import com.harisatul.function.InstructionsImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockOfFireWorld extends World {

    private Instructions instructions;
    private final List<Hero> LIST_OF_CHAR =
            java.util.List.of(
                    new RedBird("Red Bird "),
                    new BlueBird("Blue Bird"),
                    new Chuck("Yellow Chuck"),
                    new Matilda("White Cuttie"),
                    new Bomb("Destroyer Black"));


    public RockOfFireWorld() {
        super("Rock Of Fire Arena", 150);
        this.instructions = new InstructionsImpl();
    }

    @Override
    public void worldLogic() {
        Scanner scanner = new Scanner(System.in);
        List<Hero> heroes = heroChar();
        List<Enemy> enemies = enemiesFunction();

        System.out.println("==Welcome to Rock Of Fire World==");
        System.out.println("Anda akan diberikan 7 buah karakter yang " +
                "siap diluncurkan secara sekuensial");

        String temp = "{";
        for (Hero name:
            heroes ) {
            temp += name.getName() + ", " ;
        }
        System.out.println(temp+"}");


        System.out.println("terdapat dua babi yang telah mencuri telur anda. " +
                "Kalahkan mereka untuk mendapatkan kembali telurnya"
        );
        System.out.println("Namun, mereka berlindung dibalik kotak yang terbuat dari " +
                "batu berwarna abu yang kokoh");

        int defence = this.getDefence();
        int heroRemains = 0;
        for (int i = heroes.size()-1; i >= 0 ; i--) {

            boolean empty = enemies.isEmpty();
            if (empty){
                break;
            }

            heroRemains = i;
            System.out.println("\n"+"Hero tersisa : " + ++heroRemains);
            System.out.println(heroes.get(i).getName() + " Siap diluncurkan ");
            System.out.print("Tekan y untuk meluncurkan : ");
            String s = scanner.nextLine();


            if (defence >= 0 ){
                int i1 = instructions.hitBox(heroes.get(i), defence);
                defence = i1;
                System.out.println("Berhasil menembakkan ke kotak batu");
                System.out.println("pertahanan sisa : " + defence);
                if (defence <= 0){
                    System.out.println("Pertahanan telah Hancur");
                }
            } else {
                System.out.println("Berhasil menembakkan ke kumpulan babi");
                for (Enemy enemy : enemies) {
                    int currentHealth = enemy.getHealth();
                    if (currentHealth >= 0) {
                        int hit = instructions.hit(heroes.get(i), enemy);
                        currentHealth = hit;
                        enemy.setHealth(hit);
                        System.out.println("pertahanan babi " + enemy.getName() +
                                " tersisa : " + currentHealth);
                    }
                }
                enemies.removeIf(enemy -> enemy.getHealth() <= 0);
            }
        }

        if (!enemies.isEmpty()){
            System.out.println("\nSayang sekali, Sisa Hero telah " +
                    "habis dan para babi belum terkalahkan");
            System.out.println("SISA ENEMY");
            for (Enemy enemy:
                    enemies) {
                System.out.println(enemy.getName() + " : " + enemy.getHealth() );
            }
            System.out.println("--END GAME--");
        }else  {
            System.out.println("\nSelamat anda telah memenangkan pertempuran. " +
                    "tidak ada lagi babi yang  akan mengganggu anda");
            System.out.println("Sisa hero : " + heroRemains);
            System.out.println("--END GAME--");
        }
    }

    @Override
    public List<Hero> heroChar () {
        List<Hero> availCharList =  new ArrayList<>();
        int n = 7;
        while (n-- >0){
            int rand  = (int) (Math.random() * 5);
            Hero e = LIST_OF_CHAR.get(rand);
            availCharList.add(e);
        }
        return availCharList;
    }

    @Override
    public List<Enemy> enemiesFunction (){
        List<Enemy> availEnemyList =  new ArrayList<>();
        HatPig green = new HatPig("HatPig 1", "Green");
        IronPig yellow = new IronPig("IronPig 2", "Yellow");
        availEnemyList.add(green);
        availEnemyList.add(yellow);
        return availEnemyList;
    }

}
