package br.ufrn.imd.modelo;

public class Fornecedor {
	
	private int codigoFornecedor;
	private String nomeFornecedor;
	private String cnpjFornecedor;
	
	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}
	
	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
	
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	
	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}
	
	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}
}
