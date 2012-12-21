package wg.game;

import wg.androidgames.framework.Music;
import wg.androidgames.framework.Sound;
import wg.androidgames.framework.gl.Font;
import wg.androidgames.framework.gl.Texture;
import wg.androidgames.framework.gl.TextureRegion;
import wg.androidgames.framework.impl.GLGame;


public class Assets 
{
	
	
    public static Texture bgGame;
    public static TextureRegion bgGameRegion;
    public static Texture itens;        
    public static TextureRegion menuRegion;
    public static TextureRegion levelRegion;
    public static TextureRegion gameOverRegion;
    
    public static Music music;
    public static Sound som1;
    
    public static Font font;
    
    public static void load(GLGame game) 
    {
        bgGame = new Texture(game, "bgGame.png");
        bgGameRegion = new TextureRegion(bgGame, 0, 0, 320, 480);
        
        itens = new Texture(game, "itens.png");
        menuRegion = new TextureRegion(itens, 1, 130, 50, 50);
        levelRegion = new TextureRegion(itens, 51, 130, 50, 50);
        gameOverRegion = new TextureRegion(itens, 101, 130, 50, 50);
        
        font = new Font(itens, 0, 0, 16, 16, 20);
        
        music = game.getAudio().newMusic("musicaGame.mp3");
        music.setLooping(true);
        music.setVolume(1);
        som1 = game.getAudio().newSound("som1.ogg");
            
    }       
    
    public static void reload() {
        bgGame.reload();
        itens.reload();
    }
    
    public static void playSound(Sound sound) {
    }
}
