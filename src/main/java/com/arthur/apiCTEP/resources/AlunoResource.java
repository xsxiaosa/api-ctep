package com.arthur.apiCTEP.resources;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.apiCTEP.entities.Aluno;
import com.arthur.apiCTEP.services.AlunoService;

import java.util.List;

@RestController
@RequestMapping(value="/alunos")
public class AlunoResource extends ResourceGenerico<Aluno, String>{

	private AlunoService alunoService;
	@Autowired
	public AlunoResource(AlunoService alunoService) {
		super(alunoService);
		this.alunoService = (AlunoService) this.service;
	}

	@RequestMapping(value="/gerarMatricula/{ano}&{cursoId}", method= RequestMethod.GET)
	public ResponseEntity<?> listarCursosDeEspecializacao(@PathVariable int ano, @PathVariable int cursoId) {
		String matricula = alunoService.gerarMatricula(ano, cursoId);
        JSONObject json = new JSONObject();

        json.put("data", matricula);

        return ResponseEntity.ok(json);
	}

//	@RequestMapping(value="/salvar", method = RequestMethod.POST)
//	public ResponseEntity<?> salvarAluno(Aluno aluno) {
//		try{
//			alunoService.salvarAluno(aluno);
//			ResponseEntity.ok(true);
//		}
//		catch (Exception e){
//			ResponseEntity.ok(false);
//		}
//
//	}
}
