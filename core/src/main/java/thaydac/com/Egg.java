package thaydac.com;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Egg extends MyActor{
    boolean isShopShow = false;
    Egg(float x, float y, Stage s) {
        super(x, y, s);
        textureRegion = new TextureRegion(new Texture("more button.png"));
        setSize(32, 32);

        addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                if (!isShopShow){
                    isShopShow = true;
                    if(Master.shop==null) {
                        Master.shop = new Shop(400, 0, getStage());
                    }else {
                        getStage().addActor(Master.shop);

                    }
                }else {
                    Master.shop.remove();
                    isShopShow = false;
                }
            }
        });

    }
}
