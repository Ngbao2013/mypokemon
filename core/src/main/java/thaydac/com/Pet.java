package thaydac.com;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo;

public class Pet extends MyActorAnimation{
    Pet(Texture texture, float x, float y, Stage s, int cols, int rows) {
        super(texture, x, y, s, cols, rows);
        setSize(getWidth()*0.3f, getHeight()*0.3f);

        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Master.money++;

                    Master.money+=Master.plus;

                moveTo(MathUtils.random(0,480),MathUtils.random(0,480));
                setSize(getWidth()*1.01f, getHeight()*1.01f);
                new Coin(getX() + getWidth()/2, getY() + getHeight()/2, getStage());
                addAction(Actions.sequence(
                    Actions.color(new Color(MathUtils.random(0f, 1f),MathUtils.random(0f, 1f),MathUtils.random(0f, 1f),MathUtils.random(0f, 1f))),
                    Actions.delay(0.5f),
                    Actions.color(new Color(1,1,1,1))
                ));
                addAction(Actions.sequence(
//                    Actions.moveBy(MathUtils.random(-5, 5), MathUtils.random(-5, 5))
                    //Actions.moveTo(Gdx.graphics.getWidth()/2 - getWidth()/2, Gdx.graphics.getHeight()/2 - getHeight()/2)
                ));
            }
        });
    }
}
