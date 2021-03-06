// Date: 7/24/2014 8:15:32 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fantastic.renders.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDiverBoots extends ModelBiped
{
  //fields
    ModelRenderer boot1L;
    ModelRenderer boot4L;
    ModelRenderer boot2L;
    ModelRenderer boot3L;
    ModelRenderer boot1R;
    ModelRenderer boot4R;
    ModelRenderer boot2R;
    ModelRenderer boot3R;
  
  public ModelDiverBoots(float f)
  {
	  super(f, 0, 64, 128);
    textureWidth = 64;
    textureHeight = 128;
    
      boot1L = new ModelRenderer(this, 0, 100);
      boot1L.addBox(-2F, 7F, -2.5F, 5, 5, 5);
      boot1L.setRotationPoint(0F, 0F, 0F);
      boot1L.setTextureSize(64, 128);
      boot1L.mirror = true;
      setRotation(boot1L, 0F, 0F, 0F);
      boot4L = new ModelRenderer(this, 0, 110);
      boot4L.addBox(-2.5F, 9.5F, -1F, 6, 2, 2);
      boot4L.setRotationPoint(0F, 0F, 0F);
      boot4L.setTextureSize(64, 128);
      boot4L.mirror = true;
      setRotation(boot4L, 0F, 0F, 0F);
      boot2L = new ModelRenderer(this, 20, 105);
      boot2L.addBox(-2F, 9F, -3.5F, 5, 3, 1);
      boot2L.setRotationPoint(0F, 0F, 0F);
      boot2L.setTextureSize(64, 128);
      boot2L.mirror = true;
      setRotation(boot2L, 0F, 0F, 0F);
      boot3L = new ModelRenderer(this, 17, 100);
      boot3L.addBox(-1.5F, 10.1F, -4F, 4, 2, 1);
      boot3L.setRotationPoint(0F, 0F, 0F);
      boot3L.setTextureSize(64, 128);
      boot3L.mirror = true;
      setRotation(boot3L, 0F, 0F, 0F);
      boot1R = new ModelRenderer(this, 0, 100);
      boot1R.mirror = true;
      boot1R.addBox(-3F, 7F, -2.5F, 5, 5, 5);
      boot1R.setRotationPoint(0F, 0F, 0F);
      boot1R.setTextureSize(64, 128);
      boot1R.mirror = true;
      setRotation(boot1R, 0F, 0F, 0F);
      boot1R.mirror = false;
      boot4R = new ModelRenderer(this, 0, 110);
      boot4R.mirror = true;
      boot4R.addBox(-3.5F, 9.5F, -1F, 6, 2, 2);
      boot4R.setRotationPoint(0F, 0F, 0F);
      boot4R.setTextureSize(64, 128);
      boot4R.mirror = true;
      setRotation(boot4R, 0F, 0F, 0F);
      boot4R.mirror = false;
      boot2R = new ModelRenderer(this, 20, 105);
      boot2R.mirror = true;
      boot2R.addBox(-3F, 9F, -3.5F, 5, 3, 1);
      boot2R.setRotationPoint(0F, 0F, 0F);
      boot2R.setTextureSize(64, 128);
      boot2R.mirror = true;
      setRotation(boot2R, 0F, 0F, 0F);
      boot2R.mirror = false;
      boot3R = new ModelRenderer(this, 17, 100);
      boot3R.mirror = true;
      boot3R.addBox(-2.5F, 10.1F, -4F, 4, 2, 1);
      boot3R.setRotationPoint(0F, 0F, 0F);
      boot3R.setTextureSize(64, 128);
      boot3R.mirror = true;
      setRotation(boot3R, 0F, 0F, 0F);
      boot3R.mirror = false;
      
      
      this.bipedLeftLeg.addChild(boot1L);
      this.bipedLeftLeg.addChild(boot4L);
      this.bipedLeftLeg.addChild(boot2L);
      this.bipedLeftLeg.addChild(boot3L);
      this.bipedRightLeg.addChild(boot1R);
      this.bipedRightLeg.addChild(boot4R);
      this.bipedRightLeg.addChild(boot2R);
      this.bipedRightLeg.addChild(boot3R);
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
