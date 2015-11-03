package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testingUpdateItemShouldLowerSellInAndQualityValues()
	{ 
		 Item item = new Item(null, 10, 20); 
		 GildedRose.updateItem(item);
		 assertEquals(9, item.getSellIn());
		 assertEquals(19, item.getQuality());
	}
	
	@Test
	public void testingUpdateItemWhenSellInBecomesNegativeShouldLowerQualityTwice()
	{
		Item item = new Item(null, 0, 7);
		GildedRose.updateItem(item);
		assertEquals(-1, item.getSellIn());
		assertEquals(5, item.getQuality());
	}
	
	@Test
	public void testingUpdateItemsShouldNeverLowerQualityToNegative()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item(null, 0, 1));
		items.add(new Item(null, 1, 0));
		GildedRose.updateItems(items);
		assertEquals(0, items.get(0).getQuality());
		assertEquals(0, items.get(1).getQuality());
	}
}