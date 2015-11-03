package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testingUpdateItemsShouldLowerSellInAndQualityValuesForEveryItems()
	{ 
		 Item item = new Item("+5 Dexterity Vest", 10, 20); 
		 GildedRose.updateItem(item);
		 assertEquals(9, item.getSellIn());
		 assertEquals(19, item.getQuality());
	}
	
	@Test
	public void testingUpdateItemsWhenSellInBecomesNegativeShouldLowerQualityTwice()
	{
		Item item = new Item("Elixir of the Mongoose", 0, 7);
		GildedRose.updateItem(item);
		assertEquals(-1, item.getSellIn());
		assertEquals(5, item.getQuality());
	}
	
	@Test
	public void testingUpdateItemsShouldNeverLowerQualityToNegative()
	{
		Item item = new Item("Elixir of the Mongoose", 0, 1);
		GildedRose.updateItem(item);
		assertEquals(0, item.getQuality());
	}
}