package jp.teckacademy.kenta.suzuki.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;


public class Enemy extends GameObject {
    // 横幅、高さ
    public static final float Enemy_WIDTH = 0.5f;
    public static final float Enemy_HEIGHT = 1.2f;
    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(Enemy_WIDTH, Enemy_HEIGHT);

    }
}