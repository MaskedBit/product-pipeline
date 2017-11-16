package edu.tutor.product.model;

public class StockKeepingUnit
{
	private static int nextSku = 1;

	private final String sku;
	
	private StockKeepingUnit(String sku)
	{
		this.sku = sku;
	}

	public static StockKeepingUnit generateSku()
	{
		String sku = String.format("LN%d", nextSku++);
		
		return (new StockKeepingUnit(sku));
	}

	public static StockKeepingUnit valueOf(String sku)
	{
		return (new StockKeepingUnit(sku));
	}

	@Override
	public String toString()
	{
		return (sku);
	}

}
