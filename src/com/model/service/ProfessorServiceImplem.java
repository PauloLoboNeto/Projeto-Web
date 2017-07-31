package com.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.model.dao.ProfessorDaoInterface;
import com.model.model.ProfessorModel;



public class ProfessorServiceImplem implements ProfessorServiceInterface {

	@Inject
	private ProfessorDaoInterface professorDaoInterface;
	
	
	@Override
	public List<ProfessorModel> getProfessores() {
		return professorDaoInterface.getProfessores();
	}
	
	@Override
	@Transactional
	public ProfessorModel salvarProfessor(ProfessorModel professorModel) {
		return professorDaoInterface.salvarProfessor(professorModel);
	}

	@Override
	@Transactional
	public void alterar(ProfessorModel professorModel) {
		professorDaoInterface.alterar(professorModel);
	}

	@Override
	@Transactional
	public void excluir(ProfessorModel professorModel) {
		professorDaoInterface.excluir(professorModel);
	}




}
