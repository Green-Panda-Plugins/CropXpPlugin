package green.misc.Events;

import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.block.data.Ageable;

public class CropXpEvents implements Listener {

    @EventHandler
    public static void OnBreakCrop(BlockBreakEvent event){
        ItemStack item = event.getPlayer().getInventory().getItemInMainHand();
        BlockData bd = event.getBlock().getBlockData();

        try{
            // has item
            if(item != null){
                // is crop
                if(bd instanceof Ageable){
                    Ageable age = (Ageable) bd;
                    // is grown
                    if(age.getAge() == age.getMaximumAge()){
                        // is hoe
                        if(item.getType() == Material.WOODEN_HOE){
                            ExperienceOrb xp = (ExperienceOrb) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.EXPERIENCE_ORB);
                            xp.setExperience(1);
                        }
                        else if(item.getType() == Material.STONE_HOE){
                            ExperienceOrb xp = (ExperienceOrb) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.EXPERIENCE_ORB);
                            xp.setExperience(3);
                        }
                        else if(item.getType() == Material.IRON_HOE){
                            ExperienceOrb xp = (ExperienceOrb) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.EXPERIENCE_ORB);
                            xp.setExperience(5);
                        }
                        else if(item.getType() == Material.GOLDEN_HOE){
                            ExperienceOrb xp = (ExperienceOrb) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.EXPERIENCE_ORB);
                            xp.setExperience(7);
                        }
                        else if(item.getType() == Material.DIAMOND_HOE){
                            ExperienceOrb xp = (ExperienceOrb) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.EXPERIENCE_ORB);
                            xp.setExperience(9);
                        }
                        else if(item.getType() == Material.NETHERITE_HOE){
                            ExperienceOrb xp = (ExperienceOrb) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.EXPERIENCE_ORB);
                            xp.setExperience(11);
                        }

                    }
                }

            }

        }catch (Exception e){
            // Nothing here
        }
    }
}
