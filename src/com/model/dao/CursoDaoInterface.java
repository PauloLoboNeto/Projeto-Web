/**
 * 
 */
package com.model.dao;

import java.util.List;

import com.model.model.CursoModel;

/**
 * @author Paulo
 *
 */
public interface CursoDaoInterface {
	CursoModel salvarCurso(CursoModel cursoModel);
	void alterar(CursoModel cursoModel);
	void excluir(CursoModel cursoModel);
	List<CursoModel> getCursos();
}
