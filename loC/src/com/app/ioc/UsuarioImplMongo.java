package com.app.ioc;

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Mongo");

	}

	@Override
	public void eliminaUsarioById(int id) {
		System.out.println("Eliminando usuario en Mongo: " + id);

	}

}
