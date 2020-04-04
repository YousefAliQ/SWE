package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {
	ArrayList<CartLine> items = new ArrayList<CartLine>();

	public void addProduct(Product product) {
		
		if (isItemExist(product)) {
			increaseItemQuantity(product);
		}else {
			CartLine itemLine = new CartLine();
			itemLine.setProduct(product);
			itemLine.setQuantity(1);
			items.add(itemLine);
		}
		
	}
	
	public void removeProduct(Product product) {
		
		if (isItemExist(product)) {
			decreaseItemQuantity(product);
			removeZeroQuantityItem(product);
		}
	}

	public void printShoppingcart() {
		System.out.println("Content of the shoppingcart:");
		for (CartLine itemLine : items) {
			System.out.println(itemLine.getQuantity() + " "
					+ itemLine.getProduct().getProductnumber() + " "
					+ itemLine.getProduct().getDescription() + " "
					+ itemLine.getProduct().getPrice());
		}
		System.out.println("Total price ="+getTotal());
	}

	public double getTotal(){
		double totalPrice = 0.0;
		for (CartLine item : items) {
			totalPrice=totalPrice+ getItemPrice(item);
		}
		return totalPrice;
	}
	
	private double getItemPrice(CartLine item) {
		return item.getProduct().getPrice() * item.getQuantity();
	}
	

	public boolean isItemExist(Product product){
		CartLine itemLine = getItemLine(product);
		if( itemLine == null ) return false;
		return true;
	}
	
	public void increaseItemQuantity(Product product) {
		CartLine itemLine = getItemLine(product);
		itemLine.setQuantity(itemLine.getQuantity()+1);
	}
	
	public void decreaseItemQuantity(Product product) {
		CartLine itemLine = getItemLine(product);
		itemLine.setQuantity(itemLine.getQuantity()-1);
	}
	
	private void removeZeroQuantityItem(Product product) {
		Iterator<CartLine> item = items.iterator();
		while (item.hasNext()){
			CartLine itemLine = item.next();
			if (isProductEqual(itemLine, product)){
					item.remove();
			}
		}
	}
	
	private boolean isProductEqual(CartLine itemLine, Product product) {
		return itemLine.getProduct().getProductnumber().equals(product.getProductnumber());
	}
	
	private CartLine getItemLine( Product product) {
		for (CartLine itemLine : items) {
			if (isProductEqual(itemLine, product)) {
				return itemLine;
			}
		}
		return null;
	}
}
