package com.example.modelo;

public class Noticia {
	private String titulo;
	private String bajada;
	private String imgUrl;
	
	//Constructor vacio.
	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructor con atributos.
	public Noticia(String titulo, String bajada, String imgUrl) {
		super();
		this.titulo = titulo;
		this.bajada = bajada;
		this.imgUrl = imgUrl;
	}

	
	
	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBajada() {
		return bajada;
	}

	public void setBajada(String bajada) {
		this.bajada = bajada;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	
	
	//Metodo ToString
	
	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", bajada=" + bajada + ", imgUrl=" + imgUrl + "]";
	}
	
	
	 
	


}
