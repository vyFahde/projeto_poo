package com.example.blabla_car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")

public class CategoryController {

    @GetMapping
    public String index(Model model) {
        return "categorias/index";
    }

    @GetMapping("/cadastrar")
    public String exibirFormularioCadastro() {
        return "categorias/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable Long id, Model model) {
        Category categoria = categoryService.buscarPorId(id);
        if (categoria == null) {
            return "redirect:/categorias";
        }
        model.addAttribute("categoria", categoria);
        return "categorias/editar";
    }
}
