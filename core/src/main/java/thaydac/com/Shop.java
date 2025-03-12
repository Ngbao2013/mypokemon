package thaydac.com;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Shop extends MyActor{
    Shop(float x, float y, Stage s) {
        super(x, y, s);
        textureRegion = new TextureRegion(new Texture("shop.png"));
        setSize(250, 480);

    }}
