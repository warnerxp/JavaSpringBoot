package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller 
@RequestMapping("/app")
public class IndexController {

	//@RequestMapping(value="/index",method = RequestMethod.GET)
	/*
	 * @GetMapping(value="/index") public String index(Model model) {
	 * model.addAttribute("titulo","Hola Spring Framework!!"); return "index"; }
	 */
	
	@GetMapping(value="/index")
	public String index(ModelMap model) 
	{
		model.addAttribute("titulo","Hola Spring Frameworkkkkkk!!");
		return "index";					
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) 
	{
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Steve");
		usuario.setApellido("Rogers");
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo","Perfil del usuario:".concat(usuario.getNombre()));
		return "perfil";					
	}
	
}
