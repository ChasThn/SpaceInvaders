/* ########################################################################## */
/*                                                                            */
/*  SPDX-License-Identifier: UNLICENSED                                       */
/*  See LICENSE.txt for full license terms (FR/EN).                           */
/*                                                                            */
/*  Author: Charles Theetten                                                  */
/*                                                                            */
/* ########################################################################## */

package         io.chasthn.spaceinvaders;


import          javafx.animation.Animation;
import          javafx.animation.AnimationTimer;
import          javafx.animation.KeyFrame;
import          javafx.application.Application;
import          javafx.application.Platform;
import          javafx.beans.property.BooleanProperty;
import          javafx.beans.property.IntegerProperty;
import          javafx.beans.property.SimpleBooleanProperty;
import          javafx.beans.property.SimpleIntegerProperty;
import          javafx.scene.Scene;
import          javafx.scene.control.Label;
import          javafx.scene.control.Separator;
import          javafx.scene.image.Image;
import          javafx.scene.image.ImageView;
import          javafx.scene.input.KeyCode;
import          javafx.scene.input.KeyEvent;
import          javafx.scene.layout.Pane;
import          javafx.scene.layout.VBox;
import          javafx.scene.media.AudioClip;
import          javafx.scene.shape.Rectangle;
import          javafx.scene.text.Font;
import          javafx.stage.Stage;
import          javafx.util.Duration;

import          java.util.*;

import static   io.chasthn.spaceinvaders.Collisions.*;
import static   io.chasthn.spaceinvaders.EState.*;
import static   io.chasthn.spaceinvaders.Images.*;
import static   io.chasthn.spaceinvaders.SoundManager.*;
import static   io.chasthn.spaceinvaders.UiStyles.*;

/* ########################################################################## */

class UiStyles {



}

/* ########################################################################## */

class SoundManager {



}

/* ########################################################################## */

class Images {



}

/* ########################################################################## */

enum EState {

}

/* ########################################################################## */

class Entity extends ImageView {



}

/* ########################################################################## */

class Player extends Entity {



}

/* ########################################################################## */

class Invader extends Entity {



}

/* ########################################################################## */

class Boss extends Entity {



}

/* ########################################################################## */

class Collisions {



}

/* ########################################################################## */

class LevelConfig {



}

/* ########################################################################## */

class Game {



}

/* ########################################################################## */

class Renderer {



}

/* ########################################################################## */

class Menu {



}

/* ########################################################################## */

class Window {



}

/* ########################################################################## */

class InputHandler {



}

/* ########################################################################## */

public class SpaceInvaders extends Application {

    //////////////////////////////////////////////////////////////////////////

    enum            GameState { RESET, START, PAUSE }
    //
    Stage           stage;
    Menu            menu;
    Window          window;
    Renderer        renderer;
    //
    InputHandler    handler;
    //
    GameState       state;
    Game            game;
    //
    AnimationTimer  loop;

    //////////////////////////////////////////////////////////////////////////

    public SpaceInvaders() {

    }

    @Override
    public void start(Stage stage) {
        this.stage  = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    //////////////////////////////////////////////////////////////////////////

}

/* ########################################################################## */
