package thaydac.com;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Coin extends MyActor{
    float gravity = 0.5f;
    float dx = 0;
    float dy = 0;
    static Sound tap;
    Coin(float x, float y, Stage s) {
        super(x, y, s);
        textureRegion = new TextureRegion(new Texture("coin.png"));
        textureRegion.setRegion(MathUtils.random(0, 5)*32, 0, 32,32);
        setSize(textureRegion.getRegionWidth(), textureRegion.getRegionHeight());

        dx = MathUtils.random(-10, 10);
        dy = MathUtils.random(5, 10);
        tap = Gdx.audio.newSound(Gdx.files.internal("tap.wav"));
        tap.play();
    }

    @Override
    public void act(float delta) {
        dy -= gravity;
        dx *= 0.9;
        moveBy(dx, dy);
        setColor(1,1,1, getColor().a - 0.01f);
        if(getColor().a < 0.01){
            remove();
        }
    }
}
