package com.project.InfyShop.dto;


import com.project.InfyShop.entity.Subscribedproduct;

public class SubscribedproductDTO {
	int buyerId;
	int prodId;
	int quantity;
	
	
	public SubscribedproductDTO() {
		super();
	}
	
	public SubscribedproductDTO( int buyerId, int prodId, int quantity) {
		super();
		this.buyerId = buyerId;
		this.prodId = prodId;
		this.quantity = quantity;
	}

	
	

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
		public static SubscribedproductDTO valueOf(Subscribedproduct subscribedproduct) {
			SubscribedproductDTO subscribedproductDTO = new SubscribedproductDTO();
			subscribedproductDTO.setBuyerId(subscribedproduct.getBuyerId());
			subscribedproductDTO.setProdId(subscribedproduct.getProdId());
			subscribedproductDTO.setQuantity(subscribedproduct.getQuantity());
			return subscribedproductDTO;
		}
		
		
		public Subscribedproduct createEntity() {
			Subscribedproduct subscribedproduct = new Subscribedproduct();
			subscribedproduct.setBuyerId(this.getBuyerId());
			subscribedproduct.setProdId(this.getProdId());
			subscribedproduct.setQuantity(this.getQuantity());
			return subscribedproduct;
		}

		@Override
		public String toString() {
			return "SubscribedproductDTO [ buyerId=" + buyerId + ", prodId=" + prodId
					+ ", quantity=" + quantity + "]";
		}
	
}	