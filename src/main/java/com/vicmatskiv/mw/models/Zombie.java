// Date: 10/13/2019 12:56:30 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class Zombie extends ModelBiped
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
    public Zombie()
    {
        this(0.0F);
    }

    public Zombie(float p_i1148_1_)
    {
        this(p_i1148_1_, 0.0F, 128, 128);
    }

    public Zombie(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_)
    {
        this.textureWidth = p_i1149_3_;
        this.textureHeight = p_i1149_4_;
//        this.bipedCloak = new ModelRenderer(this, 0, 0);
//        this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1149_1_);
//        this.bipedEars = new ModelRenderer(this, 24, 0);
//        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1149_1_);
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(0F, 0F, 0F);
      rightarm.setTextureSize(128, 128);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(0F, 0F, 0F);
      leftarm.setTextureSize(128, 128);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(0F, 0F, 0F);
      rightleg.setTextureSize(128, 128);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(0F, 0F, 0F);
      leftleg.setTextureSize(128, 128);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + p_i1149_2_, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + p_i1149_2_, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + p_i1149_2_, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + p_i1149_2_, 0.0F);
      this.bipedHead = new ModelRenderer(this, 0, 0);
      this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 0, 0, 0, p_i1149_1_);
      this.bipedHead.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
      this.bipedBody = new ModelRenderer(this, 16, 16);
      this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedBody.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
      
      this.bipedRightArm.addChild(rightarm);
      this.bipedLeftArm.addChild(leftarm);
      this.bipedBody.addChild(body);
      this.bipedHead.addChild(head);
      this.bipedLeftLeg.addChild(leftleg);
      this.bipedRightLeg.addChild(rightleg);
  }

  /**
   * Sets the models various rotation angles then renders the model.
   */
  public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
  {
      this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);

      if (this.isChild)
      {
          float f6 = 2.0F;
          GL11.glPushMatrix();
          GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
          GL11.glTranslatef(0.0F, 16.0F * p_78088_7_, 0.0F);
          this.bipedHead.render(p_78088_7_);
          GL11.glPopMatrix();
          GL11.glPushMatrix();
          GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
          GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
          this.bipedBody.render(p_78088_7_);
          this.bipedRightArm.render(p_78088_7_);
          this.bipedLeftArm.render(p_78088_7_);
          this.bipedRightLeg.render(p_78088_7_);
          this.bipedLeftLeg.render(p_78088_7_);
          this.bipedHeadwear.render(p_78088_7_);
          GL11.glPopMatrix();
      }
      else
      {
          this.bipedHead.render(p_78088_7_);
          this.bipedBody.render(p_78088_7_);
          this.bipedRightArm.render(p_78088_7_);
          this.bipedLeftArm.render(p_78088_7_);
          this.bipedRightLeg.render(p_78088_7_);
          this.bipedLeftLeg.render(p_78088_7_);
          this.bipedHeadwear.render(p_78088_7_);
      }
  }

  /**
   * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
   * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
   * "far" arms and legs can swing at most.
   */
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
      this.bipedHead.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
      this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
      this.bipedRightArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
      this.bipedLeftArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
      this.bipedRightArm.rotateAngleZ = 0.0F;
      this.bipedLeftArm.rotateAngleZ = 0.0F;
      this.bipedRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
      this.bipedLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
      this.bipedRightLeg.rotateAngleY = 0.0F;
      this.bipedLeftLeg.rotateAngleY = 0.0F;

      if (this.isRiding)
      {
          this.bipedRightArm.rotateAngleX += -((float)Math.PI / 5F);
          this.bipedLeftArm.rotateAngleX += -((float)Math.PI / 5F);
          this.bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
          this.bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
          this.bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
          this.bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
      }

//      if (this.leftArmPose == ArmPose.ITEM)
//      {
//          this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
//      }
//
//      if (this.rightArmPose == ArmPose.ITEM)
//      {
//          this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
//      }

      this.bipedRightArm.rotateAngleY = 0.0F;
      this.bipedLeftArm.rotateAngleY = 0.0F;
      float f6;
      float f7;

//      if (this.onGround > -9990.0F)
//      {
//          f6 = this.onGround;
//          this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
//          this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
//          this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
//          this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
//          f6 = 1.0F - this.onGround;
//          f6 *= f6;
//          f6 *= f6;
//          f6 = 1.0F - f6;
//          f7 = MathHelper.sin(f6 * (float)Math.PI);
//          float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
//          this.bipedRightArm.rotateAngleX = (float)((double)this.bipedRightArm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
//          this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
//          this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
//      }

      if (this.isSneak)
      {
          this.bipedBody.rotateAngleX = 0.5F;
          this.bipedRightArm.rotateAngleX += 0.4F;
          this.bipedLeftArm.rotateAngleX += 0.4F;
          this.bipedRightLeg.rotationPointZ = 4.0F;
          this.bipedLeftLeg.rotationPointZ = 4.0F;
          this.bipedRightLeg.rotationPointY = 9.0F;
          this.bipedLeftLeg.rotationPointY = 9.0F;
          this.bipedHead.rotationPointY = 1.0F;
          this.bipedHeadwear.rotationPointY = 1.0F;
      }
      else
      {
          this.bipedBody.rotateAngleX = 0.0F;
          this.bipedRightLeg.rotationPointZ = 0.1F;
          this.bipedLeftLeg.rotationPointZ = 0.1F;
          this.bipedRightLeg.rotationPointY = 12.0F;
          this.bipedLeftLeg.rotationPointY = 12.0F;
          this.bipedHead.rotationPointY = 0.0F;
          this.bipedHeadwear.rotationPointY = 0.0F;
      }

      this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
      this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
      this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
      this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;

//      if (this.aimedBow)
//      {
//          f6 = 0.0F;
//          f7 = 0.0F;
//          this.bipedRightArm.rotateAngleZ = 0.0F;
//          this.bipedLeftArm.rotateAngleZ = 0.0F;
//          this.bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F) + this.bipedHead.rotateAngleY;
//          this.bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F + this.bipedHead.rotateAngleY + 0.4F;
//          this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
//          this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
//          this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
//          this.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
//          this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
//          this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
//          this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
//          this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
//      }
  }

//  /**
//   * renders the ears (specifically, deadmau5's)
//   */
//  public void renderEars(float p_78110_1_)
//  {
//      this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
//      this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
//      this.bipedEars.rotationPointX = 0.0F;
//      this.bipedEars.rotationPointY = 0.0F;
//      this.bipedEars.render(p_78110_1_);
//  }

//  /**
//   * Renders the cloak of the current biped (in most cases, it's a player)
//   */
//  public void renderCloak(float p_78111_1_)
//  {
//      this.bipedCloak.render(p_78111_1_);
//  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
  }

}