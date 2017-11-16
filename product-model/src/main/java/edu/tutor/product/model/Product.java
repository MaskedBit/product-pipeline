package edu.tutor.product.model;

import java.math.BigDecimal;

public class Product
{
	private String productId;
	private StockKeepingUnit sku;
	private String description;
	private BigDecimal stockPrice;
	private BigDecimal standardMarkup;
	private int reorderLevel;
	
	public Product()
	{
		;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public StockKeepingUnit getSku() {
		return sku;
	}

	public void setSku(StockKeepingUnit sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(BigDecimal stockPrice) {
		this.stockPrice = stockPrice;
	}

	public BigDecimal getStandardMarkup() {
		return standardMarkup;
	}

	public void setStandardMarkup(BigDecimal standardMarkup) {
		this.standardMarkup = standardMarkup;
	}

	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

}
