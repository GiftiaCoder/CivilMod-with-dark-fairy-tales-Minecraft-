package poi.giftiacoder.civil_mod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import poi.giftiacoder.civil_mod.block.BlockChunkData;

@EventBusSubscriber
public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<>();
	
	public static final Block CHUNK_DATA = new BlockChunkData();
}
