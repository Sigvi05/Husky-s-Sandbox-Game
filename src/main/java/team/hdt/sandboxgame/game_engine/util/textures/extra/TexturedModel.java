package team.hdt.sandboxgame.game_engine.util.textures.extra;

import org.lwjgl.opengl.GL11;
import textures.ModelTexture;

public class TexturedModel {

    private RawModel rawModel;
    private ModelTexture texture;


    public TexturedModel(RawModel model, ModelTexture texture) {
        this.rawModel = model;
        this.texture = texture;
    }

    public RawModel getRawModel() {
        return rawModel;
    }

    public ModelTexture getTexture() {
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL11.GL_REPEAT);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL11.GL_REPEAT);
        return texture;
    }

}