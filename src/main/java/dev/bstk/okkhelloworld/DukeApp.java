package dev.bstk.okkhelloworld;

import java.util.concurrent.TimeUnit;

public class DukeApp {

    public static void main(String[] args) {
        try {
            int sprite = 1;
            final int quantidadeTotalSprites = DukeSprite.quantidadeTotalSprites();

            while (sprite <= quantidadeTotalSprites) {
                System.out.print(DukeSprite.sprite(sprite));

                if (sprite == (DukeSprite.quantidadeTotalSprites() - 1)) {
                    sprite = 1;
                }

                sprite++;

                TimeUnit.MILLISECONDS.sleep(90);

                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (InterruptedException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
