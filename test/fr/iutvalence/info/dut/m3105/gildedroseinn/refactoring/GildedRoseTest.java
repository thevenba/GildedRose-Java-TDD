package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testingUpdateItemsShouldLowerSellInAndQualityValuesForEveryItems()
	{
		 ArrayList<Item> items = new ArrayList<Item>(); 
		 items.add(new Item("+5 Dexterity Vest", 10, 20)); 
		 items.add(new Item("Elixir of the Mongoose", 5, 7));
		 GildedRose.updateItems(items);
		 assertEquals(9, items.get(0).getSellIn());
		 assertEquals(19, items.get(0).getQuality());
		 assertEquals(4, items.get(1).getSellIn());
		 assertEquals(6, items.get(1).getQuality()); 
	}

}