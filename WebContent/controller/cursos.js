var cursoModulo = angular.module('cursoModulo',[]);

cursoModulo.controller("cursoController", function($scope, $http) {
	
	urlProfessor = 'http://localhost:8080/Projeto4Final/rest/professores';
	urlCurso = 'http://localhost:8080/Projeto4Final/rest/cursos';
	
	$scope.listarCursos = function() {
		$http.get(urlCurso).success(function (cursos) {
			$scope.cursos = cursos;	
		}).error (function (erro) {
			alert(erro);
		});	
	}
	$scope.listarProfessores = function() {
		$http.get(urlProfessor).success(function (professores) {
			$scope.professores = professores;	
		}).error (function (erro) {
			alert(erro);
		});	
	}
	$scope.selecionacurso = function(cursoSelecionado) {
		$scope.curso = cursoSelecionado;
	}
	$scope.limparCampos = function() {
		$scope.curso = "";
	}
	$scope.salvar = function() {
		if ($scope.curso.codigo == undefined) {
			  $http.post(urlCurso,$scope.curso).success(function(curso) {
		       $scope.limparCampos();
		   }).error (function (erro) {
				alert(erro);
			});
		} else {
			  $http.put(urlCurso,$scope.curso).success(function(curso) {
				  $scope.listarCursos();
			      $scope.limparCampos();
			   }).error (function (erro) {
					alert(erro);
				});	
		}
	}
	$scope.excluir = function() {
		if ($scope.curso.codigo == undefined) {
			alert("Favor selecionar um registro para poder excluir");
		} else {
			$http.delete(urlCurso+'/'+$scope.curso.codigo).success(function () {
				 $scope.listarCursos();
			     $scope.limparCampos();
			  }).error (function (erro) {
					alert(erro);
				});	
		}
	}
	//executa
	$scope.listarCursos();
	$scope.listarProfessores();
});





