package pro.sky.skyprospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospring.Service.CartService;

import java.util.Collection;
import java.util.Set;

@RestController
@RequestMapping("")
public class CartController {
    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> ids) {
        service.add(ids);
    }
    @GetMapping("/get")
    public Collection<Integer> get() {
        return service.get();
    }



}
