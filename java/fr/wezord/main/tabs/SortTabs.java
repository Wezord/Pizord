package fr.wezord.main.tabs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import fr.wezord.main.Main;
import fr.wezord.main.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class SortTabs{
	
	ItemsMod im;
	
	List<Item> myItemsInOrder = Arrays.asList(im.sword,im.peau, im.pfee, im.pguerison, im.pmana, im.pneutre, im.porange, im.psimple, im.pvide, im.pvie, im.pvitesse, im.ginsengrootpotion
			,im.gpeau, im.gpmana, im.gpneutre ,im.gpvide , im.gpvie, im.gpvitesse, im.pbenie, im.pdivine, im.pdoree, im.pdraco, im.anciennepotion, im.fbleu, im.fcyan, im.fgris, im.fjaune, im.forange,
			im.frose, im.frouge, im.fvert, im.fviolet, im.samber, im.sblue, im.sgreen, im.spurple, im.sred, im.swhite, im.egggreen, im.eggyellow,
			 im.monstersack, im.objet1, im.objet2, im.objet3, im.objet4, im.objet5, im.objet6, im.paquet, im.pierreinvocation,  im.pclaire);
	Comparator<ItemStack> c = Ordering.explicit(myItemsInOrder).onResultOf(ItemStack::getItem);
	
}
