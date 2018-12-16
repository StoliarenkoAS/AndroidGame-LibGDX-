package ru.stoliarenko.gb.lonelycoraptor.emitters;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import org.jetbrains.annotations.NotNull;

import ru.stoliarenko.gb.lonelycoraptor.base.Explosion;
import ru.stoliarenko.gb.lonelycoraptor.base.ObjectPool;
import ru.stoliarenko.gb.lonelycoraptor.base.Ship;
import ru.stoliarenko.gb.lonelycoraptor.screen.MainScreen2D;
import ru.stoliarenko.gb.lonelycoraptor.utils.Assets;

public final class ExplosionEmitter extends ObjectPool<Explosion> {

    private final MainScreen2D gs;
    private final TextureRegion[] imgs;

    public ExplosionEmitter(@NotNull final MainScreen2D gs) {
        this.gs = gs;
        imgs = new TextureRegion[2];
        imgs[0] = Assets.getInstance().getExplosionsAtlas().findRegion("shipExplosion");
        imgs[1] = Assets.getInstance().getExplosionsAtlas().findRegion("bileExplosion");
        addObjectsToFreeList(15);
    }

    @Override
    protected Explosion newObject() {
        return new Explosion(gs, imgs);
    }

    @Override
    public void move(float dt) {
        super.move(dt);
    }

    public void spawn(Explosion.Type type, Vector2 position, Ship owner) {
        getActiveElement().init(type, position, owner);
    }

}
