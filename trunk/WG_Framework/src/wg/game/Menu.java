package wg.game;

import java.util.List;

import javax.microedition.khronos.opengles.GL10;

import wg.androidgames.framework.Game;
import wg.androidgames.framework.Input.TouchEvent;
import wg.androidgames.framework.gl.Camera2D;
import wg.androidgames.framework.gl.SpriteBatcher;
import wg.androidgames.framework.impl.GLScreen;
import wg.androidgames.framework.math.Vector2;

import android.util.Log;


public class Menu extends GLScreen
{
	Camera2D guiCam;
    SpriteBatcher batcher;
    
    
	public Menu(Game game) 
	{
		super(game);
		guiCam = new Camera2D(glGraphics, 320, 480);
        batcher = new SpriteBatcher(glGraphics, 100);
        
	}

	@Override
	public void update(float deltaTime) 
	{
		
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();
        
        Vector2 touchPoint = new Vector2(0,0);
        int len = touchEvents.size();
        for(int i = 0; i < len; i++) 
        {
            TouchEvent event = touchEvents.get(i);
            touchPoint.set(event.x, event.y);
            guiCam.touchToWorld(touchPoint);
        }
		
	}

	@Override
	public void present(float deltaTime) 
	{
		Log.e("TESTE", "FOOOOOOOOOOI");
		GL10 gl = glGraphics.getGL();        
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        guiCam.setViewportAndMatrices();
        
        gl.glEnable(GL10.GL_TEXTURE_2D);
        
        batcher.beginBatch(Assets.bgGame);
        batcher.drawSprite(0, 0, 320, 480, Assets.bgGameRegion);
        batcher.endBatch();
        
        batcher.beginBatch(Assets.itens);
        batcher.drawSprite(50, 50, 50, 50, Assets.menuRegion);
        batcher.endBatch();
        
        gl.glEnable(GL10.GL_BLEND);
        gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);               
     
        batcher.beginBatch(Assets.itens);
        batcher.drawSprite(0, 0, 50, 50, Assets.menuRegion);
        batcher.endBatch();
        
        gl.glDisable(GL10.GL_BLEND);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
