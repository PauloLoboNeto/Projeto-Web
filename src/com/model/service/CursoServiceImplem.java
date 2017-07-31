package com.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.model.dao.CursoDaoInterface;
import com.model.model.CursoModel;



public class CursoServiceImplem implements CursoServiceInterface {

	@Inject
	private CursoDaoInterface cursoDaoInterface;
	
	
	@Override
	public List<CursoModel> getCursos() {
		return cursoDaoInterface.getCursos();
	}
	
	@Override
	@Transactional
	public CursoModel salvarCurso(CursoModel cursoModel) {
		return cursoDaoInterface.salvarCurso(cursoModel);
	}

	@Override
	@Transactional
	public void alterar(CursoModel cursoModel) {
		cursoDaoInterface.alterar(cursoModel);
	}

	@Override
	@Transactional
	public void excluir(CursoModel cursoModel) {
		cursoDaoInterface.excluir(cursoModel);
	}




}
