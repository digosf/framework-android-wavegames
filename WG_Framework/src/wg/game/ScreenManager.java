package wg.game;

import wg.androidgames.framework.Game;
import wg.androidgames.framework.impl.GLScreen;

public class ScreenManager 
{
	public static SCREEN screenState;
	public static GLScreen screen;
	
	public static void initialize(Game game)
	{
		ScreenManager.screen = new Menu(game);
		ScreenManager.screenState = SCREEN.MENU;
		
	}
	
	public static void changeScreen(Game game)
	{
		switch (screenState) 
		{
			case MENU:		
				break;
			default:
				break;
		}
	}
	
	public static void changeScreen(Game game, int index)
	{
		switch (index) 
		{
			case 0:		
				break;
		}
	}
	
	enum SCREEN
	{
		MENU,
		LEVEL,
		GAMEOVER
	}
}
