package demo;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.GameWorld;
import com.almasb.fxgl.settings.GameSettings;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import com.almasb.fxgl.settings.GameSettings;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.util.Map;

public class BasicGameApp extends GameApplication {

  private Entity player;

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Basic Game App");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initGame() {
      player = Entities.builder()
          .at(300,300)
          .viewFromNode(new Rectangle(25, 25, Color.BLUE))
          .buildAndAttach(getGameWorld());

      player.translate(200,200);
    }

    @Override

}
