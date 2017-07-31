/**
 * 
 */
package com.model.service;

import java.util.List;

import com.model.model.CursoModel;

/**
 * @author Paulo
 *
 */
public interface CursoServiceInterface {
	CursoModel salvarCurso(CursoModel cursoModel);
	void alterar(CursoModel cursoModel);
	void excluir(CursoModel cursoModel);
	List<CursoModel> getCursos();
}
