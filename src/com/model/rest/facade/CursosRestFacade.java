package com.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.model.CursoModel;
import com.model.service.CursoServiceInterface;


@Path("/cursos")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class CursosRestFacade {
	
	/*
	@Inject
	private CursoDaoImplem cursoDaoImplem;
	
	@GET
	public List<CursoModel> getCursoes(){
	return cursoDaoImplem.getCursoes();
	}*/
	
	@Inject
	private CursoServiceInterface cursoServiceInterface;
	
	@GET
	public List<CursoModel> getCursos(){
	return cursoServiceInterface.getCursos();
	}
	
	@POST
	public CursoModel salvarCurso(CursoModel cursoModel){
		return cursoServiceInterface.salvarCurso(cursoModel);
	}
	
	@PUT
	public void  atualizar(CursoModel cursoModel){
		cursoServiceInterface.alterar(cursoModel);
	}
	
	@DELETE
	@Path("/{codigoCurso}")
	public void excluir(@PathParam("codigoCurso")Integer codigoCurso){
		CursoModel cursoModel = new CursoModel();
		cursoModel.setCodigo(codigoCurso);
		cursoServiceInterface.excluir(cursoModel);
	}
	
}
