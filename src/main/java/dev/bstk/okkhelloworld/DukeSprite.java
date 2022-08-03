package dev.bstk.okkhelloworld;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;

public final class DukeSprite {

    private static final String SPRITE_DUKE = "src/main/resources/duke/duke%s.txt";

    private static final Map<Integer, File> SPRITES = Map.of(
        1, new File(String.format(SPRITE_DUKE, 1)),
        2, new File(String.format(SPRITE_DUKE, 2)),
        3, new File(String.format(SPRITE_DUKE, 3)),
        4, new File(String.format(SPRITE_DUKE, 4)),
        5, new File(String.format(SPRITE_DUKE, 5)),
        6, new File(String.format(SPRITE_DUKE, 6)),
        7, new File(String.format(SPRITE_DUKE, 7)),
        8, new File(String.format(SPRITE_DUKE, 8)),
        9, new File(String.format(SPRITE_DUKE, 9)),
        10, new File(String.format(SPRITE_DUKE, 10))
    );

    private DukeSprite() { }

    public static String sprite(final int numeroSprite) {
        try {
            final File sprite = SPRITES.get(numeroSprite);
            final byte[] bytesSprite = Files.readAllBytes(sprite.toPath());

            return new String(bytesSprite, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalArgumentException("Não foi possivél ler as sprites!");
        }
    }

    public static int quantidadeTotalSprites() {
        return SPRITES.size();
    }
}
