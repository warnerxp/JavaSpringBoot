package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	@GetMapping(value="/index")
	public String index(ModelMap model) 
	{
		model.addAttribute("titulo",textoIndex);
		return "index";					
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) 
	{
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Steve");
		usuario.setApellido("Rogers");
		usuario.setEmail("warnerxp@outlook.com");
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo",textoPerfil.concat(usuario.getNombre()));
		return "perfil";					
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) 
	{
		model.addAttribute("titulo",textoListar);	
		return "listar";					
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios()
	{

		List<Usuario> usuarios = Arrays.asList(new Usuario("Clark","Kent","kent@aol.com"),
				new Usuario("Lex","Luthor","luthor@gmail.com"),
				new Usuario("Lois","Lane","lane@outlook.com"),
				new Usuario("Lana","Lang","lang@outlook.com"),
				new Usuario("Oliver","Queen","oqueen@gmail.com"));
		
		//List<Usuario> usuarios = new ArrayList<Usuario>();
		//usuarios.add(new Usuario("Clark","Kent","kent@aol.com"));
		//usuarios.add(new Usuario("Lex","Luthor","luthor@gmail.com"));
		//usuarios.add(new Usuario("Lois","Lane","lane@outlook.com"));
		//usuarios.add(new Usuario("Lana","Lang","lang@outlook.com"));
		
		return usuarios;
	}
	
}
