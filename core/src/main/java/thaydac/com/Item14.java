package thaydac.com;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.ScreenUtils;

import static thaydac.com.Master.autoplusnumber2;
import static thaydac.com.Master.money;

public class Item14 extends MyActor{
    int tybe=14;
    boolean isClickShow = false;
    Item14(float x, float y, Stage  s,int tybe) {
        super(x, y, s);
        this.tybe=tybe;
        textureRegion = new TextureRegion(new Texture("14.png"));
        setSize(32, 32);

        addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                boolean isCLickShow = false;
                if (  Master.money >= 125000 ){
                    if (!isCLickShow){
                        Master.money-=125000;
                        Master.autoplus14=true;
                        if (Master.autoplus14=true){
                            Master.autoplusnumber14+=1500;
                        }
                        isClickShow = true;
                        if(Master.click14==null) {
                            Master.click14 = new Item14(0, 200, getStage(),14);

                        }else {
                            getStage().addActor(Master.click14);
                        }
                    }else {
                        Master.click14.remove();
                        isClickShow = false;
                    }

                    ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);



                }
            }
        });
        setPosition(Gdx.graphics.getWidth(), y);
        addAction(Actions.moveTo(x, y, 0.5f));
    }

}

