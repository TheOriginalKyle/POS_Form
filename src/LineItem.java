public class LineItem
{

	private Product jvzProduct;
	private int jvzQuantity;

	public LineItem(Product aProduct, int aQuantity)
	{
		jvzProduct = aProduct;
		jvzQuantity = aQuantity;
	}

	public Product getJvzProduct()
	{
		
		// TODO
		// change null to correct value
		// Write the code necessary for this method

		return jvzProduct;

	}

	public void setJvzProduct(Product jvzProduct)
	{
		// TODO
		// Write the code necessary for this method
		this.jvzProduct = jvzProduct;
	}

	public int getJvzQuantity()
	{
		// TODO
		// change 0 to correct value
		// Write the code necessary for this method

		return jvzQuantity;

	}

	public void setJvzQuantity(int jvzQuantity)
	{
		// TODO
		// Write the code necessary for this method
		this.jvzQuantity = jvzQuantity;
	}

	public double getJvzLineTotal()
	{
		// TODO
		// change 0 to correct value
		// Write the code necessary for this method
		// This method returns the total for each line
		// the total is the quantity x price of the product
		double total = jvzProduct.getPrice() * jvzQuantity;

		return total;
	}

}
