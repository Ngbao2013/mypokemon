package thaydac.com;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Master implements Screen {
    private SpriteBatch batch;
    Stage stage;
    static int money = 0;
    static int plus = 0;
    Pet pet;
    Egg egg;
    Item item;
    BackGround bg;
    static Shop shop;
    static Item click;
    BitmapFont font;

    Master(StartGame game){
        FreeTypeFontGenerator fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("Lonely Cake.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter fontParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        fontParameter.size = 32;
        fontParameter.color = Color.WHITE;
        font = fontGenerator.generateFont(fontParameter);
        fontGenerator.dispose();
        batch = new SpriteBatch();
        stage = new Stage();
        bg = new BackGround(0,0,stage);
        item = new Item(0,40,stage,1);
        pet = new Pet(new Texture("venusaur.png"), 0, 0, stage, 12, 14);
        pet.setPosition(Gdx.graphics.getWidth()/2 - pet.getWidth()/2, Gdx.graphics.getHeight()/2 - pet.getHeight()/2);

        egg = new Egg(0,0, stage);

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        stage.act();
        stage.draw();

        batch.begin();
        font.draw(batch,"coin: " + money,0,Gdx.graphics.getHeight()-32);
        batch.end();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
