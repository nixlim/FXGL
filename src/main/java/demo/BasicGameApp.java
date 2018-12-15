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

import java.util.*;

public class BasicGameApp extends GameApplication {

  private Entity player;
  private int positionX = 300;
  private int positionY = 300;
  private Random randomModifier = new Random();

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
  protected void initGameVars(Map<String, Object> settings) {
    settings.put("positionX", positionX);
    settings.put("positionY", positionY);

  }

  @Override
  protected void initGame() {
    player = Entities.builder()
        .at(positionX,positionY)
        .viewFromNode(new Rectangle(25, 25, Color.BLUE))
        .buildAndAttach(getGameWorld());

  }

  @Override
  protected void onUpdate(double tpf) {
    player.translate(0,1);
  }

}
