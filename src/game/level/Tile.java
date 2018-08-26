package game.level;

import utils.Utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Tile {

    private BufferedImage image;

    private TileType type;

    protected Tile(BufferedImage image, int scale, TileType type) {
        this.image = Utils.resize(image, image.getWidth() * scale, image.getHeight() * scale);
        this.type = type;
    }

    protected void render(Graphics2D graphics, int x, int y) {
        graphics.drawImage(image, x, y, null);
    }

    protected TileType type() {
        return type;
    }

}
