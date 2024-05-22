package br.ufrn.imd.modelo;

public class Produto {
	
	private int codigoProduto;
	private String descricaoProduto;
	private String unidadeProduto;
	private double valorProduto;
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	public String getUnidadeProduto() {
		return unidadeProduto;
	}
	
	public void setUnidadeProduto(String unidadeProduto) {
		this.unidadeProduto = unidadeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
}
