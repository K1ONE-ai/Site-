package CadastroLivro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @GetMapping
    public String mostrarHome(){
        return "index";
    }
    @GetMapping("/form")
    public String mostrarForm(){
        return "form";
    }
    @PostMapping("/livro")
    public String mostraLivros(@ModelAttribute Livro livro, Model model){
        model.addAttribute("nome", livro);
        model.addAttribute("autor", livro);
        model.addAttribute("descricao", livro);
        return "livro";
    }


}