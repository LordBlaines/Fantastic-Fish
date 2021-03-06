// Date: 7/17/2014 3:25:58 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fantastic.renders.models.armor;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFlippers extends ModelBiped
{
  //fields
    ModelRenderer flipper2L;
    ModelRenderer flipper1L;
    ModelRenderer flipper5L;
    ModelRenderer flipper4L;
    ModelRenderer flipper2R;
    ModelRenderer flipper1R;
    ModelRenderer flipper5R;
    ModelRenderer flipper4R;
  
  public ModelFlippers(float f)
  {
	  super(f, 0, 64, 64);
    textureWidth = 64;
    textureHeight = 64;
    
    flipper2L = new ModelRenderer(this, 0, 41);
    flipper2L.addBox(-2F, 11F, -9F, 1, 1, 8);
    flipper2L.setRotationPoint(-0.4F, 0.2F, 0F);
    flipper2L.setTextureSize(64, 64);
    flipper2L.mirror = true;
    setRotation(flipper2L, 0F, 0F, 0F);
    flipper1L = new ModelRenderer(this, 0, 50);
    flipper1L.mirror = true;
    flipper1L.addBox(-2.1F, 10.1F, -2.5F, 5, 2, 5);
    flipper1L.setRotationPoint(-0.4F, 0.2F, 0F);
    flipper1L.setTextureSize(64, 64);
    flipper1L.mirror = true;
    setRotation(flipper1L, 0F, 0F, 0F);
    flipper1L.mirror = false;
    flipper5L = new ModelRenderer(this, 0, 41);
    flipper5L.addBox(1F, 11F, -9F, 1, 1, 8);
    flipper5L.setRotationPoint(-0.4F, 0.2F, 0F);
    flipper5L.setTextureSize(64, 64);
    flipper5L.mirror = true;
    setRotation(flipper5L, 0F, -0.2617994F, 0F);
    flipper4L = new ModelRenderer(this, 0, 57);
    flipper4L.addBox(-2.5F, 11.5F, -8.5F, 5, 0, 7);
    flipper4L.setRotationPoint(-0.4F, 0.2F, 0F);
    flipper4L.setTextureSize(64, 64);
    flipper4L.mirror = true;
    setRotation(flipper4L, 0F, -0.1308997F, 0F);
    flipper2R = new ModelRenderer(this, 0, 41);
    flipper2R.addBox(1F, 11F, -9F, 1, 1, 8);
    flipper2R.setRotationPoint(0.4F, 0.2F, 0F);
    flipper2R.setTextureSize(64, 64);
    flipper2R.mirror = true;
    setRotation(flipper2R, 0F, 0F, 0F);
    flipper1R = new ModelRenderer(this, 0, 50);
    flipper1R.addBox(-2.9F, 10.1F, -2.5F, 5, 2, 5);
    flipper1R.setRotationPoint(0.4F, 0.2F, 0F);
    flipper1R.setTextureSize(64, 64);
    flipper1R.mirror = true;
    setRotation(flipper1R, 0F, 0F, 0F);
    flipper5R = new ModelRenderer(this, 0, 41);
    flipper5R.addBox(-2F, 11F, -9F, 1, 1, 8);
    flipper5R.setRotationPoint(0.4F, 0.2F, 0F);
    flipper5R.setTextureSize(64, 64);
    flipper5R.mirror = true;
    setRotation(flipper5R, 0F, 0.2617994F, 0F);
    flipper4R = new ModelRenderer(this, 0, 57);
    flipper4R.addBox(-2.5F, 11.5F, -8.5F, 5, 0, 7);
    flipper4R.setRotationPoint(0.4F, 0.2F, 0F);
    flipper4R.setTextureSize(64, 64);
    flipper4R.mirror = true;
    setRotation(flipper4R, 0F, 0.1308997F, 0F);
      
      this.bipedLeftLeg.addChild(flipper2L);
      this.bipedLeftLeg.addChild(flipper1L);
      this.bipedLeftLeg.addChild(flipper5L);
      this.bipedLeftLeg.addChild(flipper4L);
      this.bipedRightLeg.addChild(flipper2R);
      this.bipedRightLeg.addChild(flipper1R);
      this.bipedRightLeg.addChild(flipper5R);
      this.bipedRightLeg.addChild(flipper4R);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    

  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
