package com.paneedah.weaponlib.ai;

import com.paneedah.weaponlib.compatibility.CompatibleEntityAIBase;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIDelayedAttack extends CompatibleEntityAIBase {
    
    private EntityCustomMob entityCustomMob;
    private EntityLivingBase targetEntity;

    public EntityAIDelayedAttack(EntityCustomMob entityCustomMob) {
        this.entityCustomMob = entityCustomMob;
        this.setMutexBits(1);
    }
    
    public boolean shouldExecute() {
        EntityLivingBase entitylivingbase = this.entityCustomMob.getAttackTarget();
        return entityCustomMob.getDelayedAttackTimerIncrement() > 0 || entitylivingbase != null 
                && this.entityCustomMob.getDistanceSqToEntity(entitylivingbase) < 9.0D;
    }

    public void startExecuting() {
        this.entityCustomMob.getNavigator().clearPathEntity();
        this.targetEntity = this.entityCustomMob.getAttackTarget();
    }

    public void resetTask() {
        this.targetEntity = null;
    }

    public void updateTask() {
        if (targetEntity == null) {
            entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else if (entityCustomMob.getDistanceSqToEntity(targetEntity) > 49.0D) {
            entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else if (!entityCustomMob.getEntitySenses().canSee(targetEntity)) {
            entityCustomMob.setDelayedAttackTimerIncrement(-1);
        } else {
            entityCustomMob.setDelayedAttackTimerIncrement(1);
        }
    }

    @Override
    public boolean shouldContinueExecuting() {
        return (shouldExecute() || !entityCustomMob.getNavigator().noPath());
    }

   

}
