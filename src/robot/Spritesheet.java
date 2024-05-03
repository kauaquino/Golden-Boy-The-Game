package robot;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public static BufferedImage spritesheet;
	
	public static BufferedImage player_normal;
	
	public static BufferedImage grass;
	
	public static BufferedImage bloco;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spriteSheet.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		player_normal = Spritesheet.getSprite(0,0,32,32);
		bloco = Spritesheet.getSprite(32,0,32,32);
		grass = Spritesheet.getSprite(0,32,32,32);
	}
	
	
	public static BufferedImage getSprite(int x,int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
}
