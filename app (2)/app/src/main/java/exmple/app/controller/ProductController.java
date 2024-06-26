package exmple.app.controller;

import exmple.app.entity.Product;
import exmple.app.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String findAll(Model model){
        List<Product> products = this.repository.findAll();

        model.addAttribute("products", products);
        return "product-list";
    }
    @GetMapping("/new")
    public String getForm(Model model){
        model.addAttribute("products",new Product());
        return "product-form";
    }
    @PostMapping
    public String save(@ModelAttribute("product") Product product){
        this.repository.save(product);
        return "redirect:/products";
    }



}
