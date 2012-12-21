package wg.game;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.util.Log;

import wg.androidgames.framework.Screen;
import wg.androidgames.framework.impl.GLGame;


public class Main extends GLGame 
{
    boolean firstTimeCreate = true;
    
    @Override
    public Screen getStartScreen() 
    {
    	ScreenManager.initialize(this);
        return ScreenManager.screen;
    }
    
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {         
        super.onSurfaceCreated(gl, config);
        
        Log.e("TESTE", "FOOOOOOOOOOI");
        if(firstTimeCreate) 
        {
            Assets.load(this);
            firstTimeCreate = false;            
        } else {
            Assets.reload();
        }
    }     
    
    @Override
    public void onPause() {
        super.onPause();
    }
}